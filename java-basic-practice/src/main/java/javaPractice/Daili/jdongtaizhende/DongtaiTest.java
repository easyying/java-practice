package javaPractice.Daili.jdongtaizhende;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试动态
 */
public class DongtaiTest {
    public static void main(String[] args) {
        // 要代理的真实对象 铁路部
        /*Ticket railway = new Railway();*/
        // 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的（:为哪个委托类去生成处理器！！！）
       /* InvocationHandler invocationHandler = new DyamicProxy(railway);*/


        /* 绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，(哪个接口和具体委托类绑定，返回的是生成动态代理类的
        实例)，    执行invoke方法（返回一个具体的代理类）。
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象（指定代理对象和具体委托对象同一个类加载器）（委托类的类加载器）
         * 第二个参数tielubu.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了（拿到和委托对象一样的接口）（委托类实现的所有接口）
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上  （哪个处理器去处理代理对象）（将委托类封装到实现了InvocationHandler接口的处理器对象中）
         *因此 处理器对象有委托了和代理类的信息
         *
         * subject:是动态代理类的实例
         *del：方法
         * "小芳"：参数
         *
         * subject被调用的时候：invoke会被执行
         */
      /*  System.out.println();
        Ticket subject = (Ticket)Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), railway
                .getClass().getInterfaces(), invocationHandler);
        subject.sellTicket("小芳");*/
      /*  subject.del("小芳");
        subject.updae("小芳");
        System.out.println();

        //一个委托类--委托类的一个处理器-委托类的一个动态代理类
        System.out.println();
        Drink woerma = new Woerma();
        InvocationHandler in1 = new DyamicProxy(woerma);
        Drink sub1 = (Drink)Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), woerma
                .getClass().getInterfaces(), in1);
        sub1.sellCoffee("小芳");

        System.out.println();
        Drink meitehao = new Meitehao();
        InvocationHandler iHandler1 =  new DyamicProxy(meitehao);
        Drink sub2 = (Drink)Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), meitehao
                .getClass().getInterfaces(), iHandler1);
        sub2.sellCoffee("小芳");*/

        System.out.println("-----------JDKProxy-------------");
        Ticket ticket = new Plane();
        JDKDyamicProxy proxy = new JDKDyamicProxy(ticket);
        Ticket planeProxyJDK = (Ticket)proxy.getProxy();
        planeProxyJDK.sellTicket("大黄");

       /* System.out.println("-----------CGLibProxy-------------");
        Ticket ticket1 = new Railway();
        Ticket railCGLIBproxy = (Ticket)new CglibDyamicProxy().createProxyObject(ticket1);
        railCGLIBproxy.sellTicket("bubblebee");*/


    }
}
