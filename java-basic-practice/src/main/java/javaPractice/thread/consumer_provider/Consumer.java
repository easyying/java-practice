package javaPractice.thread.consumer_provider;

/**
 * 消费者
 */
public class Consumer implements Runnable {
    private SynchronizedStack stack;
    public Consumer(SynchronizedStack s){
        stack = s;
    }

    @Override
    public void run() {
        Bread bread;
        for(int i=0;i<10;i++){
            bread = stack.pop();//消费者从盘子里拿出一个面包
            System.out.println("消费者消费了："+bread);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
