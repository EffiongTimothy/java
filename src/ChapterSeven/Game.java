import java.util.ArrayList;
import java.util.Arrays;

//package ChapterSeven;
//
//import java.sql.Array;
//import java.util.Arrays;
//
public class Game {
//    public static void main(String[] args) {
//        int [][]numbers = new int[3][3];
//        numbers[0][0] = 1;
//        numbers[0][1] = 2;
//        numbers[0][2]=3;
//        numbers[1][0] = 4;
//        numbers [1][1] = 5;
//        numbers [1][2] = 6;
//        numbers[2][0]= 7;
//        numbers[2][1] = 8;
//        numbers [2][2] = 9;
//        System.out.println(Arrays.deepToString(numbers));
public static void main(String[] args) {
    int[] numbers = new int[10];
    int sum = 0,max =0,min =0;
    for (int i = 0; i < numbers.length; i++) {
    numbers[i] =i+ 1;
    }
    for (int i = 0; i <numbers.length;i++){
        sum +=numbers[i];
    }
    for (int i = 0; i < numbers.length; i++) {
        for (int j =1; j < numbers.length; j++) {
            if (numbers[i] > numbers[j]) {
                max = numbers[i];}}}

    for (int i = 0; i < numbers.length; i++) {
           for (int k = 1; k != numbers.length; k++) {
               if (numbers[i] < numbers[k]) {
                   min = numbers[i];
                   break;
               }


           }

              }
    System.out.println(Arrays.toString(numbers));
    System.out.println(sum);
    System.out.println(max);
    System.out.println(min);

int count = 1;
while (count < 15){
    System.out.print("=");
    count++;
}
}}