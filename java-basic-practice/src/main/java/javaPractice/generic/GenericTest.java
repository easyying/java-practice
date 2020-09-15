package javaPractice.generic;

import javaPractice.generic.ceshiyongli.Apple;
import javaPractice.generic.ceshiyongli.Banana;
import javaPractice.generic.ceshiyongli.Fruits;
import javaPractice.generic.ceshiyongli.Pinapple;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        //https://www.cnblogs.com/bethunebtj/p/4680532.html
        System.out.println(String.class);//创建的类的类型信息
        String s1= "";
        System.out.println(s1.getClass());
        System.out.println(String.class.getName());


        /**
         * 测试泛型类和泛型方法
         */
        String[] str = {"Mary","had","a","little","lamb"};
        //Pair<String> mm = minax(str);
        //普通函数，返回泛型类：找最大最小值
        Integer[] ii = {3,4,1,5,2};
        Pair<Integer> mm1 = minax(ii);
        //System.out.println("min = " + mm1.getFirst());
        //System.out.println("max = " + mm1.getSecond());

        //泛型方法:找出最小值
         Integer min = findmin(ii);

        //泛型方法：找最大最小值
        String[] str1 = {"66","33","44","11","22"};
        Pair<String> tt = getminmax(str1);
        //System.out.println("min = " + tt.getFirst());
        //System.out.println("max = " + tt.getSecond());

        //调用泛型函数
        String s = ArrayAlg.getmiddle("","",null);
        //ArrayAlg.<String>getmiddle();

        /**
         * 测试数组和泛型的区别
         */
        //数组
        System.out.println("数组");
        Fruits[] fruits = {new Apple(),new Banana(),new Pinapple()};
        Banana[] bananas = {new Banana(),new Banana(),new Banana()};
        takeEat(fruits);
        takeEat(bananas);

        //泛型：
        System.out.println("泛型");
        ArrayList<Fruits> fruits1 = new ArrayList<>();
        fruits1.add(new Apple());
        fruits1.add(new Banana());
        fruits1.add(new Pinapple());
        ArrayList<Banana> bananas1 = new ArrayList<>();
        bananas1.add(new Banana());
        bananas1.add(new Banana());
        takeEat1(fruits1);
        //takeEat1(bananas1);
        takeEat2(bananas1);//万用符

        //测试能否通过
        //ArrayList<Banana> bananas2 = new ArrayList<Fruits>();
        //ArrayList<Fruits> fruits2 = new ArrayList<Banana>();

        List<Fruits> list = new ArrayList<Fruits>();
        ArrayList<Banana> bananas4 = new ArrayList<Banana>();
        //ArrayList<Fruits>  fruits3 = bananas4;
        List<Banana> bananasList = bananas4;
        //ArrayList<Object> objects = new ArrayList<Banana>();


    }

    //普通方法，但是返回泛型类：迅速找出最大值和最小值：
    public static Pair<Integer> minax(Integer[] a){
        if(a == null || a.length == 0)
            return null;
        Integer min = a[0];
        Integer max= a[0];
        for (int i = 1; i < a.length; i++) {
           if(min.compareTo(a[i])>0)
               min = a[i];
           if(max.compareTo(a[i])<0)
               max = a[i];
        }
        return new Pair<>(min,max);//???为啥要加？？？因为表示这是衣蛾泛型类的构造函数
    }

    // 泛型方法：迅速找出最小值:对类型变量的限定
    public static <T extends Comparable> T findmin(T[] a){
        if(a == null || a.length == 0){
            return null;
        }
        T min = a[0];
        for (int i = 1; i < a.length ; i++) {
            if(min.compareTo(a[i]) > 0)
                min = a[i];
        }
        return min;
    }

    //这个是泛型方法，返回泛型类！！！:找出数组中的最大值和最小值：
    public static <T extends Comparable> Pair<T> getminmax(T[] a){
        if(a == null || a.length == 0){
            return  null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0)
                min = a[i];
            if(max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min,max);
    }

    static class ArrayAlg{
        public static <T> T getmiddle(T...a){//定义一个泛型函数
            return a[a.length/2];
        }

    }

    public static void takeEat(Fruits[] fruits){
        for(Fruits f : fruits){
            //f.eat();
            f.bark();//必须只能调用该引用所属的类的方法
        }
    }

    public static void takeEat(Banana[] bananas){
        for(Banana b : bananas){
            //f.eat();
            b.bananaUnique();//必须只能调用该引用所属的类的方法
        }
    }


    public static void takeEat1(ArrayList<Fruits> fruits){
        for(Fruits f : fruits){
            f.eat();
        }
    }

    //万用符
    public static void takeEat2(ArrayList<? extends Fruits> fruits){
        //fruits.add(new Apple()); 不可以！！！！
        for(Fruits f : fruits){
            f.eat();
        }
    }

    public static void takeEat3(ArrayList<? extends Fruits> one, ArrayList<? extends Fruits> two){
    }
    public static <T extends Fruits> void takeEat4(ArrayList<T> one ,ArrayList<T> two){
    }


}
