package javaPractice.exception;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionTest {
    private static Logger logger = LoggerFactory.getLogger(ExceptionTest.class);
    public static void main(String[] args) {

        //System.out.println(add(5,6));
        try{
            //test6();
            System.out.println("test6()的结果："+test6());
        }catch (Exception e){
            System.out.println("main里面的方法去解决");
        }


    }
    private static int add(int a , int b){
        int sum = a + b;
        try {
            System.out.println("try里面的a的值："+ a);
            System.out.println("try里面的b的值："+ b);
            //return sum;  //返回的是之前保存的值！！！！finally并不能改变他！！！！！
            /*int tempsum = sum;
            return tempsum;*/
        }catch (Exception e){
            System.out.println("catch语句块");
            return sum;
        }finally {
            sum = 50;
            System.out.println("finally语句块"+ sum);
            //return sum;

        }
        return -1;
    }

    private static void fun1() throws ClassNotFoundException{//2. 声明抛出异常的方法
        throw new ClassNotFoundException("第一个异常：类找不到");//1.声明要抛出的异常
    }

    //catch的多级使用
    //做了处理，哪怕catch里面是空的，只要用了就是处理了
    private static void test() throws ClassNotFoundException {
        System.out.println("test方法被调用啦！");
        try{
           fun1();//3. 调用可能抛出异常的方法

        }catch (ClassNotFoundException ex){


           /* ex.printStackTrace();//打印出异常的原因，以及异常栈
            System.out.println();

            //测试打印异常
            logger.error("异常的原因1 ,message：" ,ex.getMessage());
           // System.out.println(ex.getMessage());
            //System.out.println("异常的原因1 ,message：" + ex.getMessage());
            System.out.println();

            logger.error("异常的原因2 无message：",ex);// 打印出异常的原因，以及异常栈
            //System.out.println(ex);
            //System.out.println("异常的原因2 无message：" + ex);*/


        }catch (Exception ex){
            /*logger.error("异常的原因3 ,message：" ,ex.getMessage());
            System.out.println(ex.getMessage());
            System.out.println("异常的原因3 ,message：" + ex.getMessage());

            logger.error("异常的原因4 无message：",ex);
            System.out.println(ex);
            System.out.println("异常的原因4 无message：" + ex);*/

        }finally {
            System.out.println("finally");
        }
        System.out.println("异常结束之后执行异常下面的！！");//执行呢！如果处理了则执行下面的语句
    }


    //没做处理，直接抛出，但是没做处理下面的语句不执行
    private static void test11() throws ClassNotFoundException{
        System.out.println("开始调用不做任何处理的语句");
        fun1();//不做任何处理，直接抛出！！
        System.out.println("不做任何处理，直接抛出下面的语句");//不执行！！！如果没处理，则不执行下面的语句！=
    }

    //没做处理，直接抛出，想执行没做处理后的语句！
    private static void test111() throws ClassNotFoundException{
        try{
            System.out.println("test111");
            fun1();
        }finally {//finally不算做处理！！！！！
            System.out.println("finally");
        }

    }
    //try的 catch里面有throw：参考zidingyi文件夹里面的



    /**
     * 语法！
     */
    private static void test1(){
        try{

        }catch (Exception e){

        }
    }
    private static void test2(){
        try{

        }finally {

        }
    }
    private static void test3(){
        try{

        }catch (Exception e){

        }finally {

        }
    }
    private static void test4(){
        try{

        }catch (ClassCastException e){

        }catch (Exception e)
        {

        } finally {

        }
    }

    /**
     * 重点！！！
     */
    private static void test5(){
        try{
            return;
        }catch (Exception e){
            return;
        }finally {
            return;
        }
    }


    /**
     * 测试和return有关的！！！！！
     */
    private static int  test61(){
        int x = 1;
        try{
            System.out.println("try开始啦！x =" + x);//1
            test7();
            x = 100;
            System.out.println("x = 100");
            return x++;  //要是这里有finally的执行顺序；和没finally的执行顺序
        }catch (Exception e){
            System.out.println("catch开始啦！,x" + x);//1
            throw new Exception(e.getMessage());
            //return x++;//1
        }finally {
            x++;//3
            System.out.println("finally开始啦！！！,x = " + x);//3
            return x;
        }
        /*System.out.println("finally下面的,x= "+x);//1
        int y = 100;
        return y;//100*/

    }

    private static int test6(){
        int x = 1;
        try{
            System.out.println("try开始啦！x =" + x);//1
            test7();
            x = 100;
            System.out.println("x = 100");
            return x++;
        }finally {
            x++;//2
            System.out.println("finally开始啦！！！,x = " + x);//2
            return x;
        }
        /*System.out.println("finally下面的,x= "+x);//1
        int y = 100;
        return y;//100*/

    }

    private static void test7() throws Exception {
        throw new Exception("test7");
    }

   /* private static void test8(){
        try{
            test7();
        }finally {

        }
    }*/

    private static int test9(){
        int s=1;
        try{
            test7();

        }finally {
            return s;
        }
    }






}
