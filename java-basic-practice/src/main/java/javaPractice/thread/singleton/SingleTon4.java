package javaPractice.thread.singleton;

public class SingleTon4 {
    private static volatile SingleTon4 singleTon;
    private SingleTon4(){

    }
    public SingleTon4 getSingleTon(){
        if(singleTon == null){ //为了效率
            synchronized (SingleTon4.class){
                if (singleTon == null){//保证单例
                    singleTon = new  SingleTon4();
                }
            }
        }
        return singleTon;
    }
}
