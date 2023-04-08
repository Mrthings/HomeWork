package SeventhWork;

/**
 * Author:AixCert
 * Date:2023/4/5 22:45
 */
public class Calculator {
    String xingZhang;
    String owner;

    //加法
    int jiaFa(int num1, int num2) {
        int resultAdd = num1 + num2;
        System.out.println("和等于" + resultAdd);
        return resultAdd;
    }

    //减法
    int jianFa(int num1, int num2) {
        int resultSub = num1 - num2;
        System.out.println("差等于" + resultSub);
        return resultSub;
    }

    //乘法
    int chengFa(int num1, int num2) {
        int resultMul = num1 * num2;
        System.out.println("积等于" + resultMul);
        return resultMul;
    }

    //除法
    int chuFa(int num1, int num2) {
        int resultDiv = num1 / num2;
        System.out.println("商等于" + resultDiv);
        return resultDiv;
    }

    //取余
    int quYu(int num1, int num2) {
        int resulitRed = num1 % num2;
        System.out.println("取余为" + resulitRed);
        return resulitRed;
    }
}
