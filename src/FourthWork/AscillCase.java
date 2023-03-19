package FourthWork;

import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/3/16 22:56
 */
public class AscillCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("请输入你想转换的字母：");
            char ch = scan.next().charAt(0);

            if (ch >= 65 && ch <= 90) {
                //大写字母转换小写
                System.out.println("你输入的是大写字母：" + ch);
                char ch2 = (char) (ch + 32);    //强制转换
                System.out.println("转成小写字母：" + ch2);

            } else if (ch >= 97 && ch <= 122) {
                //小写字母转换大写
                System.out.println("你输入的小写字母：" + ch);
                char ch2 = (char) (ch - 32);
                System.out.println("转成大写字母：" + ch2);
                
            } else {
                //输入其他字符
                System.out.println("输入错误");
            }

            //循环
            System.out.println("是否继续：1(继续)/2(退出)");
            String isEnd = scan.next();

            System.out.println("----------------------");//分隔符

            if (isEnd.equals("2")) {
                System.out.println("程序已结束");
                break;
            }
        }
    }
}
