package javaPractice.thread.singleton;
//线程安全，并发性能也高，比较常用
//懒汉式双重校验锁
public class SingleTon2 {

    private static SingleTon2 instance2;
    private static byte[] lock = new byte[0];

    private SingleTon2(){

    }

    public static SingleTon2 getInstance2(){
        if(instance2 == null){

            synchronized (lock){

                if(instance2 == null){
                    return  new SingleTon2();
                }

            }
        }

        return instance2;

    }


}
