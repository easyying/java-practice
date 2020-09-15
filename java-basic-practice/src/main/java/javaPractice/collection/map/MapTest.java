package javaPractice.collection.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        //键不能重复，值可以重复
        HashMap<String,String> map = new HashMap<>();
        map.put("11","老李");
        map.put("12","老李2");
        map.put("13","老李3");
        map.put("13","老李4");//覆盖了key相同的
        map.put(null,null);
        map.put(null,"啊哈哈");
        System.out.println(map);

        //遍历hashmap
        // 1.获取Map中的所有键
        Set<String> keys =  map.keySet();
        for(String s:keys){
            System.out.print("key:"+s);
        }

        // 2.获取Map中所有值
        Collection<String> values =  map.values();


        // 3.得到key的值的同时得到key所对应的值
        Set<String> keys1 =  map.keySet();

        for(String s:keys1){
            System.out.print(s+map.get(s));
        }

        //
       Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry :entries ){
            System.out.println(entry.getKey()+entry.getValue());

        }




    }

}
