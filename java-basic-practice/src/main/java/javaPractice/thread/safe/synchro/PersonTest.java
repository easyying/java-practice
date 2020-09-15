package javaPractice.thread.safe.synchro;

public class PersonTest {


    public static void main(String[] args) {
        ThreadTask.Count count = new  ThreadTask.Count();//公共的活儿
        for(int i = 1 ; i <= 5 ;i++){//5个人干活
            ThreadTask threadTask = new ThreadTask(count);//每一个任务进来都是同样的活
            threadTask.start();
        }

        try{
            Thread.sleep(5000);//等所有人都干完活儿的时候
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //System.out.println("5个人干完活最后的a最终总值："+ count.a );
        System.out.println("5个人干完活最后的num最终总值："+ count.num );
        //System.out.println("5个人干完活最后的c最终总值："+ count.c );

    }

}
