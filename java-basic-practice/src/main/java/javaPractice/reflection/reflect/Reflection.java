package javaPractice.reflection.reflect;
import javaPractice.reflection.ceshiyongli.Bird;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射
 *
 * 父类的类型类和子类的类型类是不同的，他们所有类的基类是Object   所有类型类的 类型为：Classya！！
 * Classya:是一个类型，他的实例叫做【类型类、类对象、Class对象、Class类对象、Class类实例】（每一个实例也是一个类型）
 * Class类的实例是一种类型
 * jvm为每一种类型管理一个Class对象（实例）
 *
 * 如果你知道一个实例，那么你可以通过实例的“getClass()”方法获得该对象的类型类，
 * 如果你知道一个类型，那么你可以使用“.class”的方法获得该类型的类型类。
 */
public class Reflection {
    public static void main(String[] args)  throws Exception{

        Bird b = new Bird();//Bird是一个类型。这个类型也是一个实例，是Class类的实例：叫做类型类
        Class m = b.getClass();//返回这个对象b所属的类（Class类型的一个实例，只不过该实例是一种类型），即b所在的类Bird，Bird的类型类
        String name = b.getClass().getName();//返回这个对象b所在类的类型类的名字：是String类型
        System.out.println("b.getClass():" + b.getClass());
        System.out.println("b.getClass().getName():" + b.getClass().getName());

        /**
         * 获得Class类对象的方法
         */
        //方法一：
        Class s1 = b.getClass();
        //方法二：
        String name1 =  "java.util.Random";
        Class s2 =  Class.forName(name1);
        //方法三：
        Class s3 =  Bird.class;
        Class clazz = Bird.class;

        /**
         * 从Class中获取信息
         * 构造器
         * 变量
         * 方法
         * 对应类的注解
         * 对应类的全部内部类
         *
         */
        //获取该class对象所对应的类的全部构造器
        Constructor[] constructors = clazz.getDeclaredConstructors();
        System.out.println("反射获得的构造器，如下：");
        for(Constructor c :  constructors){
            System.out.println(c);
        }
        System.out.println();
        // 获取该Class对象所对应类的全部public方法(不包括构造方法，包括从父类继承的)
        Method[] methods = clazz.getMethods();
        System.out.println("反射获得的全部public方法，如下：");
        for(Method m1 :  methods){
            System.out.println(m1);
        }
        //获取该Class对象对应类的指定方法
        Method method = clazz.getMethod("info",String.class);
        System.out.println("获取该Class对象对应类的指定方法："+ method);
        //调用方法
        method.invoke(b,"你好");
        Method method1 = clazz.getMethod("fun",Integer.class);
        method1.invoke(b,25);


        System.out.println();


        /**
         * 利用反射创建实例对象
         * 动态的创建一个实例对象(不是类对象)
         */
        //1. a. 利用类对象.newInstance()创建对象  调用默认的构造函数
        Class s4 = b.getClass();
        Bird b1 = b.getClass().newInstance();//newInstance调用该类对象的默认构造器，如果Bird没有默认构造器将抛出异常（返回b所属类的一个新的实例）
        System.out.println("b == b1:"+ (b == b1));
        System.out.println();
        //1. b. 利用类对象.newInstance()创建对象  （IOC的实现：spring的配置文件    利用反射读取xml文件生成对象）:此时用 forName  然后用newInstance()



        //2. 利用Constructor对象创建Java对象
        Constructor constructor = s4.getConstructor(String.class);
        Object o = constructor.newInstance("反射创建的对象");
        System.out.println(o);
        Constructor constructor1 = s4.getConstructor(Integer.class);
        Object o1 = constructor1.newInstance(25);
        System.out.println(o1);
        /*Constructor constructor2 = s4.getConstructor(String.class,Integer.class);
        Object o2 = constructor2.newInstance("你好",25);
        System.out.println(o2);*/


        System.out.println();
        /**
         * 比较两个Class类对象
         */
        if(b.getClass() == Bird.class){//一个已知的类的类型类,即Bird这个类的类型类
            System.out.println("b.getClass() == Bird.class");
        }else {
            System.out.println("b.getClass() != Bird.class");
        }

        Object j = new Object();
        if(j.getClass()==Bird.class){
            //System.out.println("j.getClass()==Bird.class");
        }else {
            //System.out.println("j.getClass()!=Bird.class");//为啥这个就能比较 不也是继承么？？？？ 继承不是编译器通不过么
        }








        //继承中：父类的类型类和子类的类型类是不同的   编译器就通不过
        /*SubBird sb = new SubBird();
        if(sb.getClass() != Bird.class){
            System.out.println("sb.getClass() != Bird.class");
        }else {
            System.out.println("sb.getClass() == Bird.class");
        }*/

        //System.out.println(b.getClass().getName());




    }


}
