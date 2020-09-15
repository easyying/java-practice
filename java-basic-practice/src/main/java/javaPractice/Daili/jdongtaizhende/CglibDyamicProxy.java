/*
package javaPractice.Daili.jdongtaizhende;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDyamicProxy implements MethodInterceptor {

    private Object targetObject;// CGLib需要代理的目标对象

    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;// 返回代理对象
    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        System.out.println("cglib 打印票");
        obj = method.invoke(targetObject, args);
        return obj;
    }

}
*/
