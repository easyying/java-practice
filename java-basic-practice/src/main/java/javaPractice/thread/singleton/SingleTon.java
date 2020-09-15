package javaPractice.thread.singleton;

/**
 * 单例模式：针对线程安全的
 */
//线程不安全的：懒汉式  需要用的时候再创建对象，而不是在最开始类加载就创建了对象
public class SingleTon {

    private static volatile SingleTon instance;//只有本类能创建对象，别的类公用这同一个对象
    private SingleTon(){//私有构造函数

    }

    public static SingleTon getInstance(){//定义一个公有的方法，将在该类中所创建的对象返回
        if(instance == null){//线程不安全：Thread1进入，此时没有创建对象，Thread2也进入，此时没有创建对象，然后同时调用，则会创建两个对象
            return new SingleTon();
        }
        return instance;
    }

}


