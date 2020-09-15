package javaPractice.DatePractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 工行信用卡&浦发信用卡  1||2
 财务系统工行放款单中有首次还款日，首次还款日！！！+贷款时长
 ⎫	光大金租 3
 取值=光大金租放款订单查询中的最后一期还款日

 ⎫	自有资金： 4
 如果放款日期为每月1-27日，最后一次非展期账单还款日=放款日期+贷款时长+1天，
 如果放款日期的为每月28，29，30，31日，最后一次非展期账单还款日=放款日期+贷款时长后的次月1号，


 */
public class DateTest {
    public static  final  int dayDingQi = 27;

    public static void main(String[] args)  throws Exception{
        /**
         * 计算最后一次展期日
         */
        DateTest d = new DateTest();
        String s = "2018-09-30";
        Date issueDate = new SimpleDateFormat("yyyy-MM-dd").parse(s);
        //Date last = d.getLastRepayDate(issueDate,3,4);
        //System.out.println(last);

        /**
         * 练习日期
         */
        //定义初始化日期
        String str1 = "2018-09-30";
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(str1);
        System.out.println(date1);
        //获取年月日
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH)+1;
        int day = calendar1.get(Calendar.DAY_OF_MONTH);
        System.out.println("年："+year +"  月："+month + "  日："+ day);
        //计算年月日
        calendar1.set(Calendar.DAY_OF_MONTH,day+1);
        System.out.println("日期+1："+ calendar1.getTime());

        calendar1.set(Calendar.MONTH, month+2);
        System.out.println("月+2："+calendar1.getTime());



    }
    private Date getLastRepayDate(Date issueDate,Integer term,Integer fundsSource) throws Exception{

        Date LastRepayDate = null;
        if(fundsSource == 1 || fundsSource ==2){
            String S = "2018-03-08";
            Date firstRepayDate = new SimpleDateFormat("yyyy-MM-dd").parse(S);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(firstRepayDate);
            int month = calendar.get(Calendar.MONTH);
            calendar.set(Calendar.MONTH, month + term);
            LastRepayDate = calendar.getTime();

        }else if(fundsSource == 3){
            LastRepayDate = new Date("2018-06-09");
        }else {
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(issueDate);
            int day = calendar1.get(Calendar.DAY_OF_MONTH);
            int month1 = calendar1.get(Calendar.MONTH);
            /*if(day > 27){
                calendar1.set(Calendar.MONTH, month1+term+1);
                calendar1.set(Calendar.DAY_OF_MONTH,1);
                LastRepayDate = calendar1.getTime();

            }else {*/
                calendar1.set(Calendar.MONTH, month1 + term);
                calendar1.set(Calendar.DAY_OF_MONTH, day+2);
                LastRepayDate = calendar1.getTime();
            /*}*/
        }

        return LastRepayDate;


    }

}
