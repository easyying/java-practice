package javaPractice.Statica;

public class B extends A {
   /* @Override
    public void play(){
        System.out.println("B play()");
    }*/


   /* @Override  //静态方法不能被重写
    public static void eat(){
        System.out.println("B eat()");
    }*/

   //下面看似重写，试一下不会输出 A引用引用b实例的话
    public static void eat(){
        System.out.println("B eat()");
    }
}
