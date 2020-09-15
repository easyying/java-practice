package javaPractice.variable;

public class Child extends Test {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.a1);//子类用父类的成员变量

        //静态变量
        System.out.println(f);//s中
        System.out.println(f);
        Test t = new Test();
        System.out.println(t.f);

        //实例变量
        System.out.println(t.a1);
        //System.out.println(a1);
        //System.out.println(Test.a1);


    }
    public void st(){
        System.out.println();


        //静态变量
        System.out.println(f);
        System.out.println(f);
        Test t = new Test();
        System.out.println(t.f);

        //实例变量
        System.out.println(t.a1);
        System.out.println(a1);
        //System.out.println(Test.a1);
    }

}
