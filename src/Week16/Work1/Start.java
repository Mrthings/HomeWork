package Week16.Work1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Function:定义一个学生类，有属性：  姓名、出生年月、性别、入学注册时间。
 * 一、要求：1、性别只能是男和女
 * <p>
 * 2、注册时间是一个日期类型
 * <p>
 * 二、编写测试类，实例化你班上的5个学生对象和谢桂荣【谢桂荣，1999-11-11，女，2020年8月30】测试对象。将这6个对象装入集合中。
 * <p>
 * 三、判断年龄大于20岁的学生，将大于20岁的学生信息打印出来
 * Author:AixCert
 * Date:2023/6/6 22:57
 */
public class Start {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            //第一个学生
            Date birthDate1 = dateFormat.parse("2009/08/11");//出生日期
            Date registrationDate1 = dateFormat.parse("2021/03/03");//注册日期
            Student student1 = new Student("张三", birthDate1, Student.Gender.男, registrationDate1);
            students.add(student1);

            //第二个学生
            Date birthDate2 = dateFormat.parse("2002/03/12");//出生日期
            Date registrationDate2 = dateFormat.parse("2022/09/03");//注册日期
            Student student2 = new Student("李四", birthDate2, Student.Gender.男, registrationDate2);
            students.add(student2);

            //第三个学生
            Date birthDate3 = dateFormat.parse("2011/05/13");//出生日期
            Date registrationDate3 = dateFormat.parse("2021/06/17");//注册日期
            Student studnet3 = new Student("小红", birthDate3, Student.Gender.女, registrationDate3);
            students.add(studnet3);

            //第四个学生
            Date birthDate4 = dateFormat.parse("2003/07/14");//出生日期
            Date registrationDate4 = dateFormat.parse("2021/05/01");//注册日期
            Student student4 = new Student("小米", birthDate4, Student.Gender.男, registrationDate4);
            students.add(student4);

            //第五个学生
            Date birthDate5 = dateFormat.parse("2011/02/14");//出生日期
            Date registrationDate5 = dateFormat.parse("2022/05/37");//注册日期
            Student student5 = new Student("小佳", birthDate5, Student.Gender.女, registrationDate5);
            students.add(student4);

            Date birthDate6 = dateFormat.parse("1999/11/11");//出生日期
            Date registrationDate6 = dateFormat.parse("2020/08/30");//注册日期
            Student student6 = new Student("谢桂荣", birthDate6, Student.Gender.女, registrationDate6);
            students.add(student6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 获取当前年份
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);

        //遍历学生集合
        for (Student student : students) {
            // 计算学生的年龄
            Calendar birthdate = Calendar.getInstance();
            birthdate.setTime(student.getBirthDate());
            // 获取学生的年龄
            int age = currentYear - birthdate.get(Calendar.YEAR);

            if (age > 20) {
                System.out.println("姓名：" + student.getName() +
                        "\t年龄：" + age +
                        "\t性别：" + student.getGender() +
                        "\t注册日期：" + dateFormat.format(student.getRegistrationDate()));
            }
        }


    }
}
