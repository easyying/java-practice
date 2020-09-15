package javaPractice.thread.safe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子性类
 * 结果一定==200000  线程安全
 */
public class AtmoTest {
    /*public static int race = 0;*/
    public static AtomicInteger race = new AtomicInteger(0);
    public static  void increase(){
        /*race++;*/  // 非原子性：取值 +1 赋值
        race.getAndIncrement();//原子性

    }

    public static final int THREAD_COUNT = 20;

    public static void main(String[] args){
        Thread[] threads = new Thread[THREAD_COUNT];
        for(int i = 0;i < THREAD_COUNT ;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0 ;i < 10000; i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        //等待所有线程累加线程结束
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }

}
