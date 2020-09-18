package javaPractice.thread.lock.example1;

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();//只有一个共享的账户

    @Override
    public void run() {
        for(int x = 0 ; x < 2 ;x++){
            makeWithDrawal(40);
            if(account.getBalance() < 0){
                System.out.println("overdrawan");
            }
        }
    }
    //加上synchronized：保证同一时间只能有一个线程执行这个方法
    private void makeWithDrawal(int amount){//amount 要提款的余额
        System.out.println("取款判断account.getBalance："+ account.getBalance());
        if(account.getBalance() >= amount){//检查账户，如果透支就列出信息；否则就去睡一会 睡完了再去完成提款操作
            System.out.println(Thread.currentThread().getName() + ": is about to WithDrawal");
            try {
                System.out.println(Thread.currentThread().getName() + ":is to sleep");
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":is to wakeup");
            account.withDraw(Thread.currentThread().getName(),amount);//提款
            System.out.println(Thread.currentThread().getName() + ": complete withDraw1");
            System.out.println("account剩余："+ account.getBalance());
        }else {
            System.out.println("sorry not enough for "+ Thread.currentThread().getName());
        }
    }

}
