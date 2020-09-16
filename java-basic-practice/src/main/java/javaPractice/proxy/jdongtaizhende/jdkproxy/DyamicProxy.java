package javaPractice.proxy.jdongtaizhende.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态生成代理类：中间类！！！！！！
 */
public class DyamicProxy implements InvocationHandler {//InvocationHandler是本身存在的接口

    //要代理的真实对象：委托类（目标对象）
    private Object obj;
    //构造方式 初始化要代理的真实对象:关联的这个实现类继委托类的方法被调用时将被执行
    /**
     *InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数
     * @param obj
     */

    public DyamicProxy(Object obj){
        super();
        this.obj = obj;
    }

    //返回代理对象
    public  Object getProxy(){//将目标对象传入进行代理
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this); //返回代理对象
    }

    @Override
    //proxy表示代理，method表示原对象即代理对象被调用的方法，args表示方法的参数   invoke：关联的动态代理类对象被调用的时候会被执行
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*原对象即代理类的方法调用前信息*/
        System.out.println("买票前验证用户真实性................");
        //调用委托类目标方法！！！！！！！
        Object ret = method.invoke(obj, args);
        /*原对象即代理类的方法调用后信息*/
        System.out.println("买票后成功后数据录入自己平台.............");
        return ret;
    }

}
