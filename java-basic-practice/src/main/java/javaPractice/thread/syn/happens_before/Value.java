package javaPractice.thread.syn.happens_before;

/**
 * 不对啊？？？？？
 */
public class Value {
    private volatile int value = 0;
    public synchronized void setValue(int value){
        this.value = value;
    }
    public synchronized int getValue(){
        return value;
    }

    public static void me(){
        //this.oo();
        oo();
    }

    public static void oo(){
        Value v = new Value();
        v.getValue();
    }



}
