package ChapterFiveAssignments;

import java.util.Scanner;

public class RandomMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String words = "Today is ";
        var day ="and the future day is ";;
String sunday = " Sunday";
var monday = " Monday";
var tuesday =" Tuesday";
var wednesday =" Wednesday";
var thursday = " Thursday";
var friday = " Friday";
var saturday =" saturday";
        System.out.println("Enter today's day: ");
        int user = scanner.nextInt();

        System.out.println("Enter number of days elapsed since today is: ");
        int userInput = scanner.nextInt() + user;

        switch (userInput) {
            case 0:
            System.out.printf("%s%s%s%s ",words,sunday,day,sunday);
            break;
            case 1:
            System.out.printf("%s%S%S%S",words,monday,day,monday);
            break;
            case 2:
            System.out.printf("%s%s%s%s",words,tuesday,day,tuesday);
            break;
            case 3:
            System.out.printf("%s Wednesday",words);
            break;
            case 4:
            System.out.printf("%s Thursday",words);
            break;
            case 5:
            System.out.printf("%s Friday",words);
            break;
            case 6:
            System.out.printf("%s Saturday",words);
            break;
            default:
            System.out.println("No date is available");
        }
switch (userInput + user){case 0:
    System.out.printf("%s%s%s%s ",words,sunday,day,sunday);

}
    }
}
