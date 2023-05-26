package ExtendProject;

/**
 * Function:比较两个数字的大小
 * Author:AixCert
 * Date:2023/5/26 17:36
 */
public class ThanSize {

    public void thanSize(int guessnum, int num) {
        if (guessnum == num) {
            System.out.println("猜中了！");
        } else if (guessnum > num) {
            System.out.println("猜大了！");
        } else {
            System.out.println("猜小了！");
        }
        System.out.println("对方的数字为：" + num);
    }
}
