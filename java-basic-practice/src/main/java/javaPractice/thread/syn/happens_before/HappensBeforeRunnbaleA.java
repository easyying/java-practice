package javaPractice.thread.syn.happens_before;

public class HappensBeforeRunnbaleA implements Runnable{
    @Override
    public void run() {
        Value value = new Value();
        value.setValue(1);
        System.out.println("aset后："+ value.getValue());
    }

}
