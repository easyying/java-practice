package javaPractice.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 针对ArrayList LinkedList的测试
 */
public class Test {
    public static void main(String[] args) {
        ArrayList s = new ArrayList();
        LinkedList l = new LinkedList();
        CopyOnWriteArrayList s1 = new CopyOnWriteArrayList();

        HashMap hashMap = new HashMap();
        Hashtable h = new Hashtable();


        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        //ArrayList：泛型设计的一个具体实现
        List list = new ArrayList();
        list.add(animal);
        list.add(dog);
        list.add(cat);


    }

}
