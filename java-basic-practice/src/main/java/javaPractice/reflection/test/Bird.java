package javaPractice.reflection.test;

/**
 * 反射
 *
 */
public class Bird {

    private String name;
    public Integer age;

    public Bird(){

    }
    public Bird(String name){
        this.name = name;
    }

    public Bird(Integer age){
        this.age = age;
    }

    public Bird(String name,int age){
        this.name = name;
        this.age = age;
    }



    public void info(){
        System.out.println("执行无参数的info方法");
    }

    public void info(String name){
        System.out.println("执行有参数的info方法:"+"其str参数值:" + name);
    }
    public void fun(Integer age){
        System.out.println("执行参数的fun方法:"+"其age参数值:" + age);
    }

    @Override
    public String toString(){
        return name + age;
    }

}
