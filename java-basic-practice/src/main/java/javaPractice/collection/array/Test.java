package javaPractice.collection.array;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        /*int[] s = new int[5];
        for(int i  = 0 ;i< s.length;i++){
            System.out.println(s[i]);
        }*/

        /**
         *
         * Arrays.asList(a) :注意事项！！！
         * 1. 传递的数组必须是对象数组，而不是基本类型。
         * 2. Arrays.asList() 方法返回的并不是 java.util.ArrayList ，而是 java.util.Arrays 的一个内部类,这个内部类并没有实现集合的修改方法或者说并没有重写这些方法。
         */
        //数组转为list
        int[] a = {1,2,3};
        List res1 = Arrays.asList(a);
        System.out.println(res1.get(0));//基本类型-作为入参传入实际上是，得到的参数就不是数组中的元素，而是数组对象本身！
        //System.out.println(res1.get(1));❎ 因为是数组地址

        Integer[] a1 = {1,2,3};
        List res2 =Arrays.asList(a1);//包装类型传入：得到的就是数组中的元素
        System.out.println(res2.get(0));
        System.out.println(res2.get(1));
        //res2.add(4); ❎  因为Arrays.asList() 方法返回的并不是 java.util.ArrayList ，而是 java.util.Arrays 的一个内部类,这个内部类并没有实现集合的修改方法或者说并没有重写这些方法。
        //res2.remove(3);❎

        System.out.println(res2.getClass());//class java.util.Arrays$ArrayList 看下对应的类型是啥

        /**
         * 将数组转为ArrayList:
         * Arrays.asList(a) :传入必须是对象类型 && 不能用add这些
         *
         */

        //1. JDK1.5+
       // 手动

        //2.
        List list2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        list2.remove("b");

        //3.
        String[] str = {"1"};
        List<String> list4 = new ArrayList<String>();
        CollectionUtils.addAll(list4, str);



    }
}
