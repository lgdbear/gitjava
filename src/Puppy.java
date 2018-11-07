/**
 * Created by who on 2018-10-30.
 */
import java.text.SimpleDateFormat;
import java.util.Date;



public class Puppy {

    int puppyAge;
    String move;

    public Puppy() {

    }

    public void dogmove(String run_dog)
    {
     move=run_dog;

    }

    public Puppy(String name, String color) {
        // 这个构造器仅有一个参数：name
        System.out.println ("小狗的名字是 : " + name);
        System.out.println ("小狗的颜色是 : " + color);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println ("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }



    public static void main(String[] args) {


        Date date = new Date();


        //c的使用
        System.out.printf(" %2$tY",
                "Due date:", date);
        System.out.println("-------------------");
        /* 创建对象 */
        Puppy myPuppy = new Puppy ("tom", "blue");

        /* 通过方法来设定age */
        myPuppy.setAge (2);
        /* 调用另一个方法获取age */
        myPuppy.getAge ();
        /*你也可以像下面这样访问成员变量 */
        System.out.println ("变量值 : " + myPuppy.puppyAge);


    }


}