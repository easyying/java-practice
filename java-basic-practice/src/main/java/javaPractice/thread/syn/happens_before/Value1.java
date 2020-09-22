package javaPractice.thread.syn.happens_before;

import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

public class Value1 {

    ReentrantLock l = new ReentrantLock();
    private  int value = 0;
    public  void setValue(int value){
        this.value = value;
    }
    public  int getValue(){
        return value;
    }
}
