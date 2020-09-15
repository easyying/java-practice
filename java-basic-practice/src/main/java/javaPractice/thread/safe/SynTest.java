package javaPractice.thread.safe;
/**
 * synchronized的方法
 * 结果一定==200000  线程安全
 */
public class SynTest {
    public static volatile int race = 0;
    public static synchronized void increase(){
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
