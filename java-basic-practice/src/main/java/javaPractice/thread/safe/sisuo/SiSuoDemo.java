package javaPractice.thread.safe.sisuo;

public class SiSuoDemo {

    public static void main(String[] args) {


        SiSuoCount count = new SiSuoCount();//同一个任务

        /**
         * 两个线程执行同一个活的不同方法
         */
        ThreadD threadD = new ThreadD(count);
        threadD.setName("线程D");
        threadD.start();

        ThreadE threadE = new ThreadE(count);
        threadE.setName("线程E");
        threadE.start();


    }


}
