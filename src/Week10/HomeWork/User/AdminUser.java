package Week10.HomeWork.User;

/**
 * Author:AixCert
 * Date:2023/5/11 13:29
 */
public class AdminUser extends User {
    // 构造方法
    public AdminUser() {
        super("Admin", "管理员");
    }

    // 验证管理员身份的方法
    public boolean verifyIdentity(String Password) {
        return "123456".equals(Password);
    }

}
