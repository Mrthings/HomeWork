package Week16.Work1;

import java.util.Date;

/**
 * Function:学生类
 * Author:AixCert
 * Date:2023/6/6 22:44
 */
public class Student {
    private String name;
    private Date birthDate;
    private Gender gender;
    private Date registrationDate;


    public enum Gender {
        男,
        女
    }

    public Student(String name, Date birthDate, Gender gender, Date registrationDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
