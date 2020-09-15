package javaPractice.thread.safe.sisuo;

public class SiSuoCount {
    private byte[] lock1 = new byte[1];
    private byte[] lock2 = new byte[1];


    private int num= 0 ;

    public void add(){
        synchronized (lock1){//锁的对象1
            num = num+1;

            try {
                Thread.sleep(1001);
            }catch (InterruptedException e){

            }
          /*  synchronized (lock2){//锁的对象2
                num = num+1;
            }*/
            System.out.println(Thread.currentThread().getName()+ "-"+ num);
        }

    }

    public void lockMethod(){
        synchronized (lock2){//锁的对象2
            num = num+1;
            try {
                Thread.sleep(1001);
            }catch (InterruptedException e){

            }
           /* synchronized (lock1){//锁的对象1
                num = num+1;
            }*/
            System.out.println(Thread.currentThread().getName()+ "-"+ num);
        }

    }

    public void lockMethod1(){

            num = num+1;
            try {
                Thread.sleep(1001);
            }catch (InterruptedException e){

            }
           /* synchronized (lock1){//锁的对象1
                num = num+1;
            }*/
            System.out.println(Thread.currentThread().getName()+ "-"+ num);


    }




}
