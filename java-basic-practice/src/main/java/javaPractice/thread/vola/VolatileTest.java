package javaPractice.thread.vola;

/**
 * 测试volatile
 *
 */
public class VolatileTest {

    //一. 以下场景用volatile不能保证原子性（线程不安全）
    public static volatile int race = 0 ;
    public static void increase(){
        race++;
    }
    public static final int COUNT = 2;

    public static void main(String[] args) {
        Thread[] thread = new Thread[COUNT];
        for(int i = 0;i < COUNT; i++){
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0 ; i < 10000 ;i++){
                        increase();
                    }
                }
            });
            thread[i].start();
        }
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        /**
         * volatile int race = 0 :如果这样子值会小于200000 说明不是保证原子性
         */
        System.out.println("race: "+ race);

    }


    //二.以下场景可以使用volatile
    volatile boolean shutdown;
    public void hutdown(){
        shutdown = true;
    }
    public void doWork(){
        while (!shutdown){
            //
        }
    }
}
