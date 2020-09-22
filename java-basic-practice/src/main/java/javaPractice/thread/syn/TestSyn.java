package javaPractice.thread.syn;

import javaPractice.thread.syn.example2.TestSync;

public class TestSyn {
    public static void main(String[] args) {
     /*   ThreadB threadB = new ThreadB();
        Thread thread1 = new Thread(threadB);
        thread1.start();

        Thread thread2 = new Thread(threadB);
        thread2.start();*/

        /**
         * 两人提款：修改数据问题
         */
       /* RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);//创建2个任务相同的线程，意味着会操作同一个账户
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();*/

        /**
         * 更新丢失
         */
        TestSync theJob1 = new TestSync();
        Thread one1 = new Thread(theJob1);//创建2个任务相同的线程，意味着会操作同一个账户
        Thread two1 = new Thread(theJob1);
        one1.setName("Ryan");
        two1.setName("Monica");
        one1.start();
        two1.start();
        System.out.println(TestSync.balance);
    }
}
