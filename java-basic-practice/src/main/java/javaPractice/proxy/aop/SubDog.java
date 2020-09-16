package javaPractice.proxy.aop;

public class SubDog implements Dog {
    @Override
    public void info() {
        System.out.println("代码是一条狗");
    }

    @Override
    public void run() {
        System.out.println("代码跑呀跑呀跑哼哼");

    }
}
