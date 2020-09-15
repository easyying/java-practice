package javaPractice.JVM;

/**
 * 虚拟机栈造成的:单线程
 */
public class StackOverFlow {
    public int a;
    public void stack(){
        //不断递归，增大每一个栈帧的空间大小，超出设置的栈的大小
        a++;
        stack();
    }


    public static void main(String[] args) {
        //方法一：不断递归，导致栈中帧的数量很大，超出设置的栈的大小
        StackOverFlow s = new StackOverFlow();
        s.stack();
    }

}
