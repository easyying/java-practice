package javaPractice.typeOFData;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dateya {

    /**
     * 日期格式
     */
    public static String FORMAT_SHORT = "yyyy-MM-dd";//英文简写（默认）如：2010-12-01

    public static String FORMAT_LONG = "yyyy-MM-dd HH:mm:ss";//英文全称  如：2010-12-01 23:15:06

    public static String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss.S";//精确到毫秒的完整时间    如：yyyy-MM-dd HH:mm:ss.S

    public static String FORMAT_SHORT_CN = "yyyy年MM月dd";//中文简写  如：2010年12月01日

    public static String FORMAT_LONG_CN = "yyyy年MM月dd日  HH时mm分ss秒";//中文全称  如：2010年12月01日  23时15分06秒

    public static String FORMAT_FULL_CN = "yyyy年MM月dd日  HH时mm分ss秒SSS毫秒";//精确到毫秒的完整中文时间



    /**
     * 获取时间戳
     */
    public static String getTimeString(){
        SimpleDateFormat sd = new SimpleDateFormat(FORMAT_FULL);
        Calendar ca = Calendar.getInstance();
        return  sd.format(ca.getTime());
    }







}
