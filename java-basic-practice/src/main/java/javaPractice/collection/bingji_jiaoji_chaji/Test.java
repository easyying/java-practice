package javaPractice.collection.bingji_jiaoji_chaji;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Dog dog1 = new Dog(1,"狗狗1");
        Dog dog2 = new Dog(2,"狗狗2");
        Dog dog3 = new Dog(3,"狗狗3");
        Dog dog4 = new Dog(4,"狗狗4");

        Set<Dog> setNew = new HashSet<>();
        setNew.add(dog1);
        setNew.add(dog2);
        setNew.add(dog3);

        Set<Dog> setOld = new HashSet<>();
        setOld.add(dog2);
        setOld.add(dog3);
        setOld.add(dog4);

        Set<Dog> toProcess = new HashSet<>();
        // O(n)
        for (Dog d : setOld) {
            // O(1)
            if (!setNew.contains(d)) {
                toProcess.add(d);
            }
        }

        Set<Dog> toInsert = new HashSet<>();
        for (Dog d : setNew) {
            if (!setOld.contains(d)) {
                toInsert.add(d);
            }
        }




        List listnew = new ArrayList();
        listnew.add(dog1);
        listnew.contains(dog1);
//        listnew.add(dog2);
//        listnew.add(dog3);
//
        List listold = new ArrayList();
//        listold.add(dog2);
//        listold.add(dog3);
//        listold.add(dog4);

        //交集
        //listnew.retainAll(listold);//这样的话 交集的结果在listnew中
        //System.out.println(listnew);

        //并集
        //listnew.addAll(listold);//会有重复的 可以去重
        //System.out.println(listnew);

        //差集：去掉一个集合中包含另一个集合的值
        listnew.removeAll(listold);
        System.out.println(listnew);//注意此时listnew发生了变化！！！



        listold.removeAll(listnew);
        System.out.println(listold);





    }
}
