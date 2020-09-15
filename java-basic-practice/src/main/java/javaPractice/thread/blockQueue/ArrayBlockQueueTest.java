package javaPractice.thread.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 16个日志对象，打印16秒
 * 如果四个线程去打印的话，需要4秒就打印完这些日志对象
 *
 * ？？？为啥呢？？？
 */
public class ArrayBlockQueueTest {
    public static void main(String[] args) {

        //新建立一个等待队列（阻塞队列） 数组阻塞队列
        final BlockingQueue<String> bq = new ArrayBlockingQueue<String>(16);//队列的容量
        //列表阻塞队列
        final BlockingQueue<String> bq1 = new LinkedBlockingDeque<>(16);//队列的容量

        final ArrayBlockQueueTest a = new ArrayBlockQueueTest();

        //模仿16个日志对象
        try {
            for(int i = 1; i <= 16; i++){
                String log = (i)+"—>";
                bq.put(log);//将数组存储到队列里面
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //不加线程：需要16秒打印16个日志对象
     /*   while (!bq.isEmpty()){
            String log = null;
            try {
                log = (String) bq.take();
            }catch (InterruptedException e){

            }
            System.out.println(log + " " + System.currentTimeMillis());
        }*/

        //加了线程的打印日志对象
        for(int i = 0 ; i < 4 ; i++){//4个线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        try {
                            String log = (String) bq.take();
                            a.pareLog(log);
                        }catch (InterruptedException e){

                        }
                    }

                }
            }).start();
        }

    }

    public void pareLog(String log){
        System.out.println(log + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }

    }

}
