package javaPractice.exception.test1;

public class Test1 {
    public static void main(String[] args) {
        int f = 0;
        try {
           f = fun1();
        }catch (Exception e){
            System.out.println("main:"+f);
        }
    }

    public static int  fun1() throws Exception{
        try {
            fun2();
        }catch (Exception e){
            int m = 10 ;
            System.out.println("fun1:"+ m);
            e.printStackTrace();
            //return m;
            throw e;
        }
        return  0;

    }

    public static void fun2() throws Exception{
       throw new Exception("抛异常了呢");
    }


}
