package javaPractice.thread.syn.example2;

public class TestSync implements Runnable {
    public static int balance;

    @Override
    public void run() {
        for(int i = 0 ;i < 5 ; i++){
            increment();
           // System.out.println("当前线程："+ Thread.currentThread().getName()+  "   balance= "+balance );
        }
    }
    //丢失更新 读一遍保存后，通过保存数据再复制，会出现覆盖现象
    public  void increment(){//
        balance++;

       /* int i = balance;
        balance = i + 1;//用的是读取的值，而不是目前的值!!*/
        //System.out.println("当前线程："+ Thread.currentThread().getName()+  "   balance= "+balance );
    }
}
