package javaPractice.Daili.jdongtaizhende.cglibdongtaidaili;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDyamicProxy implements MethodInterceptor {

    private Object targetObject;// CGLib需要代理的目标对象

    /**
     * 生成cglib动态代理类 通过CGLIB动态代理获取代理对象的过程
     * @param obj
     * @return
     * Enhancer类是CGLib中的一个字节码增强器
     * 执行enhancer.create()动态生成一个代理类
     */

    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();//创建Enhancer对象，类似于JDK动态代理的Proxy类
        enhancer.setSuperclass(obj.getClass());//设置目标类的字节码文件
        enhancer.setCallback(this);//设置回调函数
        Object proxyObj = enhancer.create();//create方法正式创建代理类
        return proxyObj;// 返回代理对象
    }

    //创建一个拦截器，实现接口net.sf.cglib.proxy.MethodInterceptor，用于方法的拦截回调
    @Override
    public Object intercept(Object proxy, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        System.out.println("cglib 打印名字");
        obj = method.invoke(targetObject, args);
        return obj;
    }

}
