package javaPractice.proxy.aop;

public class AOPTest {
    public static void main(String[] args) {
        Dog dog = new SubDog();
        AOPProxy aopProxy = new AOPProxy(dog);
        Dog dogproxy = (Dog)aopProxy.getProxy();
        dogproxy.info();
        dogproxy.run();

    }
}
