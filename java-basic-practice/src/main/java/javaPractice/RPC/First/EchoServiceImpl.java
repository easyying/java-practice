package javaPractice.RPC.First;
/**
 * 一.服务端
 * 2. 接口实现的类
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String sayHello(String name) {
        return name == null ? "hello nobody": "hello" + name;
    }
}
