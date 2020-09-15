package javaPractice.designMoshi;

/**
 * 单例模式
 * 1-8
 * 访问方式：Singleton instance = Singleton.getInstance();
 */
//1. 饿汉式[可用,线程安全]:没有延迟加载的特性
/*public class Singleton {
    private static Singleton s = new Singleton();//类加载就完成实例化，避免了线程的同步问题d
    private Singleton(){}
    public static Singleton getInstance(){
        return s;
    }
}*/
//2. 饿汉式变换[可用,线程安全]  同1一样
/*public class Singleton {
    private static Singleton s ;//因为它在类创建的时候就已经实例化了对象
    static {
        s = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance(){
        return s;
    }
}*/

//3. 懒汉式[线程不安全，不可用]
/*public class Singleton {
    private static Singleton s = null ;
    private Singleton(){}
    public static Singleton getInstance(){
        if(s == null){
            s= new Singleton();//在调用getInstance方法的时候才创建对象的，所以它比较懒因此被称为懒汉式。
        }
        return s;
    }
}*/

//4. 懒汉式线程安全的[线程安全，效率低不推荐使用]  每次想获得类的实例的时候，都得进行同步，同步会加锁，会效率低，而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了
/*public class Singleton {
    private static Singleton s = null ;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(s == null){
            s= new Singleton();//在调用getInstance方法的时候才创建对象的，所以它比较懒因此被称为懒汉式。
        }
        return s;
    }
}*/

//5. 单例模式懒汉式[线程不安全，不可用]  同3一样，线程不安全的原因也一样
/*public class Singleton {
    private static Singleton s = null ;
    private Singleton(){}
    public static  Singleton getInstance(){
        if(s == null){
            synchronized (Singleton.class) {
                s = new Singleton();//
            }
        }
        return s;
    }
}*/

//6. 单例模式懒汉式双重校验锁[推荐用]:     优点：线程安全；延迟加载；效率较高。实例化代码只用执行一次，后面再次访问时，判断if (instance== null)，直接return实例化对象。解决了4
public class Singleton {
    private static volatile Singleton s = null ;//引用私有，同时加volatile
    private Singleton(){}//构造函数私有
    public static Singleton getInstance(){//方法共有
        if(s == null){//先判断对象是否已经实例过，没有实例化过才进入加锁代码   //为了效率
            synchronized (Singleton.class) { //同步锁
                if(s == null){  //保证单例
                    s = new Singleton(); //初始化
                }
            }
        }
        return s;
    }
}

//7. 内部类[推荐用]: 优点：避免了线程不安全，延迟加载，效率高。 而静态内部类方式在Singleton类被装载时 并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类，从而完成Singleton的实例化
/*
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static Singleton s = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.s;
    }
    public class Singleton1 {
    }
    public class Singleton2 {

    }

}*/
