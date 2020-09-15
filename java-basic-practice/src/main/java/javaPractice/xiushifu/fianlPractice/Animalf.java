package javaPractice.xiushifu.fianlPractice;

//final修饰的类：不能被继承
public class Animalf {

    public String spub="public";
    protected String spro="嘻嘻3";
    private String spri="嘻嘻4";


//final不能修饰构造函数
    public  Animalf(){

    }

    /**
     * 修饰变量：基本变量；引用变量
     */
//不是final修饰的变量，可以被子类继承，且可以先不初始化（后续可以改变，是变量）
    public String s;

//是final修饰的变量，可以被子类继承，但是必须赋初值；后续不可再改变（相当于常量）
    public final String m  ="final动物";

  //修饰 引用变量（数组，字符串，集合）
  public Plan[] plan = {new Plan(),new Plan()};
  //final：引用指向的对象不能变，但是对象里面的值可以变，添加移除元素
  public final Plan[] planfianl = {new Plan(),new Plan()};
  //static final：引用指向的对象不能变，对象里面的值也不可以变
  public static final Plan[] planfstafinal = {new Plan(),new Plan(),new Plan()};


//final修饰的方法不可以被子类重写（覆盖）
    public void play(){
        System.out.println("Animalf:play");
    }

//final修饰的方法不可以被子类重写（覆盖）
    public final void bark(){
        System.out.println("Animalf:bark");
    }




}
