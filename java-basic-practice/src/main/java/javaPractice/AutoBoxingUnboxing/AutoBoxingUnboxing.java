package javaPractice.AutoBoxingUnboxing;

/**
 * 自动拆箱装箱机制
 *
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 100;
        Integer b = new Integer(100);//创建Integer对象：正常新建对象
        Integer m = 100;//创建Integer对象：自动装箱

        /**
         * 自动装箱  实际调用的是Integer.valueOf()
         */
        //方法一：
        Integer c = 100;//等价于：Integer i = Integer.valueOf(100);
        //方法二：
        Integer i = Integer.valueOf(100);

        //valueof!!!：对于–128到127（默认是127）之间的值，Integer.valueOf(int i) 返回的是缓存的Integer对象，而是直接引用常量池中的Integer对象（并不是新建对象）
        //而其他值，执行Integer.valueOf(int i) 返回的是一个新建的 Integer对象，所以范例中，i3与i4指向的是不同的对象。(新建对象)
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1==i2："+(i1==i2));//缓存，不新建对象 true  存储在常量池中
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println("i3==i4："+(i3==i4));//新建对象 false


        //注：127 这种只针对自动装箱
        Integer m1 = new Integer(127);
        Integer m2 = new Integer(127);
        System.out.println("m1==m2："+(m1==m2)); //false
        Integer m3 = new Integer(200);
        Integer m4 = new Integer(200);
        System.out.println("m3==m4："+(m3==m4));//false


        /**
         * 不使用自动装箱
         */
        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        System.out.println("i5==i6："+(i5==i6));//false

        /**
         * 自动拆箱 ,实际调用了 intValue（）
         */
        //方法一：也就是将对象中的基本数据从对象中自动取出
        Integer i7 = 10;//装箱
        int i8 = i7;//拆箱，实际上执行了 int t = i.intValue(); 等价于int i9 = i7.intValue();
        int i9 = i7.intValue();
        //方法二：在进行运算时，也可以进行拆箱。
        Integer i10= 90;
        Integer i11= new Integer(91);
        int i12 = 90;
        System.out.println("i10=" + i++);
        System.out.println("i10==i12:"+(i10==i12));//true i10自动拆箱成int类型再和i12比较





    }
}
