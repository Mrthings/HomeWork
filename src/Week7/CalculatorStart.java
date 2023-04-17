package Week7;

import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/4/6 18:17
 */
public class CalculatorStart {
    //属性
    public static void main(String[] args) {

        Calculator cul = new Calculator();
        cul.xingZhang = "长方形";
        cul.owner = "计算器";

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int num1 = scan.nextInt();
        System.out.print("请输入第二个数：");
        int num2 = scan.nextInt();
        //加法
        int resultAdd = cul.jiaFa(num1, num2);
        System.out.println(num1 + "+" + num2 + "和等于" + resultAdd);
        //减法
        int resultSub = cul.jianFa(num1, num2);
        System.out.println(num1 + "-" + num2 + "差等于" + resultSub);
        //乘法
        int resultMul = cul.chengFa(num1, num2);
        System.out.println(num1 + "*" + num2 + "积等于" + resultMul);
        //除法
        int resultDiv = cul.chuFa(num1, num2);
        System.out.println(num1 + "/" + num2 + "商等于" + resultDiv);
        //取余
        int resultRed = cul.quYu(num1, num2);
        System.out.println(num1 + "%" + num2 + "余等于" + resultRed);
    }
}
