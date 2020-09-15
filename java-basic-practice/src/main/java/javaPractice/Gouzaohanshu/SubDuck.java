package javaPractice.Gouzaohanshu;

public class SubDuck extends Duck {

    //构造函数不能被继承
    /*@Override
    public Duck(){

    }*/

    public SubDuck(){
        super( );//父类的构造函数，要写的话必须在第一行
        super.size=1; //调用父类的对象
    }

    public SubDuck(int size){
        this();//本类的构造器，要写的话必须在第一行
        this.size = size ;  //调用子类的对象
    }

    /**
     * super.父类的属性
     * super.父类的方法
     * 子类想访问父类的属性和方法
     */
    //方法一：保证不改变父类方法的同时重写父类的方法，新加一部分方法内容进去
    @Override
    public void play(){
        System.out.println(super.size);//子类调用父类的属性
        super.play();//子类调用父类的方法，super相当于父类对象
        buzza();//保证不改变父类方法的同时重写父类的方法，新加一部分方法内容进去
    }
    public void buzza(){
        System.out.println("子类 buzza");
    }



}
