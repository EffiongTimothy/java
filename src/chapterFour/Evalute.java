package chapterFour;

import java.util.Scanner;

public class Evalute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        float input = scanner.nextFloat();
float result =0;
        for (float count = 1; count <= input; count++) {
            result += (1 / count);
        }
        System.out.println(result);
    }
}