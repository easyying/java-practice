package javaPractice.thread.create;

/**
 * 创建线程：
 * 方法一：新创建的线程继承Thread，直接覆盖父类的方法 run  ，如果需要调用父类的方法则用super
 */
public class ThreadA extends Thread{
    //重写一个run方法在子类中
    @Override
    public void run(){
        //子类想要调用父类中被覆盖的方法的时候：用super
        super.run();
        try{
            Thread.sleep(500L);//模拟做事情执行了500ms
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("这是线程A");
    }



  /*  public void run(){
        while (true){
            System.out.println(this.currentThread().getName());
        }
    }
*/
    /*public void run(){
        super.run();
        try{
            Thread.sleep(500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"这就是线程A");

    }*/



}
