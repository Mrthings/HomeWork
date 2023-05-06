package Week3;

import java.util.Random;

/**
 * Author:AixCert
 * Date:2023/3/21 12:21
 */
public class DouDiZhu {
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("*********欢迎来斗地主********");
        System.out.println("***************************");

        String[] huaSe = {"♠", "♦", "♥", "♣"};     //生成花色
        String[] dianShu = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};  //生成点数

        String card[] = new String[54]; //定义一个数组，用来存放54张牌

        card[0] = "小王";
        card[1] = "大王";


        //生成54张牌
        int index = 2;
        for (int i = 0; i < huaSe.length; i++) {
            for (int j = 0; j < dianShu.length; j++) {
                String yiZhangPai = huaSe[i] + dianShu[j];
                card[index] = yiZhangPai;
                index++;
            }
        }
        //输出打印54张牌
        System.out.println("生成的54张牌：");
        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }
        System.out.println();   //换行

        //洗牌
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int cardIndex = rand.nextInt(54);
            int card2Index = rand.nextInt(54);
            //洗牌逻辑
            String temp;
            temp = card[cardIndex];
            card[cardIndex] = card[card2Index];
            card[card2Index] = temp;
        }

        System.out.println();//换行
        System.out.println("洗牌之后的54张牌：");
        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }
        System.out.println();   //换行


        //发牌
        //分配第一位玩家
        String[] player1 = new String[20];
        for (int i = 0; i < 17; i++) {
            player1[i] = card[i];
        }
        System.out.println();    //换行;
        System.out.print("第一位玩家的牌：");
        for (int i = 0; i < player1.length; i++) {
            System.out.print(player1[i] + " ");
        }

        //第二位玩家
        System.out.println();
        String[] player2 = new String[20];
        int a = 0;
        for (int i = 17; i < 34; i++) {
            player2[a] = card[i];
            a++;
        }

        System.out.print("第二位玩家的牌：");
        for (int i = 0; i < player2.length; i++) {
            System.out.print(player2[i] + " ");
        }

        //第三位玩家
        int b = 0;
        String[] player3 = new String[20];
        for (int i = 34; i < 51; i++) {
            player3[b] = card[i];
            b++;
        }
        System.out.println();
        System.out.print("第三位玩家的牌：");
        for (int i = 0; i < player3.length; i++) {
            System.out.print(player3[i] + " ");
        }


        //确定地主:用随机数的方式
        /*
        随机数 == 0；第一位玩家是地主
        随机数 == 1；第二位玩家是地主
        随机数 == 2；第三位玩家是地主
         */
        Random rand2 = new Random();
        int num = rand2.nextInt(3); //生成一个0-3的随机数

        switch (num) {
            case 0:
                //第一位玩家是地主
                player1[17] = card[53];
                player1[18] = card[52];
                player1[19] = card[51];
                break;
            case 1:
                //第二位玩家是地主
                player2[17] = card[53];
                player2[18] = card[52];
                player2[19] = card[51];
                break;
            case 2:
                //第三位玩家是地主
                player3[17] = card[53];
                player3[18] = card[52];
                player3[19] = card[51];
                break;
        }
//        if (num == 0) {
//            //第一位玩家是地主
//            player1[17] = card[53];
//            player1[18] = card[52];
//            player1[19] = card[51];
//        } else if (num == 1) {
//            //第二位玩家是地主
//            player2[17] = card[53];
//            player2[18] = card[52];
//            player2[19] = card[51];
//        } else {
//            //第二位玩家是地主
//            player3[17] = card[53];
//            player3[18] = card[52];
//            player3[19] = card[51];
//        }

        System.out.println();
        //打印最后的结果
        System.out.println("地主确认之后,玩家的牌：");
        //第一位玩家
        System.out.println();
        System.out.println("第一位玩家的牌-----------------------------------");
        for (int i = 0; i < player1.length; i++) {
            System.out.print(player1[i] + " ");
        }
        //第二位玩家
        System.out.println();
        System.out.println("第二位玩家的牌-----------------------------------");
        for (int i = 0; i < player2.length; i++) {
            System.out.print(player2[i] + " ");
        }
        //第三位玩家
        System.out.println();
        System.out.println("第三位玩家的牌-----------------------------------");
        for (int i = 0; i < player3.length; i++) {
            System.out.print(player3[i] + " ");
        }
    }

}
