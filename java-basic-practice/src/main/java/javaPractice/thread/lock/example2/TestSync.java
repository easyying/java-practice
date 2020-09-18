package javaPractice.thread.lock.example2;

public class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
        for(int i = 0 ;i < 50 ; i++){

        }
    }
    public void increment(){
        int i = balance;
        balance = i + 1;//用的是读取的值，而不是目前的值
    }
}
