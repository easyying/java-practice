package javaPractice.thread.lock;

import javaPractice.thread.lock.example1.RyanAndMonicaJob;

public class TestSyn {
    public static void main(String[] args) {
     /*   ThreadB threadB = new ThreadB();
        Thread thread1 = new Thread(threadB);
        thread1.start();

        Thread thread2 = new Thread(threadB);
        thread2.start();*/

        /**
         * 两人提款
         */
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);//创建2个任务相同的线程，意味着会操作同一个账户
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
}
