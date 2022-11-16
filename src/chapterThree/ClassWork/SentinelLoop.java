package chapterThree.ClassWork;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number");
        int userInput = input.nextInt();

        int largestNumber = userInput;
        int smallestNumber = userInput;

        while (userInput != 0){

            if(userInput > largestNumber) {
                largestNumber = userInput;
            }

            if (userInput < smallestNumber){
                    smallestNumber = userInput;
                }
            System.out.println("Enter a number");
            userInput = input.nextInt();
        }
            System.out.println("largest number is "+largestNumber);
        System.out.println("smallest number is "+smallestNumber);

    }
}
