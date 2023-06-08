package Week16.Week3;

import java.util.Date;

/**
 * Function:
 * Author:AixCert
 * Date:2023/6/8 22:43
 */
public class Student {
    private String name;
    private Date birthDate;
    private String gender;
    private Date enrollmentDate;

    public Student(String name, Date birthDate, String gender, Date enrollmentDate) {
        this.name = name;
        this.birthDate = birthDate;
        setGender(gender);
        this.enrollmentDate = enrollmentDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setGender(String gender) {
        if (gender.equals("男") || gender.equals("女")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("性别只能是男或女");
        }
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，出生日期：" + birthDate + "，性别：" + gender + "，入学注册时间：" + enrollmentDate;
    }

}
