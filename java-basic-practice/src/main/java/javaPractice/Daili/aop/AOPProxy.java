package javaPractice.Daili.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AOPProxy implements InvocationHandler {
    public Object obj;

    public AOPProxy(Object obj){
        this.obj = obj;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("要打印日志啦");
        Object re = method.invoke(obj,args);
        System.out.println("业务代码执行完毕啦");

        return  re;
    }
}
