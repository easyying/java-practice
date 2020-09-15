package javaPractice.outofmemory;

import java.util.ArrayList;
import java.util.List;

public class TestOutOf {
    static class OOMObject{}

    public static void main(String[] args) {
        /**
         * 堆
         * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
         */
        /*List<OOMObject> list = new ArrayList<>();
        while(true){
            list.add(new OOMObject());
        }*/

        /**
         * stackoverflow  超出虚拟机规定的栈的深度
         */
        while (true){
            method();
        }

    }
    public static void method(){}
}
