package chapterFour;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int counter = 1;
       int sum = 0;
       String letter = "";
        while (counter < 10) {
            switch (counter) {
                case 1 -> letter = "st";
                case 2 -> letter = "nd";
                case 3 -> letter = "rd";
                case 4, 10, 9, 8, 7, 6, 5 -> letter = "th";
            }
                System.out.println("Enter " +counter+letter+" grade");
                int userInput = scanner.nextInt();
            if (userInput < 0 || userInput > 100){
                System.out.println("invalid grade");
                System.exit(1);}

                sum = sum + userInput;
                counter++;
            }

        int average = sum / 10;

        System.out.println("the sum of the grades is "+sum+ " \nthe average of sum of grade is "+average);
    }
}


