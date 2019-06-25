package HomeWork.Day09_Timu_5;

import java.util.Scanner;

public class TypeMovies {
    private String name  = null;
    private double price = 0;
    public static TypeMovies []typeMovies = new TypeMovies[10];  //设置静态 保证所有对象访问同一个对象数组


    public TypeMovies(String name,double price){
        this.name = name;
        this.price = price;

    }

    public static void addMovie() {  //实现增加票的功能,用静态方法保证添加同一个数组
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<=10;i++) {  //
            System.out.println("请输入输入添加的电影名:");
            String setName = sc.next();
            System.out.println("请输入电影的金额:");
            double setPrice = sc.nextInt();


            System.out.println("确定添加吗？确定输入'YES',否则输入其他字符回车放弃添加！");
            String sure = sc.next();
            if (sure.equalsIgnoreCase("YES")) {
                typeMovies[i] = new TypeMovies(setName, setPrice);
            } else {
                System.out.println("你已放弃添加！");
                i--;
            }
            System.out.println("继续添加吗！如果继续输入任意字符回车！否则输入exit退出系统!");
            String isExit = sc.next();
            if (isExit.equalsIgnoreCase("exit")){
                break;
            }
        }
    }

    public static void setArray(){   //判断是否为空

        if(typeMovies[0] == null){
            System.out.println("你还未成功添加任何电影请添加！");
            addMovie();
            setArray();
        }

        return;
    }


    public static void showMovie() {    //实现展示查看电影类型和价格的功能！
        System.out.println("");
        for(int i=0;i<typeMovies.length;i++){
            if(typeMovies[i] == null){
                System.out.println("共"+ i +"个电影！");
                break;
            }else{
                System.out.println(typeMovies[i]);
            }
        }
        System.out.println("");

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
