package Week10.HomeWork;

import Week10.HomeWork.User.AdminUser;
import Week10.HomeWork.User.GuestUser;
import Week10.HomeWork.User.RealNameUser;
import Week10.HomeWork.User.User;

/**
 * Author:AixCert
 * Date:2023/5/11 13:28
 */
public class GameSystem {
    private User[] users; // 保存所有用户的数组
    private int userCount; // 用户数量

    // 构造方法，初始化用户数组和用户数量
    public GameSystem() {
        users = new User[100];
        userCount = 0;
    }

    // 用户注册方法
    public void register(String username, String userType, String password, String realName, String phoneNumber, String idNumber, String gender) {
        if (userCount >= 100) {
            System.out.println("用户数量已达上限，无法注册新用户");
            return;
        }
        if ("实名用户".equals(userType)) {
            RealNameUser user = new RealNameUser(username, password, realName, phoneNumber, idNumber, gender);
            users[userCount++] = user;
        } else if ("游客".equals(userType)) {
            GuestUser user = new GuestUser(username);
            users[userCount++] = user;
        } else {
            System.out.println("无法识别用户类型");
        }
    }

    // 用户登录方法
    public void login(String username, String password) {
        boolean found = false;
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                if (users[i] instanceof AdminUser) {
                    // 如果是管理员用户，验证密码
                    if (((AdminUser) users[i]).verifyIdentity(password)) {
                        // 如果密码正确，打印所有用户信息
                        printAllUsers();
                        found = true;
                        break;
                    } else {
                        // 如果密码错误，打印登录失败信息
                        System.out.println("登录失败，用户名或密码错误！");
                        found = true;
                        break;
                    }
                } else if (users[i] instanceof RealNameUser && ((RealNameUser) users[i]).getPassword().equals(password)) {
                    // 如果是实名用户且密码正确，打印登录成功信息
                    System.out.println("登录成功，欢迎 " + username + "！");
                    found = true;
                    break;
                } else if (users[i] instanceof GuestUser) {
                    // 如果是游客用户，打印登录成功信息
                    System.out.println("登录成功，欢迎 " + username + "！");
                    found = true;
                    break;
                } else {
                    // 如果是其它用户类型，打印登录失败信息
                    System.out.println("登录失败，用户名或密码错误！");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("登录失败，用户名或密码错误！");
        }
    }

    // 打印所有用户信息
    private void printAllUsers() {
        System.out.println("序号\t用户名\t用户标签\t密码\t电话号码");
        for (int i = 0; i < userCount; i++) {
            User user = users[i];
            String username = user.getUsername();
            String userType = user.getUserType();
            String password = "";
            String phoneNumber = "";
            if (user instanceof RealNameUser) {
                password = ((RealNameUser) user).getPassword();
                phoneNumber = ((RealNameUser) user).getPhoneNumber();
            } else if (user instanceof AdminUser) {
                password = "******";
            }
            System.out.println(i + 1 + "\t" + username + "\t" + userType + "\t" + password + "\t" + phoneNumber);
        }
    }
}