package javaPractice.Daili.jdongtaizhende;

/**
 * Woerma超市卖
 */
public class Woerma implements Drink {
    @Override
    public void sellCoffee(String name) {
        System.out.println("Woerma为【"+name+"】卖了咖啡");
    }

    @Override
    public void sellOrange(String name) {
        System.out.println("Woerma为【"+name+"】卖了橙汁儿");
    }

    @Override
    public void sellBanana(String name) {
        System.out.println("Woerma为【"+name+"】卖了香蕉汁");
    }
}
