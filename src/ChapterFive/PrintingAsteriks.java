package ChapterFive;

import java.util.Scanner;

public class PrintingAsteriks {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        var number = scanner.nextInt();
        rightAngleTriangle(number);
    }
private static void rightAngleTriangle(int number) {
    if (number < 1) return;
    number--;
    rightAngleTriangle(number);
    for (int index = 0; index < number; index++) {
        System.out.print(" *");
    }
    System.out.println();
    }
}
