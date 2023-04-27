package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop {
 private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
//        int numbe=1;
//        int [][] numbers  = new int[3][3];
//        for (int number = 0;number< numbers.length;number++) {
//            System.out.println(Arrays.toString(numbers[number]));
//            for (int count = 0; count < numbers[number].length; count++){
//                numbers[number][count] = numbe;
//            numbe++;
//            }
           // System.out.println(Arrays.deepToString(numbers));
        System.out.println("enter length of array");
        int[] newArray = new int[ scanner.nextInt()];
collectArrayAndPrintArray(newArray);
int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum+=newArray[i];
        }

        System.out.printf(" sum is %n"+sum);
        double average =(double) sum / newArray.length;
        System.out.printf("%n average is "+average);
    }
public static void collectArrayAndPrintArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
    }
    for (int i = 0; i < array.length; i++) {
        System.out.print(" "+array[i]);
    }
}
    }
