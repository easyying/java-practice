package javaPractice.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 2. 实现远程接口（真正的远程服务对象的代理：即stub 客户端服务的辅助设备）
 * 1) UnicastRemoteObject:成为远程服务对象
 * 2） UnicastRemoteObject构造函数会抛出异常
 * MyRemoteImpl：远程服务对象，必须继承UnicastRemoteObject
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    //2） UnicastRemoteObject构造函数会抛出异常,所以由于父类的构造函数会抛出异常，子类也得抛出
    public MyRemoteImpl() throws RemoteException {

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Srever say hello";
    }


    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();//创建远程对象
            Naming.rebind("remote hello",service);//3）给远程服务命名，且把该远程服务RMI上注册，即将要注册 service：远程服务对象  remote hello：注册名   会把stub注册上去！！！！
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
