package ChapterFiveAssignments;

import java.util.Scanner;

public class PositiveAndNegativeCounter {
    public static void main(String[] boobs) {
        Scanner scanner = new Scanner(System.in);
       var positiveNumber = 0;
       var negativeNumber = 0;
       var sum = 0.0;
       var average=0.0;
       System.out.println("Enter an integer, the input ends if it is 0: ");
        int userInput = scanner.nextInt();
        while (userInput != 0){
             userInput = scanner.nextInt();
            if (userInput > 0)
                positiveNumber+=1;

            else if (userInput < 0)
            negativeNumber+=1;

            else if (userInput == 0) System.out.println("No number are entered except 0");
        sum += userInput;
        average = negativeNumber+positiveNumber ;
        }
    average =sum/average;
        System.out.println("the number of positive is "+positiveNumber);
        System.out.println("the number of negative is "+negativeNumber);
        System.out.println("The total is "+sum);
        System.out.println("The average is "+average);
    }
}
