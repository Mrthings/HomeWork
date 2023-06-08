package Week16.Week3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Function:
 * Author:AixCert
 * Date:2023/6/8 22:43
 */
public class Start {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Student s1 = new Student("张三", dateFormat.parse("1995-06-12"), "男", dateFormat.parse("2020-09-01"));
        Student s2 = new Student("李四", dateFormat.parse("1998-01-23"), "女", dateFormat.parse("2019-09-01"));
        Student s3 = new Student("王五", dateFormat.parse("2000-12-01"), "男", dateFormat.parse("2021-09-01"));
        Student s4 = new Student("赵六", dateFormat.parse("1999-03-18"), "女", dateFormat.parse("2018-09-01"));
        Student s5 = new Student("钱七", dateFormat.parse("2001-09-05"), "男", dateFormat.parse("2022-09-01"));
        Student s6 = new Student("谢桂荣", dateFormat.parse("1999-11-11"), "女", dateFormat.parse("2020-08-30"));

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        System.out.println("年龄大于20岁的学生信息：");
        for (Student student : students) {
            Date now = new Date();
            int age = (int) ((now.getTime() - student.getBirthDate().getTime()) / (1000L * 60 * 60 * 24 * 365));
            if (age > 20) {
                System.out.println(student);
            }
        }
    }
}
