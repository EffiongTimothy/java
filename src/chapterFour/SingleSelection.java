package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        //collect the input
        Scanner inputCollector = new Scanner(System.in);
        //check userInput:

        System.out.println("Enter a number");
        int userInput = inputCollector.nextInt();
        //userInput divided 2 has no remainder:
        if (userInput > 10) {
            //input is even
            System.out.println("out of range");}
        else if (userInput % 2 == 0)
                System.out.println("it is even");

            else {
                System.out.println("it is an odd");
            }
        }
    }


