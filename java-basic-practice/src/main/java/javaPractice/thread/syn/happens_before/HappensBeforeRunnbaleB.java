package javaPractice.thread.syn.happens_before;

public class HappensBeforeRunnbaleB implements Runnable {
    @Override
    public void run() {
        Value value = new Value();
        System.out.println("bget后："+value.getValue());
    }
}
