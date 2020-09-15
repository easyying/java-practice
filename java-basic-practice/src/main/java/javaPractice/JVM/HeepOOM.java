package javaPractice.JVM;



import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出
 */
public class HeepOOM {
    public int a;

    public static void main(String[] args) {
        List<HeepOOM> list = new ArrayList<>();
        while (true){
            list.add(new HeepOOM());
        }


    }

}
