package javaPractice.RPC.second;

import java.io.IOException;
/**
 * 2. 服务中心实现类的接口
 *
 */
public interface Server {
    public void stop();

    public void start() throws IOException;

    public void register(Class serverInterface, Class impl);

    public boolean isRunning();

    public int getPort();

}
