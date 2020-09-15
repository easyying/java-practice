package javaPractice.exception.zidingyi;

public class zidingyiTest {

    public static void main(String[] args){

        zidingyiTest ct = new zidingyiTest();
        try{
            ct.test2();
        }catch (Exception e){
            e.printStackTrace();//打印一下
        }
    }
    public void test1() throws DrunkException{//抛出喝大了的异常
        throw new DrunkException("喝车别开酒");

    }

    public void test2() {//调用test1(),捕获"喝车别开酒"异常，并且包装成运行时异常，继续抛出
        try {
            test1();
        }catch (DrunkException e){
            RuntimeException  newException = new RuntimeException(e);//
            throw newException;//
        }
    }

}
