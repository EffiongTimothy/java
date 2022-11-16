package chapterFourAssignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter a  number");
            int userInput = input.nextInt();
            if( userInput % 2 == 1){
                System.out.println(userInput+" is a prime number");}
            else {
                System.out.println(userInput+" is not a prime number");
            }
    }
}
