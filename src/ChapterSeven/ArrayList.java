package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        //int[] number = new int[8];
//        int [] numbers ={7,9,8,92,4,2,86,9,133,9};
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

// multi dimensional Arrays
        Scanner scanner = new Scanner(System.in);
        int [][]numbers = new int[3][5];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println();
                numbers[i][j]= scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numbers));
int[][] number = {{1,2,3,4},{12,3,4,5,},{4,6,3,7,8,}};
        System.out.println(Arrays.deepToString(number));
        for (int i = 0; i < number[2][2]; i++) {
            System.out.print(number[2][i]);
            System.out.println();
            System.out.print(number[1][i]);
        }

        String letter ="1";
        // to convert strings to integers
        System.out.println(Integer.parseInt(letter)+19);

        // using Math class random method
        int random = (int) (Math.random()*10);// explicit casting
        System.out.println(random);
// using the trim method in a chain method
      //  Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        System.out.println(name);
    }

}
