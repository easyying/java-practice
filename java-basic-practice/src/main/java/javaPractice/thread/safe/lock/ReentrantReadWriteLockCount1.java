package javaPractice.thread.safe.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读-写复杂场景
 */
public class ReentrantReadWriteLockCount1 {

    private final Map<String,Object> map = new HashMap<>();


    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public Object readWrite(String id){
        Object value = null;
        lock.readLock().lock();//开启读锁,从缓存中获取
        try {
            value = map.get(id);


            //为null的需要加锁
            if(value == null){
                lock.readLock().unlock();
                lock.writeLock().lock();
                try {
                    if(value == null){
                        value ="aaa";//模拟去数据库中查找
                    }

                }finally {
                    lock.writeLock().unlock();//释放写锁

                }
                lock.writeLock().lock();//再加上读锁
            }

            //不为null的直接读，不用加锁

        }finally {
            lock.writeLock().unlock();//再释放读锁
        }
        return lock;
    }



}
