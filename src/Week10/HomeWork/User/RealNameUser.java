package Week10.HomeWork.User;

/**
 * Author:AixCert
 * Date:2023/4/26 22:25
 */
public class RealNameUser extends User {
    private String password;
    private String realName;
    private String phoneNum;
    private String idCard;
    private String gender;

    public RealNameUser(String username, String password, String realName, String phoneNum, String idCard, String gender) {
        super(username, "普通用户");
        this.password = password;
        this.realName = realName;
        this.phoneNum = phoneNum;
        this.idCard = idCard;
        this.gender = gender;
    }
}