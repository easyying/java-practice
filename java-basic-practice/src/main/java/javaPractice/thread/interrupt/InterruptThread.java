package javaPractice.thread.interrupt;

public class InterruptThread implements Runnable{

    @Override
    public void run() {
        boolean stop = false;
        while(!stop){
            System.out.println("线程2正在running");
            Long time = System.currentTimeMillis();
            while((System.currentTimeMillis()-time) < 1000){
                //让该循环持续一段时间
            }
            if(Thread.currentThread().isInterrupted()){
                System.out.println("线程2决定中断自己");
                break;
            }


        }
        System.out.println("线程2在中断请求下退出");
    }


}
