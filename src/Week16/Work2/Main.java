package Week16.Work2;

import java.util.Scanner;

/**
 * Function:String类的使用
 * Author:AixCert
 * Date:2023/6/8 16:36
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //提示信息
        System.out.println("请输入一个字符串：");
        String str = scan.nextLine();
        System.out.println("请输入你需要查找的字符：");
        String ch = scan.nextLine();

        //调用方法并遍历字符
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //判断字符是否相等
            if (ch.equals(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }
        System.out.println("字符 " + ch + " 在字符串 \"" + str + "\" 中出现了 " + count + " 次。");


    }
}
