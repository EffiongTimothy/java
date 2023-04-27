package Assignment;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of student");
        int student = scanner.nextInt();
        System.out.println("Enter number of Subjects: ");
        int subject = scanner.nextInt();
        int[][] studentArray = new int[student][subject];

        int passed = 0;
        int failed = 0;
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < studentArray.length; i++) {
            for (int j = 0; j < studentArray[i].length; j++) {
                System.out.println("entering score for student" + (i + 1));
                System.out.println("entering score for subject" + (j + 1));
                studentArray[i][j] = scanner.nextInt();

                while (studentArray[i][j] > 100) {
                    System.out.println("enter a valid score for student " + (i + 1));
                    System.out.println("enter a valid  score for subject " + (j + 1));
                    studentArray[i][j] = scanner.nextInt();
                }

            }
        }

        System.out.print("================================================\n");
        System.out.print("STUDENT    ");
        for (int j = 0; j < studentArray[0].length; j++) {
            System.out.printf("SUB%d  ", j + 1);
        }
        System.out.println("TOT   AVE   POS");


        System.out.print("================================================\n");
        int row = studentArray[0][0];

        for (int i = 0; i < studentArray.length; i++) {
            int total = 0;
            double ave = 0;
            int pos = 0;
            System.out.println("");
            System.out.printf("student%2d", i + 1);


            for (int value : studentArray[i]) {
                System.out.printf("%5d", value);
                if (value>highest){
                    highest = value;}
                else if (value<lowest){lowest = value;}

                total += value;
                ave = (double) total / studentArray[i].length;
                if (total > row) {
                    pos = i + 1;
                }

            }
            System.out.printf("%7d%8.2f%6d  ", total, ave, pos);
        }

        System.out.println("\nhighest = " + highest);
        System.out.println("lowest = " + lowest);
    }
    }