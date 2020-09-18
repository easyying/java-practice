package javaPractice.thread.lock.example1;

public class BankAccount {

    private int balance = 40;//一开始金额是100元

    public void withDraw(String name,int amount){//扣减账户余额
        System.out.println("苏醒后扣款前的balance="+ balance+"   name="+ name);
        balance = balance - amount;
        System.out.println("苏醒后扣款后的balance="+ balance+"   name="+ name);
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
