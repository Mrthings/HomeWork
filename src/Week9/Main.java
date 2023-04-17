package Week9;

/**
 * Author:AixCert
 * Date:2023/4/17 20:12
 */
public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student();
        //设置方法
        stu1.setName("AixCery");
        stu1.setAge(19);
        stu1.setSex("男");

//      stu1.sno = 2023022;
//      stu1.card = 1234567888;

        //获取学号和身份证
        stu1.setSno(20230211);
        stu1.setCard(1234567888);

        //获取方法
        System.out.println("名字：" + stu1.getName());
        System.out.println("学号：" + stu1.getSno());
        System.out.println("身份证：" + stu1.getCard());

    }
}
