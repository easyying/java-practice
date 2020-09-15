package javaPractice.thread.create;

/**
 * 实现了接口
 * 方法二：新创建的线程实现Runnable接口，实现接口中的抽象run方法 override
 */
public class ThreadB implements Runnable {

    @Override
    public void run() {
        try{
            Thread.sleep(500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("这是线程B");
       /* Thread curThread = Thread.currentThread();
        String curName =  curThread.getName();
        System.out.println("这是当前线程的名称："+ curThread.getName());
        System.out.println("返回当前线程的引用：" +curName+ "：" +  Thread.currentThread());
        System.out.println("返回当前线程的id：" +curName+ "：" +  curThread.getId());
        System.out.println("返回当前线程所属的线程组："+curName+ "："+ curThread.getThreadGroup());
        System.out.println("返回当前线程所属的线程组的活跃的线程数量："+curName+ "："+ Thread.activeCount());
        System.out.println("返回当前线程的优先级"+ curName+ "："+ curThread.getPriority());
        System.out.println("该线程是否处于活跃状态"+ curName+ "："+ curThread.isAlive());
        System.out.println("该线程是否为守护线程"+ curName+ "："+ curThread.isDaemon());*/
    }


    /*@Override*/
    /*public void run() {
        System.out.println("123");
    }*/
  /*  public void run(){
        *//*try{
            Thread.sleep(500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }*//*
        //System.out.println(Thread.currentThread().getName()+"这就是线程B");
        System.out.println("返回当前线程的引用："+Thread.currentThread());
        System.out.println(Thread.currentThread().getName()+"返回当前线程的名称："+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+"返回当前线程的标识："+Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName()+"返回当前线程的优先级："+Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName()+"返回当前线程的状态："+Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName()+"返回当前线程所属的线程组："+Thread.currentThread().getThreadGroup());
        System.out.println(Thread.currentThread().getName()+"判断线程是否是活着的："+Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName()+"测试线程是否是守护线程："+Thread.currentThread().isDaemon());

    }*/


}
