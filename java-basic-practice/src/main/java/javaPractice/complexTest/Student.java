package javaPractice.complexTest;

public class Student extends People {

    public String name = "子类的名字";
    public String sex = "子类的性别";

    static {
        System.out.println("子类的静态代码块");
    }

    public Student(){
        System.out.println("子类Student的构造函数");
    }

   /* public static void add(){
        System.out.println("子类的方法");
    }*/
}
