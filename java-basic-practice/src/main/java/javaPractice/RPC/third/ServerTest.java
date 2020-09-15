package javaPractice.RPC.third;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 建立TCP连接：服务端
 */
public class ServerTest {
    public static void main(String[] args) {
        try{
            //服务端 监听10001端口号
            ServerSocket serverSocket = new ServerSocket(50001);
            //服务端创建出与客户端通信的新的socket ，这个socket与serverSocket不同，socket与客户通信，serverSocket等待新的连接
            //socket与客户通信，等待与客户连接，一直阻塞，知道有客户的请求来的时候
            Socket socket = serverSocket.accept();//!!!!!!!!!!
            System.out.println("connect"+ socket.getRemoteSocketAddress());
            //从socket中读取数据
            InputStream inputStream = socket.getInputStream();
            byte[]  byte1 = new byte[1024];
            //将读取的流转为int型
            int length = inputStream.read(byte1);
            System.out.println(length + "bytes received");
            //关闭流
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
