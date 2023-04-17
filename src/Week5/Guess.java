package Week5;

import java.util.Random;
import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/3/21 22:17
 */
public class Guess {
    public static void main(String[] args) {
        //提示语
        System.out.println("************************");
        System.out.println("**********猜大小*********");
        System.out.println("************************");

        Random rand = new Random(); //初始化rand对象

        while (true) {   //循环
            int num = rand.nextInt(20) + 1; //让最小值为1

            System.out.println();
            System.out.println("请输入数字(1-20): ");

            Scanner scan = new Scanner(System.in);
            int guessNum = scan.nextInt();

            //游戏主逻辑
            if (num == guessNum) {
                System.out.println("猜对了");
            } else if (num < guessNum) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }

            //是否退出逻辑
            System.out.println("本轮结束，是否继续：Y(继续)/N(退出)");
            Scanner gameOver = new Scanner(System.in);

            String isEnd = gameOver.next();
            if (isEnd.equals("N")) {
                System.out.println("------游戏结束------");
                break;
            } else if (isEnd.equals("Y")) {
                System.out.println("------游戏继续------");
            } else {
                System.out.println("输入错误，默认继续！");
                System.out.println("------游戏继续------");
            }
        }
    }
}
