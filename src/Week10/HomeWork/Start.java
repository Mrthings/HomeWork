package Week10.HomeWork;

import java.util.Scanner;

/**
 * Author:AixCert
 * Date:2023/5/11 13:27
 */
public class Start {
    public static void main(String[] args) {
        GameSystem gameSystem = new GameSystem(); // 创建游戏系统对象
        Scanner scanner = new Scanner(System.in);

        // 循环读取用户输入的命令
        while (true) {
            System.out.println("请输入命令（'1'表示注册，'2'表示登录，'3'表示退出）：");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("请输入用户名：");
                    String username = scanner.nextLine();
                    System.out.println("请输入用户类型（'实名用户'或'游客'）：");
                    String userType = scanner.nextLine();
                    if ("实名用户".equals(userType)) {
                        System.out.println("请输入密码：");
                        String password = scanner.nextLine();
                        System.out.println("请输入真实姓名：");
                        String realName = scanner.nextLine();
                        System.out.println("请输入电话号码：");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("请输入身份证号码：");
                        String idNumber = scanner.nextLine();
                        System.out.println("请输入性别：");
                        String gender = scanner.nextLine();
                        gameSystem.register(username, userType, password, realName, phoneNumber, idNumber, gender);
                    } else if ("游客".equals(userType)) {
                        gameSystem.register(username, userType, null, null, null, null, null);
                    } else {
                        System.out.println("无法识别用户类型");
                    }
                    break;
                case "2":
                    System.out.println("请输入用户名：");
                    String username2 = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String password2 = scanner.nextLine();
                    gameSystem.login(username2, password2);
                    break;
                case "3":
                    System.out.println("退出程序");
                    System.exit(0);
                default:
                    System.out.println("无法识别的命令");
                    break;
            }
        }
    }
}
