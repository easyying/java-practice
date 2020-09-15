package javaPractice.Jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedisJava {
    public static void main(String[] args) {
        /**
         * 连接本地的 Redis 服务
         */
        //连接本地
        Jedis jedis = new Jedis("localhost");
        //连接别的机器
        // Jedis jedis = new Jedis("47.95.21.122",6379);

        /**
         * 测试redis是否启动
         */
        System.out.println("服务正在运行: "+jedis.ping());

        /**
         * 设置密码  https://www.jianshu.com/p/708c09e11e1a
         */

        /**
         * 连接不成功:有可能默认只允许本地连接，不允许远程连接
         */


        /**
         * 设置键值对
         */
        jedis.set("runoobkey", "www.runoob.com");
        System.out.println("redis键runoobkey的值为：" + jedis.get("runoobkey"));

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }

        /**
         * jedis连接池
         */
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(30);// 最大闲置个数: 当闲置的连接超过30时，开始关闭连接
        jedisPoolConfig.setMinIdle(10);// 最小闲置个数: 保证连接池中至少有10个连接是闲置的，当闲置的连接小于10个时，创建新的连接
        jedisPoolConfig.setMaxTotal(50);// 连接池中最大连接数  50
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
        Jedis resource = jedisPool.getResource();
        System.out.println("redis键runoobkey的值为 resource：" + resource.get("runoobkey"));
        resource.close(); //使用完关闭连接
    }

}
