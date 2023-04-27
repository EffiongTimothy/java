package ChapterFive;

import java.util.Scanner;

public class TicTacTeo {
    public static void main(String[] args) {
       // Scanner scanner= new Scanner(System.in);
       int key = 0;
        for (int counter = 1; counter <= 10; counter++) {
            for (int j = 1; j <= counter; j++) {
               System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        int count = 10;
            for (int i = 1; i <= 10 ; i++){
                for (int j = 1; j <= count ; j++) {
                    System.out.print(j);
                }
                System.out.println();
            count --;
            }
            int counter1= 1;
        for (int i = 10; i >= 1 ; i++) {
            for (int j = 10; j >= counter1 ; j--) {
                System.out.print(" ");

            }
            for (int j = i; j >= 1; j++) {
                System.out.print(j);
            }
            System.out.println();
    counter1++;
        }
    }
    }
