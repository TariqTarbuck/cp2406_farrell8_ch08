import java.util.Arrays;

/**
 * Created by jc320680 on 29/08/17.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int x;
        int [] numArray = {1, 3, 2,5,6, 7,69 ,8, 20 ,34 ,56 ,73,435};
        for(x =0; x< numArray.length; ++x) {
            System.out.print(numArray[x]);
        }
        System.out.println();
        for (int y = numArray.length-1; y >= 0; --y) {
            System.out.print(numArray[y]);
        }



    }
}
