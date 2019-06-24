package HomeWork.Day09_Timu_5;

public class FreeTick extends Ticket{

    public FreeTick(String type, int roomId, int pai, int zuoWei, String name) {
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
        this.calTick();
        super.printTicket();
    }
}
