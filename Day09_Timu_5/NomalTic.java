package HomeWork.Day09_Timu_5;

import java.math.BigDecimal;

class NomalTic1 extends Ticket{

    private double price;
    private double zekou = 0;

    public NomalTic1(String type, int roomId, int pai, int zuoWei, String name) {
        super(type, roomId, pai, zuoWei, name);
    }

    @Override
    public double calTick() {
        return 0;
    }


    @Override
    public void selectMoviePrice(String setName) {

    }

    @Override
    public void printTicket() {
        super.selectMoviePrice(super.getName());
        super.setZekou(zekou);
        super.printTicket();
    }

}










