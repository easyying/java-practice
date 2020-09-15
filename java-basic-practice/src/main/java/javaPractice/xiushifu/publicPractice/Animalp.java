package javaPractice.xiushifu.publicPractice;

import javaPractice.xiushifu.fianlPractice.Animalf;

public class Animalp {

    public String s1 = "11";

    private String s3 = "33";

    public static void main(String[] args) {
        Animalf animalf = new Animalf();
        //不同包
        System.out.println(animalf.spub);
        //System.out.println(animalf.spri);
        //System.out.println(animalf.spro);  //不同包下的非子类


        //pro
        Dogp dogp = new Dogp();
        System.out.println(dogp.sdogpro);//同包下的继承
        Planp planp = new Planp();
        System.out.println(planp.sfeipro);//同包下的非继承

        //默认
        System.out.println(dogp.sdmoren);//同包下的继承
        System.out.println(planp.sdmoren);//同包下的非继承

    }

}
