package Practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int user = scanner.nextInt();
        for (int i = 1; i <= user; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i %5 == 0) {
                System.out.println("BUZZ");
            }
        else if(i %3 == 0 && i%5==0) {
                System.out.println("FIZZBUZZ");
            }
        else {
                System.out.println(i);
            }
        }

    }
}
