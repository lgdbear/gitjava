import java.util.Scanner;
import java.io.*;

/**
 * Created by who on 2018-10-31.
 */
public class whileloop {

    public static void main(String[] args) {
        int num = 10;
        String[] nunbbers = new String[10];
        nunbbers[0] = "我爱";////数组给值，类型一定要对应。STRING对STRING INT对INT 不对互换。。。。
        nunbbers[1] = "我爱1";
        System.out.println (nunbbers[1]);
        nunbbers[1] = "我爱以后";////o数组各个赋值，可以随时变换，
        int tt;
        Scanner input = new Scanner (System.in);
        tt = input.nextInt ();// innput.要对应回TT变量的类型号。

        while (tt < 2) {


            Puppy myPuppy3 = new Puppy ("tomoo", "blue2");
            tt++;
            System.out.println (tt);
            System.out.println (nunbbers[1]);
            //           //break;/一但用这个，条件够不够，程序都返回停下。


        }


    }
}