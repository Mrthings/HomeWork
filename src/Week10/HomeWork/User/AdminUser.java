package Week10.HomeWork.User;

/**
 * Author:AixCert
 * Date:2023/4/26 22:24
 */
public class AdminUser extends User {
    private String password;

    public AdminUser(String username, String password) {
        super(username, "管理员");
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}