package javaPractice.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Object 类的常用方法
 */
public class ObjectMethodTest {
    public static void main(String[] args) {
        /**
         * 默认调用toString()
         */
        //打印的时候默认调用：
        Student s = new Student("杨幂",18);
        System.out.println(s);//直接输出对象信息
        System.out.println(s.toString());//调用父类方法输出对象信息
        System.out.println("姓名："+s.name +",年龄："+s.age);//输出对象属性
        System.out.println();

        //字符串拼接的时候默认调用
        Student s1 = new Student("李易峰",18);
        String s2 = s1 + "：杨幂";
        System.out.println(s2);
        System.out.println();

        /**
         * 默认调用equals()
         */
        Student s3 = new Student("赵丽颖",18);
        Student s4 = new Student("赵丽颖",18);
        System.out.println("s3.equals(s4):"+s3.equals(s4));
        System.out.println();

        /**
         * 默认调用hashCode()
         * 一般equals和hashCode混合使用
         * equals相等---则hashCode相等
         *
         * equals不相等---则hashCode相等||不相等
         *
         * 所以：则hashCode不相等---equals一定不相等
         * hashCode相等---equals不相等 || 相等
         */
        System.out.println("是s3："+s3.hashCode());
        System.out.println("是s4："+s4.hashCode());
        System.out.println();

        /**
         * 测试集合hashSet
         */
        List<Student> list = new ArrayList<Student>();
        Set<Student> set  =  new HashSet<Student>();

        //equals原 hashCode原
        Student s5 = new Student("胡歌",18);
        Student s6 = new Student("胡歌",18);
        System.out.println("s5==s6:"+ (s5==s6));
        System.out.println("s5.equals(s6):"+ s5.equals(s6));
        System.out.println("s5.hashCode():"+s5.hashCode());
        System.out.println("s6.hashCode():"+s6.hashCode());
        list.add(s5);
        list.add(s6);
        set.add(s5);
        set.add(s6);
        System.out.println("list.size()"+list.size());
        System.out.println("set.size()"+set.size());

        Student s0 = new Student();
        s0.setName(null);


    }

}
