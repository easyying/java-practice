package javaPractice.thread.syn.happens_before;

public class Value1 {
    private  int value = 0;
    public  void setValue(int value){
        this.value = value;
    }
    public  int getValue(){
        return value;
    }
}
