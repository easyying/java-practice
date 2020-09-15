package javaPractice.object;

public class Student {
    String name;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){


    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
       /* return "姓名："+name +",年龄："+age;*/
        return "姓名："+name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){//对于任何非空引用值 x，x.equals(null) 都应返回 false
            return false;
        }
        if(this==obj)//{比较两对象的引用，地址是否相同，相同肯定指向同一个对象,同一个对象内容肯定相同
            return true;

        /**
         * 如果指向不同对象的话，则比较两个引用指向的对象的类型
         * 类型不同：则返回false
         * 类型相同：则转换为该类型，然后比较对象中的一个个属性
         *
         * 比较是否是同一个类型，有两种方法！！！！！！！！！
         * 方法一：比较类型类：比较该实例的类型类和已知类的类型类是否相同
         * 方法二：比较该实例是否是已知类型的实例
         */
        if(obj.getClass()!=getClass()){//getClass可以得到类对象，new 类（）得到的对象是：类的对象
            return false;//判断两个对象类型相同不，连类型都不相同肯定不相等
        }
        //和上面的用一个就行
        /*if(! (obj instanceof Student)){
            return false;//判断obj实例是否是Student类的实例
        }*/

        //如果类型相同的话，将传进来的对象和本身比较的对象转为同一个类型
        Student s = (Student)obj;
        //转为同一个对象后，比较对象里面的属性是否相同
        if(!(s.name==name&&s.age==age)){
            return false;
        }
        return true;

    }

    @Override
    public int hashCode(){
       /* return name *(age.hashCode()) ;  */

        //注意：hashCode是引用类型调用的，
        return age *(name.hashCode());//根据类中的所有属性求得一个hash值，作为唯一标识这个类的唯一hash值

    }



}



