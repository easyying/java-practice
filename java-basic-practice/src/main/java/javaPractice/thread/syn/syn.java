package javaPractice.thread.syn;

/**
 * 测试有syn和没syn的线程安全性
 */
public class syn extends Thread {
    public int count = 5;

    //不使用
    @Override
    public  void run(){
        count--;
        System.out.println(Thread.currentThread().getName()+"  count:"+count);
    }
    //使用synchronized
    /*@Override
    public  synchronized void run(){
        count--;
        System.out.println(Thread.currentThread().getName()+"  count:"+count);
    }*/

    public static void main(String[] args) {
        syn s = new syn();
        Thread thread1 = new Thread(s);
        Thread thread2 = new Thread(s);
        Thread thread3 = new Thread(s);
        Thread thread4 = new Thread(s);
        Thread thread5 = new Thread(s);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}
