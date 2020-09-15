package javaPractice.RPC.second;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCTest {
    public static void main(String[] args)  throws IOException{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server serviceServer = new ServerCenter(8089);
                    serviceServer.register(HelloService.class,HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }){

        }.start();
        HelloService service = RPCClient.getRemotteProxyObject(HelloService.class, new InetSocketAddress("localhost",8089));
        System.out.println(service.sayHi("test"));

    }


}
