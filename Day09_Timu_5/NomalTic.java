package HomeWork.Day09_Timu_5;

import java.math.BigDecimal;

class NomalTic1 extends Ticket{

    private double price;
    private double zekou = 0;

    public NomalTic1(String type, int roomId, int pai, int zuoWei, String name, double price) {
        super(type, roomId, pai, zuoWei, name);
        this.price = price;
    }

    @Override
    public double calTick() {
        return 0;
    }

    @Override
    public void printTicket() {
        setPrice(price);
        super.setZekou(zekou);
        super.printTicket();
    }

}










