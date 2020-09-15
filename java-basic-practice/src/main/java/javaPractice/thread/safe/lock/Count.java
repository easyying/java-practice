package javaPractice.thread.safe.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Count {
    //ReentrantLock lock = new ReentrantLock();//两个方法之间使用相同的锁 ？？？？？？？？？？？ 对结果表示不理解



    public void get(){
        ReentrantLock lock = new ReentrantLock();//两个方法之间的锁独立的呢  感觉可以不同线程同时访问一样？？？？
        try {
            lock.lock();//加锁
            System.out.println(Thread.currentThread().getName()+ "get begin");
            Thread.sleep(50L);//模仿干活
            System.out.println(Thread.currentThread().getName() + "get end");
            lock.unlock();//解锁
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void put(){
        ReentrantLock lock = new ReentrantLock();//两个方法之间的锁独立的呢
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+ "put begin");
            Thread.sleep(50L);
            System.out.println(Thread.currentThread().getName() + "put end");
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }



}
