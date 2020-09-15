package javaPractice.Statica;

public class Atest {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        a.play();
        a1.play();//A play() 输出的还是继承A的方法，发现并没有重写 不能够重写
        a.eat();
        a1.eat(); //输出的还是a的eat，因为a.eat这个静态方法不能够被重写，但是能够被继承
        B b = new B();
        b.eat();// B eat()
    }
}
