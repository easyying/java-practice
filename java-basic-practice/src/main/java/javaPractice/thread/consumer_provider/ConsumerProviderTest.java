package javaPractice.thread.consumer_provider;

/**
 当缓冲区已满时，生产者线程停止执行，放弃锁，使自己处于【等】状态，让其他线程执行；
 当缓冲区已空时，消费者线程停止执行，放弃锁，使自己处于等状态，让其他线程执行。
 当生产者向缓冲区放入一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态；
 当消费者从缓冲区取出一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态。
 */
public class ConsumerProviderTest {
    public static void main(String[] args) {
        // 下面的消费者类对象和生产者类对象所操作的是同一个同步堆栈对象 //创建面包盘
        SynchronizedStack stack = new SynchronizedStack(5);
        Product source = new Product(stack);//创建生产者，生产者需要拿到面包盘用来装面包
        Consumer sink = new Consumer(stack);//创建消费者，消费者需要拿到面包盘从中取面包

        Thread t1 = new Thread(source);
        Thread t2 = new Thread(sink);
        t1.start();
        t2.start();

        //如果想创建多个消费者 则需要创建多个消费者线程

    }

}
