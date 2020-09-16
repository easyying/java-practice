package javaPractice.proxy.jingtaiproxy;

public class Plane implements Ticket {
    @Override
    public void sellTicket(String name) {
        System.out.println("飞机部门为【"+name+"】生成一张飞机票了");
    }

    @Override
    public void updae(String name) {
        System.out.println("飞机部门为【"+name+"】修改一张飞机票了");
    }

    @Override
    public void del(String name) {
        System.out.println("飞机部门为【"+name+"】删除一张飞机票了");
    }
}
