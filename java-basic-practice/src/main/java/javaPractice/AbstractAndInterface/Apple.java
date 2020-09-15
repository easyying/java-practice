package javaPractice.AbstractAndInterface;

//抽象类
public abstract class Apple {

    public String s;
    protected String s1;
    private String s2;

    //构造函数
    public Apple(){
        System.out.println("Apple父类构造方法");
    }

    //普通方法
    public void play(){
        System.out.println("父类play");
    }
    protected void play1(){
        System.out.println("父类play");
    }
    private void play2(){
        System.out.println("父类play");
    }

    //抽象方法:抽象类里面的方法修饰不能使private，其余都行
    public abstract void eat();
    protected abstract void eat1();
    //private abstract void eat2();

}
