package javaPractice.thread.safe.sisuo;

public class ThreadD  extends Thread {

    private SiSuoCount count = new SiSuoCount();
    public ThreadD(SiSuoCount count){
        this.count = count;
    }

    public void run(){
        count.add();
    }
}

