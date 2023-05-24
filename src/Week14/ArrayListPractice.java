package Week14;

import java.util.ArrayList;
import java.util.Random;

/**
 * Function:随机生成16个范围在【1-49】可重复的彩票数据
 * Author:AixCert
 * Date:2023/5/23 19:18
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        //随机生成16个范围在【1-49】可重复的彩票数据
        ArrayList<Integer> list = new ArrayList<>();//定义一个ArrayList集合
        Random random = new Random();

        for (int i = 0; i < 16; i++) {
            int num = random.nextInt(49) + 1;//生成一个随机数
            list.add(num);
        }
        //遍历集合
        System.out.println("彩票号码为:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
