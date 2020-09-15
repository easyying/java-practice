package javaPractice.RPC.First;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 一.服务端
 * 3. 服务发布者
 */
public class RpcExporter {
    private static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static void exporter(String hostname, int port) throws Exception{
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(hostname,port));
        try{
            while (true){
                executor.execute(new ExporterTasks(serverSocket.accept()));
            }
        }finally {
            serverSocket.close();
        }

    }

    private static class ExporterTasks implements Runnable{
        Socket client = null;
        public ExporterTasks(Socket client){
            this.client = client;
        }

        @Override
        public void run() {
            ObjectInputStream input = null;
            ObjectOutputStream out = null;
            try{
                input = new ObjectInputStream(client.getInputStream());
                String interfaceName = input.readUTF();
                Class<?> service = Class.forName(interfaceName);
                String methodName = input.readUTF();
                Class<?>[]  paramsType = (Class<?> []) input.readObject();
                Object[] args  = (Object[]) input.readObject();
                Method method = service.getMethod(methodName,paramsType);
                Object result = method.invoke(service.newInstance(),args);
                out = new ObjectOutputStream(client.getOutputStream());
                out.writeObject(result);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    if(out != null){
                       out.close();
                    }
                    if(input != null){
                        input.close();
                    }
                    if(client != null){
                        client.close();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }

    }


}
