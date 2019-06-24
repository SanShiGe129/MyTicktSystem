package HomeWork.Day09_Timu_5;

import java.math.BigDecimal;

public class StudentTick extends Ticket {
    private double zekou = 0.98;

    public StudentTick() {
    }

    public StudentTick(String type, int roomId, int pai, int zuoWei, String name) {
        super(type, roomId, pai, zuoWei, name);
    }

    @Override
    public void printTicket() {
        super.selectMoviePrice(super.getName());  //通过电影名字输入价格
        super.setZekou(zekou*10.0);
        this.calTick();
        super.printTicket();
    }

    @Override
    public double calTick() {
        return super.getPrice()*(zekou);
    }
}