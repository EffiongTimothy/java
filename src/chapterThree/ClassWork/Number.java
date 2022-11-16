package chapterThree.ClassWork;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
    int number = input.nextInt();

    if (number % 2 == 0 ){
        System.out.printf( "%d number is an even number", number );}
    else {
        System.out.printf("%d number is an odd number", number);
    }


    }

}