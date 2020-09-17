package javaPractice.thread.lock.example1;

public class BankAccount {

    private int balance = 120;//一开始金额是100元

    public void withDraw(int amount){//扣减账户余额
        balance = balance - amount;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
