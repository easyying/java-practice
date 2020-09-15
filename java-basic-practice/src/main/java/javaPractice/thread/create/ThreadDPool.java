package javaPractice.thread.create;

public class ThreadDPool implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"通过线程池方式创建的线程");
    }
}
