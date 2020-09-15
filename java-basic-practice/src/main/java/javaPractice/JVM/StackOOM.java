package javaPractice.JVM;

/**
 * 虚拟机栈造成的:多线程
 * 不断创建多个线程，造成空间不够用
 */
public class StackOOM {
    public  void st(){

    }

    public void stack(){
        while (true){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                st();
                }
            });
            t.start();
        }
    }


    public static void main(String[] args) {
        StackOOM s = new StackOOM();
        s.stack();
    }
}
