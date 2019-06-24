package HomeWork;

class Emply{
    private String name;
    private int sal;

    public Emply(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public int sumCalc(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}

class NomalEmpl extends Emply{

    public NomalEmpl(String name,int sal){
        super(name,sal);
    }

    @Override
    public int sumCalc() {
        return this.getSal();
    }
}

class ManagerEmpl extends Emply{
    private int jiangJin;

    public ManagerEmpl(String name,int sal,int jiangJin){
        super(name,sal);
        this.jiangJin = jiangJin;
    }

    @Override
    public int sumCalc() {
        return this.getSal() + jiangJin;
    }
}

class salempl extends Emply{

    public int tiCheng;
    public salempl(String name,int sal,int tiCheng){
        super(name,sal);
        this.tiCheng = tiCheng;
    }

    @Override
    public int sumCalc() {
        return super.getSal() + tiCheng;
    }
}

class day08_Timu_4{
    public void testEmp(Emply emply){

        System.out.print(" 姓名:" + emply.getName());
        System.out.print(" 总工资:" + emply.sumCalc() + "\n");
    }
}

