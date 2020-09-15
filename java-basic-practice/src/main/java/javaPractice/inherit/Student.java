package javaPractice.inherit;

public class Student extends Person {

    private String name = "student";

    public Student(String name, int age) {
        super(name, age);
        this.name = name ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }




}
