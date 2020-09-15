package javaPractice.exception;

import javaPractice.exception.duotai.ClothException;
import javaPractice.exception.duotai.LingerieException;
import javaPractice.exception.duotai.PantsException;

public class ExceptionTest02 {

    public static void main(String[] args) {
      /*  try {
            fun1();
            System.out.println("wu");
        }catch (Exception e){
            System.out.println("jiejue ");
        }*/
    /*  try {
          fun2();
      }catch (Exception e){

      } finally {
          System.out.println("main");
      }
*/
        getfun1();

    }

    /**
     *
     * @throws Exception
     */
    public static void fun1() throws Exception{
        throw new Exception("");//  有throws Exception不一定有new throw  但是有new throw，一定有throws Exception
    }

    /**
     * 方法栈
     * @throws Exception
     */
    public static void fun2() throws Exception{
        try {
            fun3();
        }finally {
            System.out.println("fun2");
        }


    }
    public static void fun3() throws Exception{
        throw new Exception();
    }

    /**
     * 异常的多态
     */
    //声明两个可能的异常类型
    public static void fun4(String s) throws LingerieException,PantsException {
        if(s.equals("123")){
            throw new LingerieException();
        }else {
            throw new PantsException();
        }
    }
    public static void fun6() {
        try {
            fun4("123");
        }catch (LingerieException e){//如果抛出的是LingerieException 就运行这里

        }catch (PantsException e){//如果抛出的是PantsException 就运行这里

        }
    }
    public static void fun7() {
        try {
            fun4("123");
        }catch (ClothException e){//以抛出的异常们的父类型来catch

        }

    }

    //以异常的父类型抛出
    public static void fun5(String s) throws ClothException{
        if(s.equals("123")){
            throw new LingerieException();
        }else {
            throw new PantsException();
        }
    }

    public static void fun8() {
        try {
            fun5("123");
        }catch (LingerieException e){//如果抛出的是LingerieException 就运行这里 两者的处理不同，则异常分别处理

        }catch (PantsException e){//如果抛出的是PantsException 就运行这里

        }catch (ClothException e){//从小-大  否则大-小 则小绝对用不到

        }
    }

    //大-小
  /*  public static void fun9() {
        try {
            fun5("123");
        }catch (ClothException e){//如果抛出的是LingerieException 就运行这里 两者的处理不同，则异常分别处理

        }catch (PantsException e){//如果抛出的是PantsException 就运行这里

        }catch (LingerieException e){//从小-大  否则大-小 则小绝对用不到

        }
    }*/


    /**
     * finally
     */
    public static int getfun1(){
        int i = 1;
        try {
           i =  refun2 (i);
           System.out.println("try i:"+ i);
           return i;
        }catch (Exception e){
           i++;
            System.out.println("catch i:"+ i);
           return i;
        }finally {
            i+=100;
            System.out.println("finally i:"+ i);
        }

    }

    public static int refun2(int i) throws Exception{
        if(i == 0 ){
            return 10;
        }else {
            throw new Exception("20");
        }
    }

}
