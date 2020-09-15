package javaPractice.RPC.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//提供服务的：对外的服务这个就是
public interface RMIDemoSevice  extends Remote{
    public String sayHello(String name) throws RemoteException;
}
