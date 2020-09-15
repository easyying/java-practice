package javaPractice.thread.create;

import javaPractice.Statica.A;
import javaPractice.thread.interrupt.InterruptThread;
import javaPractice.thread.safe.lock.Count;

import java.util.concurrent.*;

public class ThreadTest {
    private static  int POOL_NUM =10;//线程数量

    public static void main(String[] args) {
        A a =new A();
        /**
         * 线程的实现方法：四种
         */
        //方法一：继承父类，覆盖方法run()
        ThreadA threadA = new ThreadA();//本身又是线程，又是任务！
        threadA.start();//启动！线程A
        System.out.println("这就是主线程mainA");



        final Count count = new Count();
        for(int i = 0 ;i < 2 ;i++){
            new Thread(){
                @Override
                public void run(){
                    count.get();//内部类，这个为final类型
                }
            }.start();

        }


       //方法二：实现接口Runnable，实现抽象方法run()
        ThreadB threadB = new ThreadB();//类似于一个任务！！！
        Thread thread = new Thread(threadB);//将任务放入线程
        thread.start();//启动！线程B

        System.out.println("这就是主线程mainB");


        //方法三：实现接口Callable，实现方法call()
      /*  ThreadC threadC = new ThreadC();//任务：实现call()
        FutureTask<Object> firsttask = new FutureTask<Object>(threadC);//包装任务：firsttask对象获取Callable任务返回的Object对象
        Thread thread1 = new Thread(firsttask);//任务放入线程
        thread1.start();//启动！线程C
        System.out.println("这就是主线程mainC:begin!");
        try{
            System.out.println(firsttask.get());//只有主线程get了，主线程才会继续往下面执行!!!!!!
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
        System.out.println("这就是主线程mainC:end!");*/




         //方法四：实现接口Runnable，线程池，实现方法run()
      /*  ExecutorService executorService = Executors.newFixedThreadPool(POOL_NUM);//创建一个线程池
        for(int i = 0 ;i <POOL_NUM; i++){//线程的数量
            ThreadDPool threadDPool = new ThreadDPool();//创建线程池的任务
            executorService.execute(threadDPool);//将任务放进线程池，执行线程池
        }*/
        //关闭线程池
        //executorService.shutdown();

        //1）
      /*  ExecutorService m = Executors.newFixedThreadPool(POOL_NUM);
        ThreadDPool t = new ThreadDPool();
        m.execute(t);
        m.submit(t);*/

        //2)
        //ThreadPoolExecutor pool = new ThreadPoolExecutor();



        //新建几个线程体会线程的属性
      /* ThreadB threadB = new ThreadB();
        for (int i = 0; i < 2; i++) {
            //new Thread(threadB,"线程:("+i+")").run();
            new Thread(threadB,"线程:("+i+")").start();
        }
        System.out.println("哈哈");
        System.out.println("返回当前线程组活动的线程数目"+Thread.activeCount());
        System.out.println("这是主线程"+Thread.currentThread());
        System.out.println("返回主线程的名称"+Thread.currentThread().getName());
        System.out.println("返回主线程的标识"+Thread.currentThread().getId());
        System.out.println("返回主线程的优先级"+Thread.currentThread().getPriority());
        System.out.println("返回主线程的状态"+Thread.currentThread().getState());
        System.out.println("返回主线程所属的线程组"+Thread.currentThread().getThreadGroup());
        System.out.println("判断主线程是否是活着的"+Thread.currentThread().isAlive());
        System.out.println("测试主线程是否是守护线程"+Thread.currentThread().isDaemon());*/
      /*  try {
            Thread.sleep(10000L);//休息10s以便监控工具能检测到
        }catch (InterruptedException e){
            e.printStackTrace();
        }*/

        /**
         * 线程的属性
         */
        
        /*ThreadB threadB = new ThreadB();
        for (int i = 0; i < 5; i++) {
            new Thread(threadB,"线程名称：（"+ i+")").start();
        }
        Thread curThread = Thread.currentThread();
        String curName =  curThread.getName();
        System.out.println("这是主线程的名称：" +curName+ "："+ curThread.getName());
        System.out.println("返回主线程的引用：" + curName+ "：" +  Thread.currentThread());
        System.out.println("返回主线程的id：" + curName+ "：" +  curThread.getId());
        System.out.println("返回主线程所属的线程组："+ curName+ "："+ curThread.getThreadGroup());
        System.out.println("返回主线程所属的线程组的活跃的线程数量："+ curName+ "："+ Thread.activeCount());
        System.out.println("返回主线程的优先级"+ curName+ "："+ curThread.getPriority());
        System.out.println("主线程是否处于活跃状态"+curName+ "："+ curThread.isAlive());
        System.out.println("主线程是否为守护线程"+curName+ "："+ curThread.isDaemon());*/

        /**
         * 主线程中断线程InterruptThread
         */
  /*      try {
        Thread thread = new Thread(new InterruptThread(),"被中断的线程2");
        System.out.println("启动线程2");
        thread.start();//这个就是线程2

        Thread.sleep(3000);
        System.out.println("main中断线程2");
        thread.interrupt();//修改下线程2的中断状态
        System.out.println("线程2是否已经中断"+ thread.isInterrupted());

        Thread.sleep(3000);  //让当前线程：即主线程停止一段时间
        System.out.println("stop application");
    }catch (InterruptedException e){
            e.printStackTrace();
        }*/

    }
}
