package ChapterSeven;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayapratices {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many score u wan add?");
//        int userInput = scanner.nextInt();
//        int [] number = new int[userInput];
//        int sum = 0;
//
//        for (int index = 0; index < userInput; index++) {
//            System.out.println("Enter score "+(index+1));
//            number [index] = scanner.nextInt();
//        }
//        for (int index = 0; index < number.length; index++) {
//            sum+=number[index];
//            System.out.println(" the values of ur arrays are"+sum);
//        }

        int[] arr = {10, 12, 3, 4};
        int length = arr.length;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr)); // Output: [4, 3, 12, 10]


    }

}