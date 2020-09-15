package javaPractice.complexTest;

/**
 * 构造函数，多态 private的整合运用
 */
public class ComplexTest {
    public static void main(String[] args) {

        // s
        // public String name = "子类的名字";
        // public String sex = "子类的性别";
//        static {
//            System.out.println("子类的静态代码块");
//        }
//
//    public Student(){
//            System.out.println("子类Student的构造函数");
//        }

        // p
//        private String name;
//        public int age = 12;
//        public String sex = "父类的性别";
        // static {
//        System.out.println("父类的静态代码块");
//        }
//
//    public People(){
//        System.out.println("父类People的构造函数");
//    }

        People p1 = new Student();
        Student p = new Student();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.sex);
        p.add();


        // 父类的静态代码块
        //子类的静态代码块
        // 父类People的构造函数
        // 子类Student的构造函数
        // 父类的名字
        // 父：12
        // 父：类的性别
        //子类的方法

    }
}
