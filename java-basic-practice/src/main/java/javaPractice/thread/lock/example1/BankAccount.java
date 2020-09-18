package javaPractice.thread.lock.example1;

public class BankAccount {

    private int balance = 40;//一开始金额是100元

    public void withDraw(String name,int amount){//扣减账户余额
       /* System.out.println("苏醒后扣款前的balance="+ balance+"   name="+ name);//读取一遍
        balance = balance - amount;//这里又重新读取了一遍balance！！！！！！！！！！！
        System.out.println("苏醒后扣款后的balance="+ balance+"   name="+ name);*/

        int i = balance;
        System.out.println("苏醒后扣款前的balance="+ i+"   name="+ name);//
        balance = i - amount;//这里和上行读取的是一样的数据
        System.out.println("苏醒后扣款后的balance="+ balance+"   name="+ name);

    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
