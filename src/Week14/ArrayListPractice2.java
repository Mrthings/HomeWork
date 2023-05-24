package Week14;

import java.util.HashSet;
import java.util.Random;

/**
 * Function:随机生成16个范围在【1-49】不重复的彩票数据
 * Author:AixCert
 * Date:2023/5/23 21:59
 */
public class ArrayListPractice2 {
    public static void main(String[] args) {
        //用集合随机生成16个范围在【1-49】不重复的彩票数据
        HashSet<Integer> list = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int num = random.nextInt(49) + 1;
            list.add(num);
        }
        //遍历集合
        System.out.println("彩票号码为:");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
