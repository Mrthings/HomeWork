package ExtendProject.Exception;

/**
 * Author:AixCert
 * Date:2023/5/25 15:39
 */
public class NumberCheck {
    public static void check(int num) throws GuessException {
        if (num < 0 || num > 20) {
            throw new GuessException("输入的数字不在0-20之间！请重新开始游戏！");
        }
    }
}
