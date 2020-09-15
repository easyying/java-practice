package javaPractice.innerClass;

public class inTest  {

    public static class Person{
        public void eat(){
            System.out.println("Person eat");
        };

    }

    /*public static class Children extends Person{
        public void eat(){
            System.out.println("Children eat");
        };
    }
    */

    public static interface  House{
        public void eat();
    }
    public static class gress implements House{
        public void eat(){
            System.out.println("gress  eat");
        };
    }

    public static void main(String[] args) {
        //正规类
        //Person p  = new Children();
        //p.eat();

        //匿名内部类：继承一个类
        Person p1 = new Person(){//父类型为类的匿名内部类例程
            public void eat(){
                System.out.println("Children eat");
            };
        };
        p1.eat();

        //正规接口
        House h1 = new gress();  //如果这个类只用一次，还得多写一个这个类，然后再也不用了，所以用匿名内部类
        h1.eat();

        //匿名内部类：实现一个接口  默认实现了House这个接口
        House h = new House() {//父类型为接口的匿名内部类例程
            @Override
            public void eat() {
                System.out.println("House接口eat");
            }
        };
        h.eat();

    }


}
