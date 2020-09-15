package javaPractice.returnPractice;

/**
 * return的练习
 * return所在的方法无返回值：return在方法中间；return在方法结尾（默认可以不写）
 * return所在的方法有返回值
 *
 */
public class ReturnTest {
    public static void main(String[] args) {
        System.out.println("无返回值：return在方法中间-------------");
        voidMid(10);
        System.out.println();

        System.out.println("无返回值：return在方法结尾-------------");
        voidEnd(10);
        System.out.println();

        System.out.println("有返回值：-------------");
        int m = Mid(10);
        System.out.println("return返回后 m的值："+ m);
    }

    //无返回值：return在方法中间
    private static void voidMid(int x){
        System.out.println("无返回值的方法被调用啦！！！");
        if(x == 10){
            return;
        }
        System.out.println("无返回值的 return下面的语句不执行了！");
    }
    //无返回值：return在方法结尾
    private static void voidEnd(int x){
        System.out.println("无返回值的方法被调用啦！！！");
        System.out.println("无返回值的 return下面的语句不执行了！");
    }


    //有返回值：return在方法中间
    private static int Mid(int x){
        System.out.println("有返回值的方法被调用啦！！！");
        if(x == 10){
            return ++x; //注：这里 先执行++x 然后再return
            //注：这个下面不能有别的语句啦，因为已经return啦！！！
            //return x++; //注：这里 先return 然后再执行x++
        }
        System.out.println("有返回不执行了呢！！！");
        return 0;
    }


}
