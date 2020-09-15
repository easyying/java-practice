package javaPractice.thread.safe.sisuo;

public class ThreadE extends Thread {

    private SiSuoCount count = new SiSuoCount();
    public ThreadE(SiSuoCount count){
        this.count = count;
    }

    public void run(){
        count.lockMethod();
    }

}
