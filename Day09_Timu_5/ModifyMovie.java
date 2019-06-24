package HomeWork.Day09_Timu_5;

import java.lang.reflect.Array;
import java.util.LinkedList;


public interface ModifyMovie {
            //getMoviePri[1] = new TypeMovies("蜘蛛侠",20);/*new TypeMovies("蜘蛛侠",80)
            // new TypeMovies("复仇者联盟",90)};//用到知识点1.抽象类的方法默认是public static final类型
                                                             //这里这样写是给电影类型和票价设置初始值防止数组修改溢出！
                                                        //当然还有其他方法实现这样写是为了复习老师讲的知识;



     void addMovie();

     void deMovie();

     void showMovie();




}
