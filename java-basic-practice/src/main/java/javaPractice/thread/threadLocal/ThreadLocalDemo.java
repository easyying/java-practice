package javaPractice.thread.threadLocal;

public class ThreadLocalDemo {


    public static void main(String[] args) {
        ThreadLocal<Integer> zhangsanThreadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue() {
                return 1;
            }
        };

        ThreadLocal<Integer> lisiThreadLocal = new ThreadLocal<Integer>() {
            @Override
            protected Integer initialValue() {
                return 1;
            }
        };

        class ThreadTest implements Runnable {

            String name;

            public ThreadTest(String name) {
                this.name = name;
            }

            @Override
            public void run() {

                System.out.println(name);
            }
        }

        for (int i = 0; i < 3; i++) {
            new ThreadTest(i + "");

        }

    }
}
