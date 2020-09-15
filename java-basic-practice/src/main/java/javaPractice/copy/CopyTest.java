package javaPractice.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 赋值
 * 传参
 * 拷贝：深拷贝，浅拷贝
 */
public class CopyTest {

    public static void main(String[] args) {

        /**
         * =
         */
        //赋值
        int num = 10;
        System.out.println(num);
        String s = "hello";
        System.out.println(s);

        num = 20;
        System.out.println(num);//20
        s = "java";
        System.out.println(s);//java


        //一个变量赋值给另一个变量
        int x = 1;
        System.out.println(x);//1
        int y = x;
        System.out.println(y);//1
        x = 20;//拷贝的是值
        System.out.println(x);//20   x改变 y不改变
        System.out.println(y);//1

        String s1 = "hello";
        System.out.println(s1);//hello
        String s2 = s1;
        System.out.println(s2);//hello
        s1 = "java";
        System.out.println(s1);//java  s1改变 s2不改变 (是因为string )   重新指向新的对象
        System.out.println(s2);//hello


        Vehicle v1 = new Vehicle();
        v1.age = 10;
        System.out.println(v1.age);//10
        Vehicle v2 = v1;
        System.out.println(v2.age);//10
        v1.age = 20;
        System.out.println(v1.age);//20  修改对象里的值
        System.out.println(v2.age);//20


        /**
         * 参数传参：参数传递基本上就是赋值操作。
         */
        CopyTest copyTest = new CopyTest();
        int m = 100;
        System.out.println(m);
        copyTest.test1(m);
        System.out.println(m);//不变

        Vehicle v3 = new Vehicle();
        v3.age = 400;
        System.out.println(v3.age);
        copyTest.test2(v3);
        System.out.println(v3.age);//跟着变了


        System.out.println("haha");
        copyTest.test3(v3);
        System.out.println(v3.age);//没变  因为v4指向了新的对象


        /**
         * 集合创建
         */
        List<String> list1 = new ArrayList<>();
        list1.add("11");
        list1.add("22");
        list1.add("33");
        System.out.println("list1:"+list1);

        List<String> list2 = new ArrayList<>(list1);//两个不是同一个
        System.out.println("list2:"+list2);

        list1.remove(list1.size()-1);
        System.out.println("修改后的list1:"+list1);
        System.out.println("list1修改后list2的值："+list2);


        List<List<String>> resList = new ArrayList<>();
        resList.add(list2);
        System.out.println(resList);


        list2.remove(list2.size()-1);
        System.out.println(list2);
        System.out.println(resList);//添加的是引用，引用指向的对象修改了，这个添加的引用所指向的对象也修改了


        /**
         * 数组
         */
        Integer[] array1 = {1,2,3,4};
        Integer[] array2 = array1.clone();//针对一维数组是深拷贝
        System.out.println(Arrays.asList(array1));
        System.out.println(Arrays.asList(array2));
        array1[0] = 10;
        System.out.println(Arrays.asList(array1));//
        System.out.println(Arrays.asList(array2));//没改变

        Integer[][] a={{3,1,4,2,5},{4,2}};
        Integer[][] b=a.clone();
        b[0][0]=10;
        System.out.println(Arrays.asList(a));
        System.out.println(Arrays.asList(b));

        System.out.println(b[0][0]+"  "+a[0][0]);
        System.out.println(a[0]==b[0]);

    }


    public void test1(int l){
        System.out.println(l);
        l = 200;
        System.out.println(l);

    }

    public void test2(Vehicle v4){
        System.out.println(v4.age);
        v4.age = 500;
        System.out.println(v4.age);
    }

    public void test3(Vehicle v4){
        System.out.println(v4.age);
        v4 = new Vehicle();//加入v4又创建了新的对象（指向新的对象）
        v4.age = 600;
        System.out.println(v4.age);

    }

}
