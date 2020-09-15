package javaPractice.RPC.second;
/**
 * 1. 服务提供者的接口实现类
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "Hi," + name;
    }
}
