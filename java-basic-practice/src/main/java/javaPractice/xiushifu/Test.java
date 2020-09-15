package javaPractice.xiushifu;

import javaPractice.xiushifu.fianlPractice.Animalf;
import javaPractice.xiushifu.fianlPractice.Dogf;
import javaPractice.xiushifu.fianlPractice.Plan;

import java.util.Arrays;

public class Test {
    static final int[] a4= {1,2,3,4};

    public static void main(String[] args) {
        /**
         * 测试final
         */
        Animalf animalf = new Animalf();
        animalf.play();
        animalf.s = "动物";
        System.out.println(animalf.s);
        System.out.println(animalf.m);
        System.out.println();

        Dogf dogf = new Dogf();
        dogf.play();
        dogf.s = "狗狗";
        System.out.println(dogf.s);
        System.out.println(dogf.m);
        System.out.println();

        for(Plan p : dogf.plan){
            System.out.println(p);
        }
        System.out.println();

        for(Plan p : dogf.planfianl){
            System.out.println(p);
        }
        System.out.println();

        for(Plan p : dogf.planfstafinal){
            System.out.println(p);
        }
        System.out.println();


        final Integer a1 = 2;
        System.out.println(a1);
        //final修饰的基本变量不能被重新赋值
        //a1=3;
        final int[] a2 = {5,6,7,8};
        int[] a3 = {12,13};
        System.out.println(Arrays.toString(a2));
        a2[0] = 10;//final修饰的引用变量：不能重新指向对象，但是可以改变对象本身的值
        System.out.println(Arrays.toString(a2));

        //a2 = null;//final修饰的引用变量：不能重新指向对象
        a3 = null;//不是final修饰的引用变量：可以重新指向对象
        System.out.println(a3);


        System.out.println();
        System.out.println(Arrays.toString(a4));
        a4[0] = 11;
        System.out.println(Arrays.toString(a4));


        /**
         * 测试访问权限
         */



    }



}
