package chapterTwo.Practice;

import java.util.Scanner;

public class Divisable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =1;
        while (count!=0){
        System.out.println("enter a number: "+
                "press zero to exit");
    int userInput = scanner.nextInt();
    if (userInput%3==0) System.out.printf("%s is divisable\n",userInput);
    else System.out.printf("%d is not\n",userInput);
    if (userInput == 0)break;   }

    }
}
