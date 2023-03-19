package FourthWork;


import java.util.Random;

/**
 * Author:AixCert
 * Date:2023/3/15 22:59
 */
public class DouDiZhu {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("******欢迎斗地主******");
        System.out.println("********************");
        
        String []huase = {"黑桃","方块","红桃","梅花"};     //生成花色
        String []pai = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};  //生成点数

        String card[] = new String[54]; //定义一个数组，用来存放52张牌
        int index = 0;

        //实现生成52张牌
        for (int i = 0; i < huase.length; i++) {
            for (int j = 0; j < pai.length; j++) {
                card[index] = huase[i] + pai[j];
                index++;
            }
        }

        //添加大小王并输出
        card[52] = "小王";
        card[53] = "大王";

        //输出54张牌
        System.out.println("\n\n生成的牌：");
        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }

        //洗牌
        Random rand = new Random();
        for (int i = card.length - 1; i >= 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = card[i];
            card[i] = card[j];
            card[j] = temp; }

        //输出打乱后的牌
        System.out.println("\n\n洗牌后的牌：");
        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }

        //发牌
        int playNum = 3; //玩家数
        int dipai = 3;  //底牌数
        int num = (card.length - dipai) / playNum; //每个玩家应该分配的牌数
        int left = (card.length - dipai) % playNum; //剩余的牌数，应该分配给底牌

        String [][]player = new String[playNum][num]; //存放玩家的牌
        String []dipaiArr = new String[dipai]; //存放底牌的牌

        int count = 0; //记录当前已经分配了多少张牌
        for (int i = 0; i < playNum; i++) { //分配给每个玩家
            for (int j = 0; j < num; j++) {
                player[i][j] = card[count];
                count++;
            }
        }

        for (int i = 0; i < dipai; i++) { //分配给底牌
            dipaiArr[i] = card[count];
            count++;
        }

        //输出每个玩家的牌
        System.out.println("\n\n每个玩家的牌：");
        for (int i = 0; i < playNum; i++) {
            System.out.print("玩家" + (i+1) + "的牌：");
            for (int j = 0; j < num; j++) {
                System.out.print(player[i][j] + " ");
            }
            System.out.println();
        }

        //输出底牌
        System.out.print("\n底牌：");
        for (int i = 0; i < dipai; i++) {
            System.out.print(dipaiArr[i] + " ");
        }
    }
}
