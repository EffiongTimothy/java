package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello,kindly enter card details to verify: ");
       // int userInput = scanner.nextInt();
        long[] cardNumber = new long[12];
        for (int i = 0; i < cardNumber.length; i++) {
            cardNumber[i]= scanner.nextInt();
            System.out.println(cardNumber[i]);
        }

    }

}
