package javaPractice.thread.threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class threadExecutorTest {
    public static void main(String[] args) {
        //创建一个单线程的线程池：挨个按顺序执行，按照放进去的顺序执行；线程池里面永远只有一个线程
        //ExecutorService executor = Executors.newSingleThreadExecutor();

        //创建一个可缓存的线程池：
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 5 ; i++) {

            final int j = i;
            Runnable ru = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("into"+ j);
                        Thread.sleep(100);
                        System.out.println("end"+ j);

                    }catch (InterruptedException e){

                    }
                }
            };
            executor.execute(ru);//放进去任务！！！
        }
        executor.shutdown();
        System.out.println("main end");

    }

}
