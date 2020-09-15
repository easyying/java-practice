package javaPractice.RPC.First;

import java.net.InetSocketAddress;

public class Test {
    public static void main(String[] args) {
       /* new Thread(() -> {
            try {
                RpcExporter.exporter("127.0.0.1", 8088);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        RpcImporter<EchoService> importer = new RpcImporter<>();
        EchoService echoService = (EchoService)importer.importer(EchoServiceImpl.class, new InetSocketAddress("127.0.0.1", 8088));
        System.out.println(echoService.sayHello("peter"));*/



    }
}
