package Week10.HomeWork;

import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/4/26 22:40
 */
public class Strat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //创建一个静态数组用来存放100个用户信息
        int UserArray[] = new int[100];

        while (true) {
            System.out.println("欢迎来到用户系统：");
            System.out.println("1.游客用户");
            System.out.println("2.实名用户");
            System.out.println("3.超级用户");
            System.out.println("0.退出");
            System.out.print("请选择用户类型(输入数字):");
            int choice = scan.nextInt();
            if (choice == 0) {
                System.out.println("退出成功");
                //如果选择为0，则退出
                return;
            } else if (choice == 1) {
                //输入游客时执行的代码
            } else if (choice == 2) {
                //输入实名用户时执行的代码
            } else if (choice == 3) {
                //输入超级管理员时执行的代码
            } else {
                //输入别的数字时执行的代码
                System.out.println("数字输入错误，以退出");
                return;
            }
        }
    }
}
