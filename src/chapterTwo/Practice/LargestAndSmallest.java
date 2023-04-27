package chapterTwo.Practice;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second, third, fourth, fifth;
        System.out.println("first number");
        first = scanner.nextInt();
        System.out.println("second number");
        second = scanner.nextInt();
        System.out.println("third number");
        third = scanner.nextInt();
        System.out.println("fourth number");
        fourth = scanner.nextInt();
        System.out.println("fifth number");
        fifth = scanner.nextInt();
        int largest = first, smallest = first;
        if (first >= largest) largest = first;
        if(first<=smallest) smallest = first;
        if (second >= largest) largest = second;
        if (second<=smallest)smallest = second;
        if (third >= largest)largest = third;
        if (third<=smallest)smallest = third;
        if (fourth >=largest)largest = fourth;
        if (fourth<=smallest)smallest = fourth;
        if (fifth >= largest)largest=fifth;
        if ( fifth<smallest)smallest=fifth;
        System.out.println("largest is "+largest);
        System.out.println("smallest is "+smallest);

    }
}
