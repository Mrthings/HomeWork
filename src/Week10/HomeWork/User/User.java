package Week10.HomeWork.User;

/**
 * Author:AixCert
 * Date:2023/4/26 22:26
 */
public class User {
    private String username;
    private String userType;

    public User(String username, String userType) {
        this.username = username;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}