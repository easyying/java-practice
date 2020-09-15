package javaPractice.thread.threadLocal;

public class MyRunnable implements Runnable {
    ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public void run() {
        threadLocal.set( (int)(Math.random() * 100D));//两个线程在用一个threadLocal 针对不同的线程保存了不同的值
       /* try {
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }*/
        System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
    }

}
