package javaPractice.thread.consumer_provider;

/**
 * 生产者
 */
public class Product implements Runnable {
    private SynchronizedStack stack;
    public Product(SynchronizedStack s){
        stack = s;
    }
    @Override
    public void run() {
        Bread bread;
        for(int i=0;i<10;i++){
            bread = new Bread(i); //生产者生产面包
            stack.push(bread);    //生产者将生产的面包放进盘子
            System.out.println("生产者生产了："+bread);
            try {
                //每一个字符线程就休眠一下
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            /**
             * 随机产生100个字符
             ch = (char) (Math.random() * 26 + 'A');
             stack.push(ch);
             */
        }
    }
}
