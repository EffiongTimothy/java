package chapterFour;

import java.util.Scanner;

public class RaceToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int result = 1;
        for (int i = input2; i < 0; i++){
            result *= input1;
        }
        System.out.println(result);

    }
}
