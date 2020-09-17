package javaPractice.thread.create.scheduler;

/**
 *
 */
public class ThreadShunxuRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ;i < 25; i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "：is running");
        }
    }
}
