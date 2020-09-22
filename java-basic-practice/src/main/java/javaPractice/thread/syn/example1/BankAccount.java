package javaPractice.thread.syn.example1;

public class BankAccount {

    private int balance = 40;//一开始金额是100元

    public void withDraw(String name,int amount){//扣减账户余额
        //数据的修改  【读一遍，判断完再读一遍就会出现负数】
       /* System.out.println("苏醒后扣款前的balance="+ balance+"   name="+ name);//读取一遍
        balance = balance - amount;//这里又重新读取了一遍balance！！！！！！！！！！！
        System.out.println("苏醒后扣款后的balance="+ balance+"   name="+ name);*/

        //丢失更新 读一遍保存后，通过保存数据再复制，会出现覆盖现象
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
