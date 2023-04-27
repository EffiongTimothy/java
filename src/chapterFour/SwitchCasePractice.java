package chapterFour;

import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the footballer post: ");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("this is the goal keeper post");
            case 2, 3, 4, 5 -> System.out.println("this is the  defensive post");
            case 6, 7, 8 -> System.out.println("this is the midfielders post");
            case 9, 10, 11 -> System.out.println("this is the attackers post");
            default -> System.out.println("you no sabi football");
        }
    }
}
