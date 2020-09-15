package javaPractice.string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args){

        //定义字符串
        String hobby = "imooc";
        String url = "www.immoc.com";
        //输出字符串
        System.out.println("hobby:"+hobby);
        System.out.println("url:"+url);

        String s1 = "Monday";
        String s2 = "Monday";
        System.out.println(s1==s2);//true，同一对象
        System.out.println(s1.equals(s2));//true
        String s3 = new String("Monday");
        String s4 = new String("Monday");
        System.out.println(s1==s3);//false，不同对象
        System.out.println(s3==s4);//false，不同对象
        System.out.println(s3.equals(s4));//true   被覆盖过，String这个类里面覆写过（堆与堆比较）
        System.out.println(s1.equals(s3));//true   比较内容（不管是堆上还是常量池中，堆与常量池比较）
        s1 = "欢迎来到："+s1;
        System.out.println(s1);


        //定义一个字符串
        String str = new String("studyJava");
        //打印输出字符串的长度
        System.out.println("打印输出字符串的长度："+str.length());
        //查找d字符在该字符串中第一次出现的位置，找不到返回-1
        char c = 'd';
        System.out.println("查找d字符在该字符串中第一次出现的位置："+str.indexOf(c));
        System.out.println("查找d字符在该字符串中第一次出现的位置："+str.indexOf('a'));
        System.out.println("查找d字符在该字符串中第一次出现的位置："+str.indexOf('x'));
        //查找Java字符串在该字符串中第一次出现的位置
        System.out.println("查找Java字符串在该字符串中第一次出现的位置："+str.indexOf("Java"));
        //查找imooc字符串在该字符串中第一次出现的位置，找不到返回-1
        System.out.println("查找imooc字符串在该字符串中第一次出现的位置："+str.indexOf("imooc"));
        //按照空格把字符串拆成一个数组，并输出数组元素
        String[] arr = str.split("!");
        System.out.println("按照空格把字符串拆成一个数组"+ Arrays.toString(arr));
        System.out.println();
        //获取索引位置[3,7)之间的子串
        System.out.println("获取索引位置[3,7)之间的子串"+str.substring(3,7));
        //获取索引位置[3,7)之间的子串
        System.out.println("获取索引位置[3,7)之间的子串"+str.substring(3,7));
        //转化为小写
        System.out.println("转化为小写"+str.toLowerCase());
        //转化为大写
        System.out.println("转化为大写"+str.toUpperCase());
        //获取索引位置1的字符
        System.out.println("获取索引位置1的字符："+str.charAt(1));
        //将字符串转换为byte[]数组，并打印输出，
        byte[] b = str.getBytes();
        System.out.println("将字符串转换为byte[]数组");
        for(int i=0;i< str.length();i++){//方法一：将数组中的元素一个个输出
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        //将字符串转换为byte[]数组，并打印输出
        byte[] b1 = str.getBytes();//方法二：将数组中的元素全部输出
        System.out.println("将字符串转换为byte[]数组："+Arrays.toString(b1));

        String s9 = "hello";
        System.out.println(s9);
        System.out.println(s9+"world");//拼接字符串 方法一：
        String s10 = new String("ni");
        System.out.println(s10);
        System.out.println(s10+"hao");
        String s11 = new String("可以");
        String s12 = new String("吗");
        System.out.println(s11);
        System.out.println(s12);


        String s13 = new String();//两个对象，不能修改，不能拼接
        String s14 = new String("哎呀呀");//创建另一对象
        System.out.println(s13);
        System.out.println(s14);

        StringBuilder s15 = new StringBuilder(" ");
        StringBuilder s16 = new StringBuilder("嘻嘻");
        System.out.println(s15);
        System.out.println(s16);

        StringBuilder s17 = new StringBuilder();//一个对象
        StringBuilder s18 = new StringBuilder("嘿嘿");//另一个对象
        System.out.println(s17);
        System.out.println(s18);

        StringBuilder s19 = new StringBuilder("好好");
        s19.append(" 学习");//字符串拼接
        s19.append(520);
        System.out.println(s19);
        System.out.println("插入前："+s19);

        System.out.println("插入前："+s19.insert(3,"哈哈"));
        String s20 = s19.toString();//将StringBuilder类型对象转为String类型对象
        System.out.println(s19.append("1"));

        //String.intern
        String m1 = new String("abc");
        System.out.println("m1.intern():"+m1.intern());

        String a = "Programming";
        String ba = new String("Programming");
        String ca= "Program" + "ming";

        System.out.println(a == ba);
        System.out.println(a == ca);
        System.out.println(a.equals(ba));
        System.out.println(a.equals(ca));
        System.out.println(a.intern() == ba.intern());
        System.out.println();

        String w1 = new String("1");
        w1.intern();
        String w2 = "1";
        System.out.println("w1==w2:"+ w1==w2);
        System.out.println();

        String str1 = new StringBuilder("计算机").append("软件").toString();
        // String str3= new StringBuilder("计算机软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("Java(TM) SE ").append("Runtime Environment").toString();
        System.out.println(str2.intern() == str2);


        System.out.println("面试中的笔试题!!!!!!!!");
        String string1 = "您好";
        String string2 =  new String("您好");
        String string3 = "您"+"好";
        System.out.println(string1==string2);
        System.out.println(string2==string3);
        System.out.println(string1==string3);
        System.out.println(string1==string1.intern());

        //不变性
        string1= "哈哈"+string1;

        String string6 ="ab";
        String string4 = "a"+"b";//等价于"ab"
        String string5 = new String("a")+new String("b");
        System.out.println(string6==string4);
        System.out.println(string6==string5);
        System.out.println(string4==string5);

        System.out.println();
        System.out.println();
        System.out.println("原理测试");
        /**
         * 原理测试
         */
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1==ss2);

        String ss3 = new String("def");
        System.out.println(ss3 == ss1);
        String ss4 = "def";


        //拼接的
        String ss11 = "aa"+"bb";
        String ss22 = "aabb";
        System.out.println(ss11 == ss22);

        String ss111 = new String("aaa") + new String("bbb");
        String ss222 = new String("aaabbb");
        System.out.println(ss111==ss222);




    }
}
