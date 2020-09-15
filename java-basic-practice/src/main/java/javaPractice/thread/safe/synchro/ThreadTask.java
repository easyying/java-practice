package javaPractice.thread.safe.synchro;

public class ThreadTask  extends Thread{


    static class Count{//每一个人所做的活(做的是同样的活儿)
        private byte[] lock = new byte[1];

        int num = 0;
        int b = 10;
        int c = 20;

        /**
         * 不加锁
         */
        public void add1(){
            try {
                Thread.sleep(51);//模仿用户干活
            }catch (InterruptedException e){

            }
            num++;
            System.out.println("a"+":"+Thread.currentThread().getName()+"："+num);
        }

        /**
         * 加锁
         */
        //方法一：
        public synchronized void add2(){//同 synchronized (this)
            try {
                Thread.sleep(51);//模仿用户干活
            }catch (InterruptedException e){

            }
            num++;
            System.out.println("num add2"+":"+Thread.currentThread().getName()+"："+num);
        }

        //方法二：
        public void add3(){

            synchronized (this){//给这个对象（当前对象本身）  给这个活儿加锁，别人不能此时也做这活儿
                try {
                    Thread.sleep(51);//模仿用户干活
                }catch (InterruptedException e){

                }
                num++;
                System.out.println("num"+":"+Thread.currentThread().getName()+"："+num);
            }

        }

        /**
         * 线程不安全
         */
        public void add4(){

            synchronized (lock){//！！！！这个锁的对象不一样！！！！
                try {
                    Thread.sleep(51);//模仿用户干活
                }catch (InterruptedException e){

                }
                num++;
                System.out.println("locknum add4"+":"+Thread.currentThread().getName()+"："+num);
            }

        }

    }
    private Count count;//每一个任务进来都是同样的活

    public ThreadTask(Count count){
        this.count = count;
    }

    public void run(){
        /*count.add1();
        count.add2();
        count.add3();*/
        //如果锁定同一个对象，那么线程1访问完方法4，还没访问方法2的时候 ，别的线程即不能访问方法2，也不能访问4！！！
        //如果锁定不是同一个对象，那么线程1访问完方法4，还没访问方法2的时候，别的线程可以访问方法2，和4 ！！！！！
        //所以：方法2 和 方法4 是同属于一个对象锁的时候，这样子才是线程安全
        count.add4();
        count.add2();


    }



}
