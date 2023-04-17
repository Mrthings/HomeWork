package Week9;

/**
 * Author:AixCert
 * Date:2023/4/17 20:12
 */
public class Student {
    private String name;   // 姓名
    private int age;  // 年龄
    private String sex;   // 性别
    private int sno;      // 学号
    private int card;   // 身份证号码

    //设置年龄
    public void setAge(int age) {
        // 可以控制年龄的合法性
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误，请输入【0-150】之间的数据！");
        }
    }

    // 获取年龄
    public int getAge() {
        return this.age;
    }

    // 设置名字
    public void setName(String name) {
        this.name = name;
    }

    // 获取名字
    public String getName() {
        return this.name;
    }

    // 设置性别
    public void setSex(String sex) {
        this.sex = sex;
    }

    // 获取性别
    public String getSex() {
        return this.sex;
    }

    // 设置学号
    public void setSno(int sno) {
        this.sno = sno;
    }

    // 获取学号
    public int getSno() {
        return this.sno;
    }

    // 设置身份正号码
    public void setCard(int card) {
        this.card = card;
    }

    // 获取身份证号码
    public int getCard() {
        return this.card;
    }

}
