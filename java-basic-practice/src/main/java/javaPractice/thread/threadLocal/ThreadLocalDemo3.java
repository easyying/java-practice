package javaPractice.thread.threadLocal;

import java.util.List;

public class ThreadLocalDemo3  {
    public static ThreadLocal<String> threadLocal1 = new ThreadLocal<>();//两个线程共享的变量，但其实都是各自独享该共享变量
    public static ThreadLocal<String> threadLocal2 = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                threadLocal1.set("第一个线程的值1A");
                threadLocal2.set("第一个线程的值1B");
                System.out.println("threadLocal1："+threadLocal1.get());
                System.out.println("threadLocal2："+threadLocal2.get());

            }

        }.start();

        new Thread(){
            @Override
            public void run(){
                threadLocal1.set("第二个线程的值2C");
                threadLocal2.set("第一个线程的值2D");
                System.out.println("threadLocal1："+threadLocal1.get());
                System.out.println("threadLocal2："+threadLocal2.get());
            }
        }.start();

    }
}
