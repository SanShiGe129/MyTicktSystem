package HomeWork.Day09_Timu_5;

import java.math.BigDecimal;

public class StudentTick extends Ticket {
    private double price;
    private double zekou = 0.98;


    public StudentTick(String type, int roomId, int pai, int zuoWei, String name, double price) {
        super(type, roomId, pai, zuoWei, name);
        this.price = price;
    }



    @Override
    public void printTicket() {
        super.setZekou(zekou*10.0);
        this.calTick();
        super.setPrice(price);
        super.printTicket();
    }

    @Override
    public double calTick() {
        return this.price*(zekou);
    }
}