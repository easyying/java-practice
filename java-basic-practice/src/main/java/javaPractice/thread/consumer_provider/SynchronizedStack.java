package javaPractice.thread.consumer_provider;

/**
 * 创建盘子Plate类装面包（栈结构）,需要实现装入和取出的方法
 */
public class SynchronizedStack {
    private int index = 0;
    private int size = 5;
    Bread []  breads;
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
        index --;//指针向下移动
        Bread b = breads[index];//因为在装入后执行了index++,但breads[index++]位置上还没有面包，所以先--index才能取到当前面包
        this.notify();//唤醒在此对象监视器上等待的单个线程，即消费者线程  通知其他线程把数据入栈
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
