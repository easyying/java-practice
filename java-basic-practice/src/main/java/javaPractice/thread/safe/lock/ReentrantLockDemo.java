package javaPractice.thread.safe.lock;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class ReentrantLockDemo {

    public static void main(String[] args) {
        /**
         * ReentrantLock:全局变量；局部变量
         */
        final Count count = new Count();
        for(int i = 0 ;i < 2 ;i++){
            new Thread(){
                @Override
                    public void run(){
                    count.get();//内部类，这个为final类型
                }
            }.start();

        }

        for(int i = 0 ;i < 2 ;i++){
            new Thread(){
                @Override
                public void run(){
                    count.put();//内部类，这个为final类型
                }
            }.start();

        }

        /**
         *ReentrantReadWriteLockCount:读写锁测试 （针对锁是全局变量！！！！）   读-读：不互斥   读-写：互斥  写-写：互斥
         */
     /*  final ReentrantReadWriteLockCount count1 = new ReentrantReadWriteLockCount();
        for (int i = 0; i < 2 ; i++) {
            new Thread(){
                @Override
                public void run(){
                    count1.read();//read 多个线程可以同时read，不用等到一个线程read完另一个线程再read
                }
            }.start();
        }

        for (int i = 0; i < 2 ; i++) {
            new Thread(){
                @Override
                public void run(){
                    count1.write();//write必须一个线程write完，另一个线程再write
                }
            }.start();
        }*/

        /**
         * 读写锁的复杂版
         */
  /*   final ReentrantReadWriteLockCount1 count2 = new ReentrantReadWriteLockCount1();
        for(int i = 0; i < 2 ; i++){
            new Thread(){
                @Override
                public void run(){
                    count2.readWrite("1");//write必须一个线程write完，另一个线程再write
                }
            }.start();
        }
*/


    }


}
