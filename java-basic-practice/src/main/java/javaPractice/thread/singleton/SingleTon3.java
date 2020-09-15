package javaPractice.thread.singleton;

import java.util.concurrent.locks.ReentrantLock;

//线程安全，并发性能也高，比较常用
public class SingleTon3 {
    private static ReentrantLock lock = new ReentrantLock();

    private static SingleTon3 instance3;
    private SingleTon3(){

    }

    public static SingleTon3 getInstance3(){
        if(instance3 == null){
            lock.lock();
            if(instance3 == null ){
                return new SingleTon3();
            }
            lock.unlock();
        }
        return instance3;
    }

}
