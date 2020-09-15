package javaPractice.RPC.rmi;

import java.rmi.RemoteException;

public class RMIDemoServiceImpl implements RMIDemoSevice {

    @Override
    public String sayHello(String name) throws RemoteException {
        return "hello"+name;
    }
}
