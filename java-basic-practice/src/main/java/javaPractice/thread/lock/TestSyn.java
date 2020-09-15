package javaPractice.thread.lock;

public class TestSyn {
    public static void main(String[] args) {


        ThreadB threadB = new ThreadB();

        Thread thread1 = new Thread(threadB);
        thread1.start();

        Thread thread2 = new Thread(threadB);
        thread2.start();

    }
}
