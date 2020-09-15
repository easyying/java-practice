package javaPractice.inherit;

import java.util.Arrays;

public class Person {
    //@NotBlank(message = "闪贷订单号不能为空")
    private String name = "person";
    private int age = 1;

    public Person(String name ,int age ){
        if(name != null){
            this.name = name;
        }
        this.age = age;
    }
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


    public static void main(String[] args) {
        //String s= "";
        //System.out.println(s.charAt(0));

        String s[]={"12,34"};
        String s1 = Arrays.toString(s);
        System.out.println(s1);

    }

}
