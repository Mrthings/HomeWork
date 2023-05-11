package Week10.HomeWork.User;

/**
 * 游客类
 * Author:AixCert
 * Date:2023/4/26 22:25
 */
public class GuestUser extends User {
    // 构造方法
    public GuestUser(String username) {
        super(username, "游客");
    }
}