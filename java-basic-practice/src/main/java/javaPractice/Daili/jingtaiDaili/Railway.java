package javaPractice.Daili.jingtaiDaili;

/**
 * 铁路部卖火车票
 */
public class Railway  implements Ticket{

    @Override
    public void sellTicket(String name) {
        System.out.println("铁路部门为【"+name+"】生成一张火车票了");
    }

    @Override
    public void updae(String name) {
        System.out.println("铁路部门为【"+name+"】修改一张火车票了");
    }

    @Override
    public void del(String name) {
        System.out.println("铁路部门为【"+name+"】删除一张火车票了");
    }

}
