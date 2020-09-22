package javaPractice.thread.consumer_provider.examples1;

/**
 * 生产消费标的物：面包Bread类
 */
public class Bread {
    int num ;
    Bread(int num){//new Bread(i)时调用构造方法注入num，标注这是第几个面包
       this.num = num;
    }
    @Override
    public String toString(){//重写toString()是为了打印出这是第几个面包
        return "下标为："+ num+"的面包";
    }


}
