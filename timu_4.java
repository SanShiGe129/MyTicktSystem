package HomeWork;

class Vehicle{
    String brand = "QQ飞车";
     String color = "蓝色";
     double speed = 0;

    public Vehicle(String brand,String color,double speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public Vehicle(String brand,String color){
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("我在奔跑啊啊啊啊！");
    }

}


class VehicleTest{

    public void test(){

    }

}
public class timu_4 {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("benz","black");
        System.out.println(vehicle.speed);
        System.out.println(vehicle.brand);
    }
}
