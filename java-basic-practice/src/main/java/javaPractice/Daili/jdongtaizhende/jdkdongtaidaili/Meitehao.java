package javaPractice.Daili.jdongtaizhende.jdkdongtaidaili;

public class Meitehao implements Drink {
    @Override
    public void sellCoffee(String name) {
        System.out.println("Meitehao为【"+name+"】卖了咖啡");
    }

    @Override
    public void sellOrange(String name) {
        System.out.println("Meitehao为【"+name+"】卖了橙汁儿");
    }

    @Override
    public void sellBanana(String name) {
        System.out.println("Meitehao为【"+name+"】卖了香蕉汁");
    }
}
