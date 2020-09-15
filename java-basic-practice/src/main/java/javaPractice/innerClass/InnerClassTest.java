package javaPractice.innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

public class InnerClassTest {
    public static void main(String[] args) {

    }


    public class TalkingClock {
        private String interval;
        private boolean beep;

        public TalkingClock(String interval,boolean beep){
            this.interval = interval;
            this.beep = beep;
        }



        public void start(String interval,boolean beep){
            ActionListener listener = new TimerPrinter();

            Timer t = new Timer(interval);
            //t.start();


           //ActionListener timerPrinter1 = new TimerPrinter1();
            /**
             * 局部类：不能被private或者public修饰，对外部世界完全隐藏，出start里面的可以访问该类，其余都不能访问该类，包括TalkingClock
             */
            class TimerPrinter1 implements ActionListener {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("the time is" + new Date());
                    //内部类可以访问内部类本身的所有属性以及访问他的外围类的所有属性和方法（包括私有的！！！）
                    //因为编译器重新改写了内部类的构造函数，添加了一个外围类的引用（outer）在内部类的默认的构造函数中
                    //if(beep){//实则：类似于 outer.beep
                        Toolkit.getDefaultToolkit().beep();
                   // }
                }
            }

            ActionListener listener1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            };



        }

        /**
         * 内部类
         * 类：只有内部类可以被private修饰，常规类不能被private修饰：定义为私有的是只有他的外部类能够引用他
         */
        private class TimerPrinter implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("the time is" + new Date());
                //内部类可以访问内部类本身的所有属性以及访问他的外围类的所有属性和方法（包括私有的！！！）
                //因为编译器重新改写了内部类的构造函数，添加了一个外围类的引用（outer）在内部类的默认的构造函数中
                if(beep){//实则：类似于 outer.beep
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }


    }


}
