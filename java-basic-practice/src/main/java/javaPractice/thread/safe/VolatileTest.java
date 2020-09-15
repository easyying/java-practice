package javaPractice.thread.safe;
/**
 * volatile的变量
 * 结果一定小于200000  线程不安全
 */
public class VolatileTest {
    public static volatile int race = 0;
    public static void increase(){
        race++;
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
