package javaPractice.string;

public class StringPractice {
    public static String BASEINFO = "Mr.Y";
    public static final int COUNT = 2000000;

    public static void doString(){
        String str  = new String(BASEINFO);
        Long starttime = System.currentTimeMillis();
        for(int i = 0 ;i<COUNT;i++){
           str = str+"miss";
        }
        Long endtime = System.currentTimeMillis();
        System.out.println((endtime-starttime)+" millis has costed when used String.");
    }
    public static void doStringBuffer(){

        StringBuffer sb = new StringBuffer(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis has costed when used StringBuffer.");

    }
    public static void doStringBuilder(){
        StringBuilder sb = new StringBuilder(BASEINFO);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            sb = sb.append("miss");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime - starttime)
                + " millis has costed when used StringBuilder.");

    }






    public static void main(String[] args) {
        /**
         * String创建：new或这字符串
         */
        String s = "nihao";
        String s1 = new String("nihaostring");
        //获取字符串长度
        s1.length();
        //获取字符串中的字符
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }



        /**
         * StringBuffer创建：只能是new
         */
        //注：不能把字符串的值直接赋值给StringBuffer  "nihao"默认是String类型
        //StringBuffer s1 = "nihaoyaya";
        //StringBuffer s2= s;
        StringBuffer sf = new StringBuffer("nihaoya");
        StringBuffer sf1 = new StringBuffer(s);
        StringBuffer sf2  = new StringBuffer(s1);
        //获取字符串长度
        sf1.length();

        /**
         * StringBuffer添加：可以添加buffer的或者string的
         */
        sf.append(s);
        sf.append(s1);
        sf.append(sf1);

        /**
         * StringBuffer和String的转换
         */
        String s2 = sf1.toString();
        StringBuffer sf3= new StringBuffer(s);

    }



}
