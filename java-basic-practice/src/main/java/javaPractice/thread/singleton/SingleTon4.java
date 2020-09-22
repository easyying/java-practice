package javaPractice.thread.singleton;

/**
 * 双重检测机制
 * 与内存模型有关
 */
public class SingleTon4 {
    private static volatile SingleTon4 singleTon;//volatile:防止指令重排序的优化
    private SingleTon4(){

    }
    public SingleTon4 getSingleTon(){
        if(singleTon == null){ //为了效率
            synchronized (SingleTon4.class){
                if (singleTon == null){//保证单例
                    singleTon = new SingleTon4();
                }
            }
        }
        return singleTon;
    }
}
