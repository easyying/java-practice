package javaPractice.construct;


public class Duck {
    int size ;
    //默认 无参构造函数（编译器会给你创建，不用自己写
    // 如果你构建了有参构造函数，那么想构建无参构造函数的话，编译器不会给你构建，只能你自己创建）

    //自己重写的无参构造函数
    public Duck(){
        size = 34;//初始化
        System.out.println("Quack");
    }

    //有参构造函数
    public Duck(int size){
        this.size = size;
    }


    public void setSize(int size){
        this.size = size;
    }
    public int getSize() {
        return size;
    }


    //super
    public void  drink(){
        System.out.println("父类 drink");
    }
    public void play(){
        System.out.println("父类 play");
    }

}
