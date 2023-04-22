package Week10.LianXi;

/**
 * Author:AixCert
 * Date:2023/4/22 23:21
 */

/**
 * super的3大用法
 * 1.在子类的方法中，访问父类的成员变量
 * 2.在子类的方法中，访问父类的成员方法
 * 3.在子类的构造方法中，访问父类的构造方法
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {//第三点
        super();
    }

    public void methodZi() {//第一点
        System.out.println(num);//这里输出为子类的num = 20
        System.out.println(super.num);//加个super关键字输出为父类(继承)的num = 10
    }

    public void method() {//第二点
        super.method();//打印输出父类方法
        System.out.println("子类方法");
    }


}
