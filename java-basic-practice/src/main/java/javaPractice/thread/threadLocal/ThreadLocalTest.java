package javaPractice.thread.threadLocal;

/**
 * ThreadLocal
 */
public class ThreadLocalTest {
/*
    //1. 通过匿名内部类覆盖ThreadLocal的initialValue方法
    private static ThreadLocal<Integer> segNum = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };

    public ThreadLocal<Integer> getThreadLocal(){
        return segNum;
    }

    //2. 获取下一个序列值
    public int getNextNum(){
        segNum.set(segNum.get()+1);
        return segNum.get();
    }

    private static class  TestClient extends Thread{//线程TestClient
        private ThreadLocalTest sn;
        public TestClient(ThreadLocalTest sn){
            this.sn = sn ;
        }
        public void run(){
            for(int i =0 ;i <  3; i++){
                //4. 每个线程打出3个序列值
                System.out.println(Thread.currentThread().getName()+ "："+sn.getNextNum());
                sn.getThreadLocal().remove();//每个线程用完的时候要记得删除
            }
        }
    }

    public static void main(String[] args) {
        ThreadLocalTest sn =  new ThreadLocalTest();
        //3.3个线程共享sn，各自产生序列号
        TestClient  t1  = new TestClient(sn);
        TestClient  t2  = new TestClient(sn);
        TestClient  t3  = new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();

    }*/

    /**
     * threadlocal的用法
     */
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
    }



}
