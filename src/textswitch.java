/**
 * Created by who on 2018-10-31.
 */

import java.io.*;
import java.util.Scanner;

public class textswitch {
//加入Scanner w做测试。


    public static void main(String[] args) {
        int tt;
        Scanner input = new Scanner (System.in);
        tt = input.nextInt ();// innput.要对应回TT变量的类型号。
        switch (tt) {
//case 大于T 的不执行。小于T的在没break,情况下，都显示来，
            case 1:
                Puppy myPuppy3 = new Puppy ("tomoo", "blue2");
                tt++;
                System.out.println (tt);
                break;


            case 2:
                Puppy myPuppy4 = new Puppy ("tomoo", "blue2");
                tt++;
                System.out.println (tt);
                break;


            case 3:
                Puppy myPuppy5 = new Puppy ("tomoo", "blue2");
                tt++;
                System.out.println (tt);
                break;


            case 4:
                Puppy myPuppy6 = new Puppy ("tomoo", "blue2");
                tt++;
                System.out.println (tt);
                break;

            default:
                System.out.println ("default");
                System.out.println (tt);
                break;
        }
    }
}
