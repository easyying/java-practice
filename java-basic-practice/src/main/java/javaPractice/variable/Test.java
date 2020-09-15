package javaPractice.variable;

public class Test {

    public static void main(String[] args) {
       /* VeariableCompar v= new VeariableCompar();
        System.out.println(v.getId());
        System.out.println(v.age);


        System.out.println(VeariableCompar.getHeight());
        System.out.println(VeariableCompar.getHeight1());
        System.out.println(v.getHeight());

        System.out.println(VeariableCompar.getMood1());

        v.study();*/

        //成员变量
        //Test t1 = new Test();
        //System.out.println(t1.a1);

        //System.out.println(t1.b1);
        //System.out.println(t1.v1);
        //System.out.println();

        //局部变量
        //t1.study();

        //类变量
        //System.out.println(f);//使用方法一
        //System.out.println(t1.f);//使用方法二



        //成员变量 和静态变量
        VeariableCompar v1 = new VeariableCompar();
        System.out.println(v1.name1);//成员变量
        v1.setName1("Binabian");
        System.out.println(v1.name1);//只是这个对象的成员变量改变，不影响其他类的同一个成员变量的值

        VeariableCompar v2 = new VeariableCompar();
        System.out.println(v2.name1);


        VeariableCompar v3 = new VeariableCompar();
        System.out.println(v3.height1);//静态变量
        v3.height1 ="继续变";
        System.out.println(v3.height1);

        VeariableCompar v4 = new VeariableCompar();
        System.out.println(v4.height1);


        //静态变量
        System.out.println(f);//s中
        System.out.println(Test.f);
        Test t = new Test();
        System.out.println(t.f);

        //实例变量
        System.out.println(t.a1);
        //System.out.println(a1);
       // System.out.println(Test.a1);


        //局部变量
        int d = 1;
        System.out.println(d);
        Test t1 = new Test();
        //System.out.println(t1.d);

    }

    /**
     * 成员变量【实例变量】
     */
    //基本类型
    int a1;
    boolean b1;

    int m=2;//局部变量和成员变量重名问题
    //int m=5;//同一类中，成员变量不能重名

    //引用类型
    VeariableCompar v1 = new VeariableCompar();


    /**
     * 类变量
     */
    static int f;


    public void study(){
        /**
         * 局部变量
         */
        //基本类型
         int a2 = 1;
        int m = 3;//同一类中，局部变量和成员变量重名问题 可以重名
        boolean b2 = true;
        System.out.println(a2);
        System.out.println(b2);

        System.out.println("m:"+ m);//局部变量和成员变量重名问题  局部变量优先！！

        //引用类型
        String study1="learning";
        VeariableCompar v2 = new VeariableCompar();
        System.out.println(v2);


        System.out.println(a1);//成员变量 使用范围


        //静态变量
        System.out.println(f);
        System.out.println(Test.f);
        Test t = new Test();
        System.out.println(t.f);

        //实例变量
        System.out.println(t.a1);
        System.out.println(a1);
        //System.out.println(Test.a1);

        //局部变量
        int d = 1;
        System.out.println(d);
        Test t1 = new Test();
        //System.out.println(t1.d);

    }


    //静态和非静态之间的相互使用
    static int m1 ;
    int m2 ;

    public static void fun1(){

        //静态
        fun2();
        System.out.println(m1);
        //非静态
        Test t = new Test();
        t.fun3();
        System.out.println(t.m2);

    }

    public static void fun2(){

    }

    public void fun3(){
        //静态
        fun2();
        System.out.println(m1);
        //非静态
        fun3();
        Test t = new Test();
        t.fun3();
        System.out.println(m2);

    }



}
