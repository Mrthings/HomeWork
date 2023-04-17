package Week4;
import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/3/13 12:50
 */
public class CompareNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (;;){   //死循环条件
        System.out.println("请输入第一个数字：");
        int num1 = scan.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = scan.nextInt();

        System.out.println("请输入第三个数字：");
        int num3 = scan.nextInt();
        int max = 0;    //初始化最大值

            if (num1 > num2) {
                if (num1 > num3) {
                    max = num1;
                } else {
                    max = num3;
                }
            } else {
                if (num2 > num3) {
                    max = num2;
                } else {
                    max = num3;
                }
            }
            System.out.println("最大的值是：" + max);

            System.out.println("是否继续比较大小：Y(继续)/N(退出)");
            String isEnd = scan.next();

            if (isEnd.equals("N")) {
                System.out.println("程序已结束");
                break;
            }
        }
    }
}
