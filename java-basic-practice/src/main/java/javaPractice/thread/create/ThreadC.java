package javaPractice.thread.create;

import java.util.concurrent.Callable;
/**
 * 实现了接口，有返回结果
 * 方法三：新创建的线程实现Callable接口，实现接口中的抽象call方法（有返回值） override，这个可以有返回结果，得到线程的执行结果
 */
public class ThreadC implements Callable {
    @Override
    public Object call() throws Exception {//有返回值
        try {
           Thread.sleep(500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("这是线程C");

        return "Thread C";
    }

    /*@Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现Callable接口通过FutureTask包装器来实现的线程");
        return null;
    }*/


}
