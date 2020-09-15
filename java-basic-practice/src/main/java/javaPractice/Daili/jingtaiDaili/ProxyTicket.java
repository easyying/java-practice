package javaPractice.Daili.jingtaiDaili;

/**
 * 代理类：卖火车票
 */
public class ProxyTicket implements Ticket {
    //只有一个委托类的话
 /*   private Railway railway;//目标对象

    @Override
    public void sellTicket(String name) {
        if(railway == null){
            railway = new Railway();
        }
        System.out.println("买票前验证用户真实性................");
        railway.sellTicket(name);
        System.out.println("买票后成功后数据录入自己平台.............");

    }

    @Override
    public void updae(String name) {
        System.out.println("开始修改票................");
        railway.updae(name);
        System.out.println("修改票完成.............");
    }

    @Override
    public void del(String name) {
        System.out.println("开始删除票................");
        railway.del(name);
        System.out.println("删除票完成.............");
    }*/

    //有多个委托类的话
    private Ticket ticket;//目标对象
    public ProxyTicket(Ticket ticket){//通过构造方法传入目标对象
        this.ticket = ticket;
    }
    @Override
    public void sellTicket(String name) {
        //添加日志打印功能
        System.out.println("开始买票................");//这是切面
        ticket.sellTicket(name);
        System.out.println("买票完成.............");//这是切面

    }

    @Override
    public void updae(String name) {
        System.out.println("开始修改票................");
        ticket.updae(name);
        System.out.println("修改票完成.............");
    }

    @Override
    public void del(String name) {
        System.out.println("开始删除票................");
        ticket.del(name);
        System.out.println("删除票完成.............");
    }
}
