package javaPractice.RPC.second;

/**
 * 1. 服务提供者的接口
 * 运行在服务器端，提供服务接口定义与服务实现类。
 */
public interface HelloService {
    public String sayHi(String name);
}
