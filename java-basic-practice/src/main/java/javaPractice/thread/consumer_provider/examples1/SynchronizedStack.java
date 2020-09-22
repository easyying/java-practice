package javaPractice.thread.consumer_provider.examples1;

/**
 * 创建盘子Plate类装面包（栈结构）,需要实现装入和取出的方法
 *
 * 注：notify()
 * 只有其他线程调用了notify方法（notify并不释放锁，
 * 只是告诉调用过wait方法的线程可以去参与获得锁的竞争了，
 * 但不是马上得到锁，因为锁还在别人手里，别人还没释放），
 * 调用wait方法的一个或多个线程就会解除wait状态，重新参与竞争对象锁，
 * 程序如果可以再次得到锁，就可以继续向下运行
 *
 */
public class SynchronizedStack {
    private int index = 0;
    private int size = 5;
    Bread []  breads;  //可以用数组放，或者用list放 linkedList
    public SynchronizedStack(int size){
        System.out.println("栈被创建");
        this.size = size;
        breads = new Bread[size]; //首先定义盘子大小，一盘能装5个面包
    }

    //生产数据：装入面包
    public synchronized void push(Bread bread){
        while (index == size){//当index=5时说明这已经是第六个面包了，盘子已经装不下了，要等待消费者取出面包
            try {
                System.out.println("生产数据满了");
                this.wait();//等待，直到有数据出栈
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        breads[index] = bread;
        index++;
        System.out.println(Thread.currentThread().getName() + ", 此时面包的个数："+ index);
        this.notify();//唤醒在此对象监视器上等待的单个线程，即生产者线程  通知其他线程把数据出栈
    }
    //取出面包
    public synchronized Bread pop(){
        while(index == 0){//当index=0时说明盘子里已经没有面包可以取了，要等待生产者装入面包
            try {
                System.err.println("栈空了");
                this.wait();// 等待，直到有数据出栈
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        index --;//指针向前移动
        Bread b = breads[index];//因为在装入后执行了index++,但breads[index++]位置上还没有面包，所以先--index才能取到当前面包
        this.notify();//唤醒在此对象监视器上等待的单个线程，即消费者线程  通知其他线程把数据入栈
        System.out.println(Thread.currentThread().getName() + ", 此时面包的个数："+ index);
        return b;
    }

    //显示堆栈内容
    public synchronized void print(){
        for(int i = 0; i < breads.length; i++){
            System.out.println(breads[i]);
        }
        System.out.println();
        this.notify();// 通知其它线程显示堆栈内容
    }

}
