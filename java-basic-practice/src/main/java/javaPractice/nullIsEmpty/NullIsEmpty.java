package javaPractice.nullIsEmpty;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * isEmpty null  ""
 */
public class NullIsEmpty {
    public static void main(String[] args) {

        /**
         * 空指针
         */
        Animal a = new Animal();
        a.setPics(null);

        System.out.println("空图片"+a);

        /**
         * 基本类型
         */
        Integer i = null;
        System.out.println("i:" + i);
        //System.out.println("i:" + i.equals(1));
        //Integer ii = new Integer(null);
        //System.out.println("i1" + ii);
        Integer ii = 0;
        //Integer ii1 = new Integer();



        /**
         * String
         */
        String s3 =null;//此时s3是未分配内存空间，无值，是一种无值(值不存在)
        System.out.println("null字符串："+s3);
        String s1 = new String();//s1，但值为空，是绝对的空，是一种有值（值存在为空而已）
        System.out.println("空字符串s1："+s1);
        System.out.println("空字符串长度s1："+s1.length());
        System.out.println("s1.equals(\"\")"+s1.equals(""));

        String s2="";//此时s2是分配了内存空间，值为空字符串，是相对的空，是一种有值（值存在为空字串）
        System.out.println("值为空字符串s2："+s2);
        System.out.println("值为空字符串长度s2："+s2.length());
        System.out.println("s2.equals(\"\")"+s2.equals(""));

        String s4=" ";
        System.out.println("值为空个字符串s4："+s4);
        System.out.println("值为空字符串长度s4："+s4.length());


        //String s4 = new String(null);不行

        if(s1.isEmpty()){//isEmpty():分配了内存空间，但是字符数组的长度==0
            System.out.println("String s1 = new String()");
        }
        if(s2.isEmpty()){
            System.out.println("String s2=\"\"");
        }
       /* if(s3.isEmpty()){//空指针
            System.out.println("String s3 =null");
        }*/
        System.out.println();




        /**
         * 集合
         */
        //null集合（集合不存在）,没分配存储空间
        ArrayList<Animal> list1 = null;
        System.out.println("null集合："+list1 +" " + "null集合的长度："+"list1.size()不能使用"); //结果null


        //空集合(分配存储空间，里面没元素！！！集合中没有任何元素)
        ArrayList<Animal> list2 = new ArrayList<Animal>();
        System.out.println("空集合："+list2 +" " + "空集合集合的长度："+list2.size());//结果[]


        //分配存储空间，里面有元素，但是有个元素的值为null
        ArrayList<Animal> list3 = new ArrayList<Animal>();
        list3.add(null);
        list3.add(new Animal());
        System.out.println("元素的值为null："+list3 +" " + "n元素的值为null集合的长度："+list3.size());//结果[null, Animal]

        ArrayList<String> list5 = new ArrayList<String>();
        list5.add(null);
        System.out.println("null："+list5.size());
        list5.add("");
        System.out.println(""+list5.size());
        list5.add(" ");
        System.out.println("元素的值为空字符串 和空格："+list5);//[null, ,  ]
        System.out.println(list5.size());
        System.out.println();

        /**
         * 数组
         */
        //null数组
        int[] i2 = null;
        System.out.println("null数组："+Arrays.toString(i2));

        //空数组
        int[] i1 = new int[5];
        System.out.println("空数组："+i1.length);
        System.out.println("空数组："+Arrays.toString(i1));//默认输出0

        String[] i8 = new String[5];
        System.out.println("i8:"+Arrays.toString(i8));//输出null

        String[] i7 = {"","",""};//输出空的
        System.out.println("i7:"+i7.length);
        System.out.println(Arrays.toString(i7));

        String[] i9 = {null,null,null};
        System.out.println("i9:"+i9.length);
        System.out.println(Arrays.toString(i9));

        Integer[] i10 = {null,null,null};
        //int[] i10 = {null,null,null};






    }
}
