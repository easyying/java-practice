package javaPractice.variable;

public class VeariableCompar {
    /**
     * 成员变量【实例变量】
     */
    //基本类型
    private int id; //成员变量(全局变量、私有字段)、实例变量(表示该Id变量既属于成员变量又属于实例变量)
    public int age;// 在实际中一般都会设置为private


    public String name;//成员变量(公共字段)、实例变量
    public String name1 = "nini";//成员变量(公共字段)、实例变量

    public static String height;//成员变量(字段)、类变量(静态变量)
    public static String height1 = "都很高";//成员变量(字段)、类变量(静态变量)

    public static final String mood1 = "开心";//成员变量(公共字段)、常量  必须初始化常量

    public void study(){
        String study;
        String study1="learning";//局部变量
    }



    int a1;
    Integer s1 = 2;
    static Integer s2;
    final static Integer S3 = 29;
    public void test(){
        int a ;
        Integer s ;
        //System.out.println(a);//使用局部变量得赋值  基本类型赋值
        //System.out.println(s);//使用局部变量得赋值  引用类型赋值
        System.out.println(s2);
        Integer s1 = 3;
        System.out.println("s1:"+s1);//局部变量和成员变量同名时，局部变量具有更高的优先级

    }
    public static void main(String[] args) {
        VeariableCompar v = new VeariableCompar();
        v.test();
        System.out.println(v.a1);//使用成员变量无需赋值  基本类型会有默认值
        System.out.println(v.s1);//使用成员变量无需赋值  引用类型会是null
        System.out.println(s2);
        //System.out.println(a);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public static String getHeight() {
        return height;
    }

    public static void setHeight(String height) {
        VeariableCompar.height = height;
    }

    public static String getHeight1() {
        return height1;
    }

    public static void setHeight1(String height1) {
        VeariableCompar.height1 = height1;
    }

    public static String getMood1() {
        return mood1;
    }









}
