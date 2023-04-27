package chapterFour;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        int count = 0;
        int largestNumber = 0;
        while (count != -1) {
            System.out.println("input numbers and  press '0' to end");
            int number = User.nextInt();
            if (number == 0) {
                break; }

            if (number > largestNumber ) {
                largestNumber = number;
            }
        }
        System.out.println("largest number is "+largestNumber);
    }

}