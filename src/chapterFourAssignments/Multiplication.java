package chapterFourAssignments;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();
        int count = 1;
        while (count <= 12) {
            int result = userInput * count;
            System.out.println(userInput+ " times is "+count +" " +result);
            count++;
        }
    }
}