package chapterFourAssignments;
import java.util.Scanner;

public class InfiniteInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float largestNumber = Float.NEGATIVE_INFINITY;
        float smallestNumber = Float.POSITIVE_INFINITY;

        while (true) {

            System.out.println("Enter a number  \n Press '0' to get result ");
            float userInput = input.nextFloat();

            if (userInput == 0) {break;}

            if (userInput > largestNumber) {
                largestNumber = userInput;}

            if (userInput < smallestNumber ){
                 smallestNumber = userInput;}

        }
        System.out.printf("largest Number is %.1f%n", largestNumber);
        System.out.printf("smallest Number is %.1f%n", smallestNumber);
        System.out.println("thank you 😉😉");
    }




    }