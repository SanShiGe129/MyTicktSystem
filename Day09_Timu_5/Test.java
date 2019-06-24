package HomeWork.Day09_Timu_5;


import demo1.Student;

/**
 *
 *1.0版
 * 实现了题目输出样例要求打印信息
 *
 * 2.0版
 * 1.添加了原价 折后价等信息
 * 2.子类重复打印输出信息,代码不够简洁
 * 3.注意打折问题不存在精度损失！
 * 2019.6.21
 *
 * ++存在问题
 * 学生票,普通票每次输入票信息是都要输入钱数，增加了出错的几率，当电影名
 * 相同时，他们的价格相同,可以通过设置电影名和价格来规避这个问题！
 * 2019.6.21;
 *
 * 3.0版(本程序版本)
 * 1.实现2.0版问题里的功能
 *
 *   出现的坑 在判断有固定长度对象数组里，是否存在对象中的某一个元素！最后一个元素为空的问题
 *   发现问题子类用父类的方法实现直接修改父类而不用修改子类
 *   出现的问题 非静态数组不能数据共享 可以用静态解决这个问题！
 *   完成时间2019年6月24日00:53:43
 *
 *
 * 4.0版(下一版本)
 * 开发菜单功能可以返回上一个目录 可以进入下个目录可以退出！
 *
 *存在的问题1
 *  变量类型没有考虑好导致重复修改！
 *  注意数组的下标！
 *  无法有效的引用类型的数据中查找某个元素
 *  错误1直接赋值给flag = true;不能解决问题
 *
 *   发现问题子类用父类的方法实现直接修改父类而不用修改子类
 *
 * */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Test test = new Test();
        //Ticket ticket = new StudentTick();


        //测试添加删除查看电影方法  测试通过  OK
        Ticket ticket = new StudentTick();  //
        //测试强制添加数组ok;
        //ticket.setArray();
        ticket.addMovie();
        //ticket.showMovie();

        //单个方法测试通过  ok  测试输入元素是否在数组中
        //StudentTick studentTick = new StudentTick("学生票",3,2,23,"bbb");
        //studentTick.selectMoviePrice(studentTick.getName());
        //studentTick.printTicket();


        //组合测试  ok
        String s1 = "房间号(输入数字按回车键结束！):";
        String s2 = "请输入排号(输入数字按回车键结束！):";
        String s3 = "请输入座位号(输入数字按回车键结束！):";
        String s4 = "请输入价格(输入数字按回车键结束！):";
        String s5 = "请输入电影名:";

        Scanner scanner = new Scanner(System.in);
        System.out.println("****** 欢迎光临，磊磊版3代售票系统，增加显示票原价！增加键入票名称 *****^_^");

        System.out.println("请输入票类(有赠票，学生票，普通票):");
        String TypeTicket = scanner.next();

        if (TypeTicket.equals("普通票")) {
        } else if (TypeTicket.equals("学生票")) {
            ticket.setArray();
            ticket.showMovie();
            System.out.println("");
            System.out.println(s1);
            int RoomId = scanner.nextInt();
            System.out.println(s2);
            int Pai = scanner.nextInt();
            System.out.println(s3);
            int ZuoWei = scanner.nextInt();
            System.out.println(s5);
            String movieName = scanner.next();
            test.print(new StudentTick("学生票", RoomId, Pai, ZuoWei, movieName));

        } else if (TypeTicket.equals("赠票")) {
            ticket.setArray();
            ticket.showMovie();
            System.out.println(s1);
            int RoomId = scanner.nextInt();
            System.out.println(s2);
            int Pai = scanner.nextInt();
            System.out.println(s3);
            int ZuoWei = scanner.nextInt();
            System.out.println(s5);
            String movieName = scanner.next();
            test.print(new FreeTick("赠票", RoomId, Pai, ZuoWei, movieName));
        } else {
            System.out.println("你输入的参数不合法！退出程序！");
            System.exit(-1);
        }

        System.out.println("-------------------------------");
        System.out.println("您的票正在打印请稍后.....");
        //Thread.sleep(6000);
        System.out.println("打印成功,请收好您的票！");
    }

    public static void print(Ticket ticket) {
        ticket.selectMoviePrice(ticket.getName());
        ticket.printTicket();
    }
}


