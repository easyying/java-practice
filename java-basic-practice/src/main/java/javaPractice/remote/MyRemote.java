package javaPractice.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 1.创建远程调用接口
 * 1）必须extends Remote:声明和远程调用有关
 *
 */
public interface MyRemote extends Remote {
    //2）每个远程调用都有风险，因此强迫客户端去注意到这个异常；
    //3) 远程方法的参数和返回值，必须是序列化过的或者是基本类型，因为任何参数都会打包通过网络传输，而这个都是通过序列化来完成的
    public String sayHello() throws RemoteException;

}
