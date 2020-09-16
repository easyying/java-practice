package javaPractice.proxy.jingtaiproxy;

public class Test {
    public static void main(String[] args) {

        //只有一个委托类
       /* Ticket proxyTicket = new ProxyTicket();
        proxyTicket.sellTicket("啊黄");*/

        //有多个委托类：都是同一类型的委托类（实现相同功能）
        Ticket proxyTicket = new ProxyTicket(new Railway());
        proxyTicket.sellTicket("小明");
        /*proxyTicket.updae("小明");
        proxyTicket.del("小明");
        //proxyTicket.sellTicket("小黄");
        System.out.println();

        Ticket proxyTicket1 = new ProxyTicket(new Plane());
        proxyTicket1.sellTicket("小明");
        proxyTicket1.updae("小明");
        proxyTicket1.del("小明");
        //proxyTicket1.sellTicket("小黄");*/


    }
}
