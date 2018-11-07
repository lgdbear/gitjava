/**
 * Created by who on 2018-10-31.
 */
import javax.print.DocFlavor;
import java.io.*;

public class inport {
    public static void main(String []args) {
    Puppy myPuppy3 = new Puppy ("tomoo", "blue2");
    myPuppy3.dogmove ("wq afdjasldf kj");
    System.out.println  (myPuppy3.move);
    Puppy myPuppy4 = new Puppy ("tomoo4", "blue4");
    myPuppy4.dogmove ("dafdadsflkasjflkj4");
    //赋值，只能给DOGMOVE
    System.out.println (myPuppy4.move);

    }
}

