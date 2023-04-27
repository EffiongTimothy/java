package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int userInput = scanner.nextInt();
        int factorial = userInput;
        System.out.print(userInput);
        for (int i = userInput-1; i >=1 ; i--) {
            System.out.print("*"+i);
            factorial=factorial*i;
        }
        System.out.println("");
        System.out.println(factorial);


    }
}
