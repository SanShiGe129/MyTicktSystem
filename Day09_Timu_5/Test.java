package HomeWork.Day09_Timu_5;


import demo1.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{

        Test test = new Test();


        String s1 = "房间号(输入数字按回车键结束！):";
        String s2 = "请输入排号(输入数字按回车键结束！):";
        String s3 = "请输入座位号(输入数字按回车键结束！):";
        String s4 = "请输入价格(输入数字按回车键结束！):";
        String s5 = "请输入电影名:";

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎光临，磊磊版2代售票系统，增加显示票原价！^_^");
        System.out.println("请输入票类(有赠票，学生票，普通票):");
        String TypeTike = scanner.next();


        if(TypeTike.equals("普通票")){
            System.out.println(s1);
            int RoomId = scanner.nextInt();
            System.out.println(s2);
            int Pai = scanner.nextInt();
            System.out.println(s3);
            int ZuoWei = scanner.nextInt();
            System.out.println(s4);
            int price = scanner.nextInt();
            System.out.println(s5);
            String fileName = scanner.next();
            test.print(new NomalTic1("普通票",RoomId,Pai,ZuoWei,fileName,price));
        }
        else if(TypeTike.equals("学生票")){
            System.out.println(s1);
            int RoomId = scanner.nextInt();
            System.out.println(s2);
            int Pai = scanner.nextInt();
            System.out.println(s3);
            int ZuoWei = scanner.nextInt();
            System.out.println(s4);
            int price = scanner.nextInt();
            System.out.println(s5);
            String fileName = scanner.next();
            test.print(new StudentTick("学生票",RoomId,Pai,ZuoWei,fileName,price));

        }else if(TypeTike.equals("赠票")){
            System.out.println(s1);
            int RoomId = scanner.nextInt();
            System.out.println(s2);
            int Pai = scanner.nextInt();
            System.out.println(s3);
            int ZuoWei = scanner.nextInt();
            System.out.println(s5);
            String fileName = scanner.next();
            test.print(new FreeTick("赠票",RoomId,Pai,ZuoWei,fileName));
        }else{
            System.out.println("你输入的参数不合法！退出程序！");
            System.exit(-1);
        }

        System.out.println("-------------------------------");
        System.out.println("您的票正在打印请稍后.....");
        //Thread.sleep(6000);
        System.out.println("打印成功,请收好您的票！");
    }

    public void print(Ticket ticket){
        ticket.printTicket();
    }
}
