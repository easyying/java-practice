package javaPractice.thread.singleton;

public class SingleTonDemo {

    public static void main(String[] args) {
        //线程不安全的：懒汉式
        SingleTon instance = SingleTon.getInstance();

        SingleTon1 instance1 = SingleTon1.getInstance1();


    }

}
