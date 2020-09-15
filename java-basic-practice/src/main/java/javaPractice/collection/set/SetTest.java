package javaPractice.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("hashset容量："+hashSet.size());

        //元素添加：
        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("jiaboyan");
        hashSet.add(",");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("!");
        System.out.println("HashSet容量大小："+hashSet.size());
        System.out.println(hashSet);

        //迭代：
         Iterator<String> iterator = hashSet.iterator();
         while(iterator.hasNext()){
             System.out.print(iterator.next()+ " ");
         }
        System.out.println();
         for(String s:hashSet){
             System.out.print(s+" ");

         }
        System.out.println();

         //删除元素
        hashSet.remove("jiaboyan");
        System.out.println("HashSet元素大小：" + hashSet.size());
        hashSet.clear();
        System.out.println("HashSet元素大小：" + hashSet.size());

        //集合判断

        System.out.println( hashSet.isEmpty());
        System.out.println(hashSet.contains("hello"));


        /**
         * TreeSet
         */
        TreeSet<String> treeSet = new TreeSet<String>();
        System.out.println("TreeSet初始化容量大小："+treeSet.size());

        //元素添加：
        treeSet.add("my");
        treeSet.add("name");
        treeSet.add("jiaboyan");
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        System.out.println("TreeSet容量大小：" + treeSet.size());
        System.out.println("TreeSet元素顺序为：" + treeSet.toString());
    }


}
