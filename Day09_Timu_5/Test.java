package HomeWork.Day09_Timu_5;

import java.util.Scanner;

public class Test {
    private static Scanner input  = new Scanner(System.in);

    public static void main(String[] args) {

        zhuCaiDan();


    }

    public static void zhuCaiDan(){
        System.out.println("1 系统设置");
        System.out.println("2 买票");
        System.out.println("3 菜单测试2");
        System.out.println("0 退出系统");
        int num = input.nextInt();

        if(num == 0){
            System.exit(-1);
        }else if(num == 1){
            ziCaiDan1();

        } else if (num == 2){
            sellTicket();
            zhuCaiDan();
        }
        else{
            System.out.println("你输入序号错误!,或功能未开发！");
        }

    }

    public static void ziCaiDan1(){
        System.out.println("1 添加票");
        System.out.println("2 查看票");
        System.out.println("3 修改票");
        System.out.println("4 删除票");
        System.out.println("0 返回上一级");
        int num = input.nextInt();
        if(num == 0){
            zhuCaiDan();
        }else if(num == 1){
            TypeMovies.addMovie();
            ziCaiDan1();
        }else if(num == 2){
            TypeMovies.showMovie();
            ziCaiDan1();
        }else{
            System.out.println("你输入序号错误,或功能未开发！!");
        }
    }

    public static void sellTicket(){
        showOrSet();
        System.out.println("请输入票类(有赠票，学生票，普通票):");
        String typeTicket = input.next();

        String s1 = "房间号(输入数字按回车键结束！):";
        String s2 = "请输入排号(输入数字按回车键结束！):";
        String s3 = "请输入座位号(输入数字按回车键结束！):";
        String s5 = "请输入电影名:";

        System.out.println(s1);
        int RoomId = input.nextInt();
        System.out.println(s2);
        int Pai = input.nextInt();
        System.out.println(s3);
        int ZuoWei = input.nextInt();
        System.out.println(s5);
        String movieName = input.next();
        if(typeTicket.equals("赠票")){
            gongNeng(new FreeTick(typeTicket, RoomId, Pai, ZuoWei, movieName));
        } else if (typeTicket.equals("普通票")) {
            gongNeng(new NomalTic1(typeTicket, RoomId, Pai, ZuoWei, movieName));
        } else if (typeTicket.equals("学生票")) {
            showOrSet();
            gongNeng(new StudentTick(typeTicket, RoomId, Pai, ZuoWei, movieName));
        } else if (typeTicket.equals("赠票")) {
            gongNeng(new FreeTick(typeTicket, RoomId, Pai, ZuoWei, movieName));
        } else {
            System.out.println("你输入的参数不合法！退出程序！");
            System.exit(-1);
        }

        System.out.println("-------------------------------");
        System.out.println("您的票正在打印请稍后.....");
        //Thread.sleep(6000);
        System.out.println("打印成功,请收好您的票！");
        System.out.println("-------------------------------");
    }

    public static void gongNeng(Ticket ticket){
        ticket.selectMoviePrice(ticket.getName());
        ticket.printTicket();
    }

    public static void showOrSet(){
        TypeMovies.setArray();
        TypeMovies.showMovie();
    }
}
