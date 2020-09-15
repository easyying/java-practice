package javaPractice.remote;

import java.rmi.Naming;

/**
 * 3. 获取  stub
 */
public class MyRemoteClient {
    public static void main(String[] args) {

        new MyRemoteClient().go();
    }


    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/remote hello");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
