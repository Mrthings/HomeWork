package ExtendProject;

/**
 * Function:比大小逻辑
 * Author:AixCert
 * Date:2023/5/26 16:26
 */
public class ThanSize {

    public int thanSize(int guessnum, int num) {
        //比大小
        if (guessnum == num) {
            System.out.println("猜中了！");
        } else if (guessnum > num) {
            System.out.println("猜大了！");
        } else {
            System.out.println("猜小了！");
        }
        System.out.println("对方的数字为：" + num);
        return guessnum;
    }
}
