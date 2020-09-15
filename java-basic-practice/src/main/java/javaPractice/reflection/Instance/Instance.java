package javaPractice.reflection.Instance;

/**
 *Student
 * 子类：SubStudent  和 SubStudent1
 *
 * SubStudent1实现了接口SubStudentImpl
 */
public class Instance {
    public static void main(String[] args) {
        Student s = new Student();
        SubStudent sub = new SubStudent();
        SubStudent1 sub1 = new SubStudent1();

        //一个实例对象是本身这个类的一个实例
        System.out.println(s instanceof Student);
        System.out.println(sub instanceof SubStudent);
        System.out.println(sub1 instanceof SubStudent1);

        //子类的实例对象 是 父类的 一个实例
        System.out.println(sub instanceof Student);
        //子类加上其它接口后实例出的对象也是 父类的实例
        System.out.println(sub1 instanceof Student);



        //父类的实例对象 不是子类的实例
        System.out.println(s instanceof SubStudent);

       /* //两个没有继承关系的类之间没有instanceof关系,编译器通不过去
        System.out.println(sub instanceof SubStudent1);*/

        //凡是null有关的都是false
        System.out.println(null instanceof Student);




    }
}
