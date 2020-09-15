package javaPractice.nullIsEmpty;

import java.util.List;
import java.util.Map;

public class Animal {
    public String a ="Animal" ;
    private String m;
    private Map<Integer, List<String>> pics;   //图片信息

    public Map<Integer, List<String>> getPics() {
        return pics;
    }

    public void setPics(Map<Integer, List<String>> pics) {
        this.pics = pics;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }



    @Override public String toString(){
        return a;
    }
}
