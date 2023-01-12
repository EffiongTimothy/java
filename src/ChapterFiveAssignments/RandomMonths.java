package ChapterFiveAssignments;

import java.util.Scanner;

public class RandomMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = "Today is ";
        System.out.println("Enter today's day: ");
        int userInput = scanner.nextInt();
        System.out.println("Enter ");
        int user = scanner.nextInt();
        if (userInput == 0) {
            System.out.printf("%ssunday",words);}
        else if (userInput == 1 ){
            System.out.printf("%smonday",words);
        }
        else if (userInput == 2 ){
            System.out.printf("%stuesday",words);
        }
        else if (userInput == 3){
            System.out.printf("%swednesday",words);
        }
        else if (userInput == 4) {
            System.out.printf("%sthursday",words);
        }
        else if (userInput == 5) {
            System.out.printf("%sfriday",words);
        }
        else if (userInput == 6) {
            System.out.printf("%ssaturday",words);
        }
    }
}
