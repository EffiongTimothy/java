package chapterFourAssignments;

import java.util.Scanner;

public class OddNumberAndEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int sumOfEvenNumber = 0;
       int sumOfOddNumber = 0;
        int oddNumberEntered = 0;
       int evenNumberEntered = 0;
        int count = 1;
       while (count !=-1){
            System.out.println("Enter the a number, enter any negative number to exit");
            int userInput = input.nextInt();
            if (userInput <-0){
                break;
            }
            if(userInput % 2 ==0) {
                oddNumberEntered += 1;
                sumOfOddNumber +=  userInput;
            }
            else{
                evenNumberEntered +=1;
                sumOfEvenNumber += userInput;
            }
        }
        System.out.println("number of odd number entered is " +oddNumberEntered);
        System.out.println("number of even number entered is " +evenNumberEntered);
        System.out.println("sum of odd number is "+sumOfOddNumber);
        System.out.println("sum of even number is "+sumOfEvenNumber);
    }

}
