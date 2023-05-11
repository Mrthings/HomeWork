package Week10.HomeWork.User;

/**
 * 实名用户类
 * Author:AixCert
 * Date:2023/4/26 22:25
 */
public class RealNameUser extends User {
    private String password; // 密码
    private String realName; // 真实姓名
    private String phoneNumber; // 电话号码
    private String idNumber; // 身份证号码
    private String gender; // 性别

    // 构造方法
    public RealNameUser(String username, String password, String realName, String phoneNumber, String idNumber, String gender) {
        super(username, "普通用户");
        this.password = password;
        this.realName = realName;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.gender = gender;
    }

    // 获取密码
    public String getPassword() {
        return password;
    }

    // 获取真实姓名
    public String getRealName() {
        return realName;
    }

    // 获取电话号码
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // 获取身份证号码
    public String getIdNumber() {
        return idNumber;
    }

    // 获取性别
    public String getGender() {
        return gender;
    }
}
