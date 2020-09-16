package javaPractice.Daili.jdongtaizhende.cglibdongtaidaili;

/**
 * 没有实现接口的类
 */
public class Student {
    public String method1(String paramName) {
        System.out.println("打印paramName：" + paramName);
        return paramName;
    }

    public int method2(int count) {
        return count;
      }


    @Override
    public String toString() {
        return "Student []"+ getClass();
    }
}
