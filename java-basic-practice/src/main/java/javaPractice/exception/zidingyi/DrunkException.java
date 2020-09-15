package javaPractice.exception.zidingyi;

/**
 * 自定义的异常
 */
public class DrunkException extends Exception {
    String msg;

    public DrunkException(String msg){
        this.msg = msg;
    }

}
