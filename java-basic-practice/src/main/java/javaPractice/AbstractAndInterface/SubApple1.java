package javaPractice.AbstractAndInterface;

public class SubApple1 extends Apple implements pear {

    public SubApple1(){
        System.out.println("SubApple子类构造方法");
    }

//不是覆盖的也不是实现的，子类自己的
   /* public void play(){
        System.out.println("子类自己的play");
    }*/


//继承抽象类，实现抽象类的抽象方法（必须）
    @Override
    public void eat() {

    }

    @Override
    protected void eat1() {

    }


//实现接口的所有方法（重写）（必须）
    @Override
    public void drink() {

    }

    @Override
    public void cloth() {
        System.out.println("子类的cloth");
    }
}
