package HomeWork.Day09_Timu_5;

public class TypeMovies {
    private String name  = null;
    private double price = 0;


    public TypeMovies(String name,double price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "仓库的电影有:" +
                "电影名:" + name + '\'' +
                "  价格:" + price +
                '}';
    }
}
