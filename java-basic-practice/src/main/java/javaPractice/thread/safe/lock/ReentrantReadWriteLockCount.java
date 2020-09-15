package javaPractice.thread.safe.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读-写简单场景
 */
public class ReentrantReadWriteLockCount {

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public void read(){
        try {
            lock.readLock().lock();//获取读锁

            System.out.println(Thread.currentThread().getName()+ "read start");
            Thread.sleep(50L);
            System.out.println(Thread.currentThread().getName() + "read end");

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }

    public void write(){//
        try {
            lock.writeLock().lock();//获取写锁

            System.out.println(Thread.currentThread().getName()+ "write start");
            Thread.sleep(50L);
            System.out.println(Thread.currentThread().getName() + "write end");

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }


}
