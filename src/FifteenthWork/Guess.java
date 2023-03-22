package FifteenthWork;

import java.util.Random;
import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/3/21 22:17
 */
public class Guess {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("**********猜大小*********");
        System.out.println("************************");

        Random rand = new Random();
        int num = rand.nextInt(20) + 1;

        System.out.println();
        System.out.println("请输入数字(1-20): ");

        Scanner scan = new Scanner(System.in);
        int guessNum = scan.nextInt();

        if (num == guessNum) {
            System.out.println("猜对了");
        } else if (num < guessNum) {
            System.out.println("猜大了");
        } else {
            System.out.println("猜小了");
        }
    }
}
