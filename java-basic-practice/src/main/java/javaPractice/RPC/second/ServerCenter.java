package javaPractice.RPC.second;

import com.sun.corba.se.impl.io.IIOPInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 2. 服务中心实现类
 * 运行在服务器端，负责将本地服务发布成远程服务，管理远程服务，提供给服务消费者使用
 */

public class ServerCenter implements  Server {
    public static ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static final HashMap<String,Class> serviceRegister = new HashMap<>();

    public boolean isRunning = false;
    public static int port;

    public ServerCenter(int port){
        this.port = port;
    }

    @Override
    public void stop() {
        isRunning = false;
        executor.shutdown();
    }

    @Override
    public void start() throws IOException {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(port));
        System.out.println("start server");
        try{
            while (true){
                // 1.监听客户端的TCP连接，接到TCP连接后将其封装成task，由线程池执行
                executor.execute(new ServiceTask(server.accept()));
            }

        }finally {
            server.close();
        }
    }

    @Override
    public void register(Class serverInterface, Class impl) {
        serviceRegister.put(serverInterface.getName(),impl);
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public int getPort() {
        return port;
    }

    private static class ServiceTask implements Runnable{
        Socket client = null;
        public ServiceTask(Socket client){
            this.client = client;
        }

        @Override
        public void run()  {
            ObjectInputStream input = null;
            ObjectOutputStream output = null;
            try{
                // 2.将客户端发送的码流反序列化成对象，反射调用服务实现者，获取执行结果
                input =  new ObjectInputStream(client.getInputStream());
                String serviceName = input.readUTF();
                String methodnMame = input.readUTF();
                Class<?> [] parameterTypes = (Class<?> [])input.readObject();
                Object[]  arguments = (Object[] )input.readObject();
                Class serviceClass = serviceRegister.get(serviceName);
                if(serviceClass == null){
                    throw new ClassNotFoundException(serviceName + "not found");
                }
                Method method = serviceClass.getMethod(methodnMame,parameterTypes);
                Object result = method.invoke(serviceClass.newInstance(),arguments);

                // 3.将执行结果反序列化，通过socket发送给客户端
                output = new ObjectOutputStream(client.getOutputStream());
                output.writeObject(result);

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(output != null){
                    try{
                        output.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                if(input != null){
                    try{
                        input.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

                if(client != null){
                    try{
                        client.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}

