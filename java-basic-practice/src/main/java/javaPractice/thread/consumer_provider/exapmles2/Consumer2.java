package javaPractice.thread.consumer_provider.exapmles2;

public class Consumer2 implements Runnable {
    private NumberSyn numberSyn;
    public Consumer2( NumberSyn numberSyn){
        this.numberSyn = numberSyn;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5 ;i++){
            Integer m =  numberSyn.remove();
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
