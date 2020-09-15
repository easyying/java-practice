package javaPractice.typeOFData;

import java.util.Calendar;

public class TestType {
    public static void main(String[] args) {
        //字符串转为整型
        String s8 = "123";
        int b = Integer.parseInt(s8);
        int b1 = Integer.valueOf(b);


        //整型转为字符串
        int a = 1;
        String s= String.valueOf(a);
        String s1 = "" + a;
        String s2 = Integer.toString(a);
        System.out.println();


        /**
         * 日期
         * getInstance获取Calendar对象
         * getTime 获取时刻
         * format：格式转换
         */
        System.out.println(Calendar.getInstance().getTime());//返回Calendar的Date时间值
        Dateya d = new Dateya();
        System.out.println(Dateya.getTimeString());

        //打印昨天的当前时刻
        Calendar c = Calendar.getInstance();
        System.out.println("打印当前的时刻："+ c.getTime());
        c.add(Calendar.DATE,-1);
        System.out.println("打印昨天的当前时刻:"+c.getTime());






    }
}
