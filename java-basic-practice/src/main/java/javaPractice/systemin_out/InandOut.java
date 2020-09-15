package javaPractice.systemin_out;

import java.util.Scanner;

public class InandOut {
    public static void main(String[] args) {
        //从键盘输入
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();

    }
}
