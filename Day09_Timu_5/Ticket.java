package HomeWork.Day09_Timu_5;



import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;


public abstract class Ticket implements ModifyMovie{  //知识点:如果一个方法实现了一个接口的部分方法,
                                                      // 则该类必须为抽象方法
    private String type;
    private int roomId;
    private int pai;
    private int zuoWei;
    private String name;
    private double price;
    private double zekou;
    private String shijian;
    private double cal;
    public static TypeMovies []typeMovies = new TypeMovies[10];  //设置静态 保证所有对象访问同一个对象数组
    //判断要添加票价格的位置

    public Ticket() {
    }

    public Ticket(String type, int roomId, int pai, int zuoWei, String name) {
        this.type = type;
        this.roomId = roomId;
        this.pai = pai;
        this.zuoWei = zuoWei;
        this.name = name;
    }


    @Override
    public  void addMovie() {  //实现增加票的功能,用静态方法保证添加同一个数组
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

    public  void selectMoviePrice(String name)   //通过电影名选择设置的票价
    {
        //判断数组是有为空引用
        //输入的电影名是否存在
        //存下赋值价格
        //不存在输出提示信息
            setArray();
            if(setMoviePrice(name)) { //出现异常的原因是对象数组中没有实例，不能调用getName() 所以还要判断对象是否为空
                System.out.println("找到电影了!");
            }else {
                System.out.println("你输入的电影名系统中早不到！系统退出！");
                System.exit(-1);
            }

    }


    //用递归实现强制初始化变量
    public void setArray(){

        if(typeMovies[0] == null){
            System.out.println("你还未成功添加任何电影请添加！");
            addMovie();
            setArray();
        }

        return;
    }

    //判断元素是否在数组中并添加
    public boolean setMoviePrice(String name) {
        int length = typeMovies.length;
        for (int i = 0; i < length; i++) {

            TypeMovies Omovie = typeMovies[i];
            if(Omovie == null){  //如果是最后一个元素！说明不存在这个元素
                   return false;                //这里写的是flag =  true;出现错

            }
            if (Omovie.getName().equals(name)) {   //如果名字相同，返回true
                setPrice(Omovie.getPrice());
                return true;                  //开始写的是定义flag = true 出现错误
            }
        }

        return false;     //如果类型不为空,且名字不相同 返回false！
    }

    @Override
    public void deMovie() {     //实现删除票的功能(暂时不开发)

    }

    @Override
    public void showMovie() {    //实现展示查看电影类型和价格的功能！
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

    public double getCal() {
        return cal;
    }

    public abstract double calTick();  //定义抽象的目的是因为在printTicket中调用了此方法

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
