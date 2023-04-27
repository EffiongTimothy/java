package ChapterFiveAssignments;

import java.util.Scanner;

public class CrapGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a wager");
        int userInput = scanner.nextInt();
        var bankBalance = 1000;
        while(userInput > bankBalance) {
            System.out.println("Enter a valid wager");
            userInput = scanner.nextInt();
        }
        System.out.println("Hello lets start the game ");
        System.out.println("Enter player name ");
        var userInputs = scanner.next();
        System.out.println("Welcome "+ userInputs);


    }

}
