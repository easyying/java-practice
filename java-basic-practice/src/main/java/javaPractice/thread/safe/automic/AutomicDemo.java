package javaPractice.thread.safe.automic;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicDemo {
    public static void main(String[] args) {
        /**
         * 原子类：
         */
        AtomicInteger ai = new AtomicInteger(0);
        System.out.println("获取当前的值"+ ai.get());//获取当前的值
        System.out.println("并设置新的值"+ai.getAndSet(5));//获取当前的值，并设置新的值
        System.out.println("自增"+ai.getAndIncrement());//获取当前的值，自增
        System.out.println("自减"+ai.getAndDecrement());//获取当前的值，自减
        System.out.println("加上预期的值"+ai.getAndAdd(10));//获取当前的值，并加上预期的值
        System.out.println("获取当前的值"+ai.get());
    }
}
