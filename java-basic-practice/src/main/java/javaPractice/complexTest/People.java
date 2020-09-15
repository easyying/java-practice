package javaPractice.complexTest;

public class People {

    public String name;
    public int age = 12;
    public String sex = "父类的性别";

    {
        System.out.println("父类的静态代码块");
    }

    public People(){
        System.out.println("父类People的构造函数");
    }

    public static void add(){
        System.out.println("父类的方法");
    }
}
