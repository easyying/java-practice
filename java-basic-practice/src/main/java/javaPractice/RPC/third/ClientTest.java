package javaPractice.RPC.third;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * 建立TCP连接：客户端
 * 1.先开启服务
 * 2.然后测试服务开启没  终端命令
 * 3.然后启动客户端
 * 4.然后看服务端的值
 */
public class ClientTest {
    public static void main(String[] args) {
        try{
            //建立TCP连接
            Socket socket = new Socket();
            SocketAddress remoteAddr=new InetSocketAddress("localhost",50001);
            socket.connect(remoteAddr);
            //发送数据
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[2];
            //将数据转为二进制流
            outputStream.write(bytes);
            System.out.println("连接地址"+ socket.getRemoteSocketAddress());
            //关闭流
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
