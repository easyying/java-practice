package javaPractice.thread.consumer_provider.exapmles2;

public class Test {
    public static void main(String[] args) {
        NumberSyn syn = new NumberSyn();

        //一个生产者  一次生产10个
        Thread threada = new Thread(new Provider2(syn),"provider");


        //2个消费者  每个消费5个
      /*  for(int i = 1; i <= 2 ;i++){
            Thread thread = new Thread(new Consumer2(syn),"consumer"+i);
            thread.start();
        }
*/
        Thread threadb1 = new Thread(new Consumer2(syn),"consumer1");
        Thread threadb2 = new Thread(new Consumer2(syn),"consumer2");
        threadb1.start();
        threadb2.start();
        threada.start();

    }

}
