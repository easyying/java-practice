package javaPractice.xiushifu.fianlPractice;

public class Dogf extends Animalf {
    //基本变量
    //final ：是常量，子类改变了实际也不会变，还是取的父类的值
    public final String m  ="final狗狗";

    //引用变量
    //final :引用变量不能改变，即所指的对象不能改变，但是对象里的可以改变
    public final Plan[] planfianl = {new Plan(),new Plan(),new Plan(),new Plan()};
    //public final Plan[] planfianl1 = {new Train(),new Train()};

    //static final
    public static final Plan[] planfstafinal = {new Plan(),new Plan(),new Plan(),new Plan(),new Plan(),new Plan(),new Plan()};

    @Override
    public void play(){
        System.out.println("Dogf:play");
    }

    //@Override
   /* public void bark(){

    }*/

}
