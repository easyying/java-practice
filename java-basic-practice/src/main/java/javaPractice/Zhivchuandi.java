package javaPractice;

public class Zhivchuandi {
    private int d=5;


    public static void main(String[] args) {
        Zhivchuandi zhivchuandi = new Zhivchuandi();

        int m =2;
        System.out.println(m);
        Zhivchuandi.zihi(m);
        System.out.println(m);


        System.out.println(zhivchuandi.d);
        Zhivchuandi.yinyong(zhivchuandi);
        System.out.println(zhivchuandi.d);

        String s1 ="hello";
        System.out.println(s1);
        Zhivchuandi.Stri(s1);
        System.out.println(s1);

        System.out.println();

        StringBuffer b1 = new StringBuffer("hello");
        System.out.println(b1);
        Zhivchuandi.StriB(b1);
        System.out.println(b1);

    }
    public static void zihi(int m1 ){
        m1= 3;
        System.out.println(m1);
    }
    public static void yinyong(Zhivchuandi z1){
        z1.d =4;
        System.out.println(z1.d);

    }

    public static void Stri(String s2 ){
        s2=s2+"world";
        System.out.println(s2);
    }


    public static void StriB(StringBuffer b2 ){
        b2.append("world");
        System.out.println(b2);
    }


}
