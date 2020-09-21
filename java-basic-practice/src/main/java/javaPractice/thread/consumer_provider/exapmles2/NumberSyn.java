package javaPractice.thread.consumer_provider.exapmles2;

import java.util.LinkedList;

/**
 * 存放数字的
 */
public class NumberSyn {
    int size = 1;
    LinkedList<Integer> list = new LinkedList<>();


    public NumberSyn(){
        System.out.println("空间被创建了");
    }

    public synchronized void add(Integer i){
        while (list.size() >= size){
            try {
                System.out.println("空间满了");
                this.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        list.addLast(i);//
        System.out.println(Thread.currentThread().getName()+" 此时空间个数:"+list.size()  );
        this.notify();
    }

    public  synchronized Integer remove(){
        while (list.size()  <= 0){
            try {
                System.out.println("空间空了");
                this.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        Integer m = list.removeLast();//取后面的
        System.out.println("消费者消费了："+ m);
        System.out.println(Thread.currentThread().getName()+" 此时空间个数:"+ list.size()  );
        this.notify();
        return m;
    }

}
