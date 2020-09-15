package javaPractice.thread.threadLocal;


public class ThreadLocalDemo2 {

   static class ThreadTest implements Runnable{

        ThreadLocal  threadLocal1 = new ThreadLocal ();
        ThreadLocal  threadLocal12 = new ThreadLocal();

        @Override
        public void run() {
            //System.out.println(Thread.currentThread());
            threadLocal1.set(1);
            threadLocal12.set(2);
            System.out.println(Thread.currentThread().getName()
                    + "threadLocal1's value=" + threadLocal1.get()
                    + "threadLocal2's value=" + threadLocal12.get());
        }
    }

    public static void main(String[] args) throws Exception {

        ThreadTest tesk = new ThreadTest();

        Thread threadA = new Thread(tesk);
        threadA.start();

        Thread threadB = new Thread(tesk);
        threadB.start();

        Thread.sleep(10000);
        System.out.println();
    }

}
