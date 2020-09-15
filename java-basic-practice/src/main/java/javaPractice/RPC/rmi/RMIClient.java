package javaPractice.RPC.rmi;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args)  throws RemoteException, NotBoundException, AccessException {
        String name = "javaPractice.RPC.rmi.RMIDemoSevice";

        //获取注册
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",2001);
        //查找对应的服务
        RMIDemoSevice service = (RMIDemoSevice)registry.lookup(name);
        //调用服务
        System.out.println(service.sayHello("张三"));


    }
}
