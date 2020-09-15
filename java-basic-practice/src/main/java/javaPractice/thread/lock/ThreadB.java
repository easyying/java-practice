package javaPractice.thread.lock;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        Count c = new Count();
        c.methodA();
        //c.methodB();
        c.methodC();
        System.out.println("c.num:"+ c.num);
    }
}
