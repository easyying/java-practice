package javaPractice.thread.create.scheduler;

/**
 * 验证java虚拟机的调度器有不可预测的范围
 */
public class ThreadFRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("top o the stack");
    }
}
