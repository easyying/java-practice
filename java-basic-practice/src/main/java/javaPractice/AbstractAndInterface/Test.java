
package javaPractice.AbstractAndInterface;

public class Test {
    public static void main(String[] args) {
        SubApple1 s = new SubApple1();
        s.play();
        System.out.println();

        Apple a = new SubApple1();//i抽象类不能被实例化，只能用抽象类的引用--指向子类的对象
        a.play();
        System.out.println();

        pear p = new SubApple1();
        p.cloth();


        Apple a1= new SubApple21();



    }
}
