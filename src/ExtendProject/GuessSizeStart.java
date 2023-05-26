package ExtendProject;

import ExtendProject.Exception.GuessException;
import ExtendProject.Exception.NumberCheck;

import java.util.Random;
import java.util.Scanner;

/**
 * Function:猜数字游戏
 * Author:AixCert
 * Date:2023/5/25 15:15
 */
public class GuessSizeStart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int guessnum = 0;
            int num = random.nextInt(20) + 1;//生成一个随机数
            System.out.print("请输入你猜的数字(0-20)：");
            //检测输入数字是否处于合法区间
            try {
                guessnum = scan.nextInt();
                NumberCheck.check(guessnum);
            } catch (GuessException e) {
                System.out.println(e.getMessage());
                System.exit(1);//退出程序
            }

            //比大小
            ThanSize thanSize = new ThanSize();
            thanSize.thanSize(guessnum, num);

            //是否继续游戏
            System.out.print("是否继续游戏？(y/n)：");
            String answer = scan.next();
            System.out.println();
            if (answer.equals("n")) {
                System.out.println("游戏结束！");
                break;//退出循环
            }

        }
    }
}
