package javaPractice.thread.consumer_provider.exapmles2;

public class Provider2 implements Runnable {
    private NumberSyn numberSyn;
    public Provider2( NumberSyn numberSyn){
        this.numberSyn = numberSyn;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 10 ;i++){
            System.out.println("生产者生产了："+ i );
            numberSyn.add(i);

            try {
                Thread.sleep(10);//为啥是sleep？没释放锁啊
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
