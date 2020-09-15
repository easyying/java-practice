package javaPractice.RPC.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 提供服务的
 */
public class RMIServer {

    public static void main(String[] args)  throws RemoteException,AlreadyBoundException{
        String name = "javaPractice.RPC.rmi.RMIDemoSevice";

        //创建服务
        RMIDemoSevice sevice = new RMIDemoServiceImpl();
        //创建2001端口的注册表
        Registry registry = LocateRegistry.createRegistry(2001);
        //将服务绑定到注册表中
        registry.bind(name,sevice);

    }
}
