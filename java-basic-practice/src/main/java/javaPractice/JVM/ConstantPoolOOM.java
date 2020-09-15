package javaPractice.JVM;



import java.util.ArrayList;
import java.util.List;

/**
 * 方法区和运行时常量池溢出
 */
public class ConstantPoolOOM {
    //1.6及之前

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        int i = 0;
        while(true){
            s.add(String.valueOf(i++).intern());
        }

    }

}
