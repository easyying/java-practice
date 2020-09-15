package javaPractice.thread.singleton;

//线程安全，但是并发性能不是很高的
public class SingleTon1 {

    private static SingleTon1 instance1;
    private SingleTon1(){

    }

    //效率低：只要创建一次就好，其余不为null都是直接返回
    public static synchronized SingleTon1 getInstance1(){
        if(instance1 == null){
            return  new SingleTon1();
        }
        return instance1;
    }
}
