package javaPractice.thread.syn;

/**
 * 一.  隐式锁写法：
 * 1. 修饰方法
 * 2. 修饰代码块
 */
public class synLock {

    //一：多线程，线程安全
    public static int num = 0;
    //修饰方法
    public static synchronized void funA(){
        try{
            Thread.sleep(51);
        }catch (InterruptedException e) {

        }
        num = num +1;
        System.out.println(Thread.currentThread().getName()+"-"+num);
    }

    public void funB(){
        //修饰代码块
        synchronized (this){
            try{
                Thread.sleep(51);
            }catch (InterruptedException e){

            }
            num = num +1;
            System.out.println(Thread.currentThread().getName()+"-"+num);
        }

    }


    public static void main(String[] args) {


    }






}
