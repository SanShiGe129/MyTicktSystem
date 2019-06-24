package HomeWork;
/*
1、定义一个矩形类Rectangle：
   1）定义三个方法：getArea()求面积、getPer()求周长、showAll()分别在控制台输出长、宽、面积、周长
   2）有2个属性：长length、宽width
   3）通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
   4）创建一个Rectangle对象，并输出相关信息；
 */
class Rectangle{

    int length;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        int area = length*width;
        return area;
    }

    public int getPer(){
        int per = (length+width)*2;
        return per;
    }

    public void showAll(){
        System.out.println("长:" + length + "宽:" + width + "面积" + getArea() + "周长" + getPer());
    }
}

public class timu_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1 ,2);
        rectangle.showAll();
    }
}
