package javaPractice.thread.lock;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 测试线程安全不安去
 */
public class Count {

    /**
     * 线程安全的例子 因为这2个方法锁的都是同一个对象
     */
    public  int num = 0;
    public  synchronized void methodA(){
        try{
            Thread.sleep(51);
        }catch (Exception e){

        }
        num += 1;
        System.out.println(Thread.currentThread().getName() + "-methodA-" + num);
    }
  /*  public void methodB(){
        synchronized (this){
            try{
                Thread.sleep(51);
            }catch (Exception e){

            }
            num += 1;
            System.out.println(Thread.currentThread().getName() + "-" + num);
        }
    }*/
    //线程不安全的例子
    public int[] lock = new int[5];
    public void methodC(){
        synchronized (lock){
            try{
                Thread.sleep(51);
            }catch (Exception e){

            }
            num += 1;
            System.out.println(Thread.currentThread().getName() + "-methodC-" + num);
        }
    }

}
