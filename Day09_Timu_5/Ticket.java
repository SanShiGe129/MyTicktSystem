package HomeWork.Day09_Timu_5;

import java.math.BigDecimal;

/**
 *
 *1.0版
 * 实现了题目输出样例要求打印信息
 *
 * 2.0版
 * 1.添加了原价 折后价等信息
 * 2.子类重复输出信息,代码不够简洁！
 * 存在问题
 * 学生票,普通票每次输入票信息是都要输入钱数，增加了出错的几率！
 * 2019.6.21;
 *
 * 出现的问题1 变量没有考虑好导致重复修改
 *
 * */
public abstract class Ticket {
    private String type;
    private int roomId;
    private int pai;
    private int zuoWei;
    private String name;
    private double price;
    private double zekou;
    private String shijian;
    private double cal;



    public Ticket(String type, int roomId, int pai, int zuoWei, String name) {
        this.type = type;
        this.roomId = roomId;
        this.pai = pai;
        this.zuoWei = zuoWei;
        this.name = name;
    }



    public double getCal() {
        return cal;
    }

    public abstract double calTick();

    public void setCal(double cal) {
        this.cal = cal;
    }

    public void printTicket(){
        System.out.println("电影票类型:" + this.getType());
        System.out.println("房间号:" + this.getRoomId()+ "厅");
        System.out.println("排:" + this.getPai()+ "号");
        System.out.println("座位:" + this.getZuoWei() + "号");
        System.out.println("原价:" + this.getPrice() + "元");
        System.out.println("现价:"+this.calTick() + "元" );
        System.out.println("折扣:" + this.zekou + "折");
        System.out.println("电影名称:"+ this.getName());
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getZekou() {
        return zekou;
    }

    public void setZekou(double zekou) {
        this.zekou = zekou;
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPai() {
        return pai;
    }

    public void setPai(int pai) {
        this.pai = pai;
    }

    public int getZuoWei() {
        return zuoWei;
    }

    public void setZuoWei(int zuoWei) {
        this.zuoWei = zuoWei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
