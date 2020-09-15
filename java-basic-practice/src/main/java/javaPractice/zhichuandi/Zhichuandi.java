package javaPractice.zhichuandi;

public class Zhichuandi {

    public static void main(String[] args) {
        int a = 2;
        System.out.println(change(a));
        String b = "1";
        System.out.println(change(b));
        StringBuilder c = new StringBuilder("6");
        System.out.println(change(c));
    }

    public static int change( int a ){
        a=3;//不变
        return a;
    }

    public static String change( String b ){
        b = "123";//不变
        return b;
    }

    public static StringBuilder change( StringBuilder c ){
        c.append("666");//改变
        return c;
    }
    //Integer




}
