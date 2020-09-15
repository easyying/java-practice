package javaPractice.RPC.First;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 二.客户端
 * 1. 本地代理
 */
public class RpcImporter<S> {
    /* public S importer(final Classya<?> serviceClass, final InetSocketAddress address) {
       return (S) Proxy.newProxyInstance(serviceClass.getClassLoader(),
                new Classya<?>[]{serviceClass.getInterfaces()[0]},
                (proxy, method, args) -> { Socket socket = null;
                ObjectOutputStream outputStream = null;
                ObjectInputStream inputStream = null;
                try {
                    socket = new Socket();
                    socket.connect(address);
                    outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeUTF(serviceClass.getName());
                    outputStream.writeUTF(method.getName());
                    outputStream.writeObject(method.getParameterTypes());
                    outputStream.writeObject(args);
                    inputStream = new ObjectInputStream(socket.getInputStream());
                    return inputStream.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if(outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } return null;
        });
    }
*/
}
