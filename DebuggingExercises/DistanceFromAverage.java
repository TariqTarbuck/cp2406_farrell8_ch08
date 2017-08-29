import java.util.Scanner;

/**
 * Created by jc320680 on 29/08/17.
 */
public class DistanceFromAverage {
    public static void main(String[] args) {
        int x = 0, y;
        double firstVar;
        double array[] = new double[20];
        double total = 0;
        double average = 0;
        double entry;
        int STOP = 99999;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        firstVar = userInput.nextDouble();
        while (firstVar != STOP && x < array.length){
            array[x] = firstVar;
            ++x;
            System.out.println("Enter another word");



        }


//            entry = JOptionPane.showInputDialog(null,
//                    "Enter another number\n" +
//                            "Enter " + STOP + " when you want to stop");
//        }

        if(x==0){
            System.out.println("Please enter a number");
        }

        for(y = x-1; y >= 0; --y)
        {
            message.append(array[y]);
            message.append("\n");
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
