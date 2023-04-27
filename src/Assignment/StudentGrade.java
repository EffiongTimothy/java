package Assignment;

import java.util.Scanner;

public class StudentGrade {
public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userInput, count = 1;
        System.out.println("Enter number of students: ");
        userInput = scanner.nextInt();
        int[] numberOfStudent = new int[userInput];
        System.out.println("Enter number of subjects: ");
        userInput = scanner.nextInt();
        int[] numberOfSubjects = new int[userInput];
        System.out.println("Saving >>>>>>>>\nsaved successfully");
        printSpace();
        printLoop(numberOfStudent,numberOfSubjects);


       printLengthOfLine(60,numberOfStudent,numberOfSubjects);


        printSpace();

        int counter;
        for (int k = 0; k < numberOfStudent.length ; k++) {
        for (int i = 0; i < numberOfSubjects.length; i++) {
            counter = i ;
            System.out.print("  "+numberOfSubjects[counter]);
        }
        }


    }


//static Scanner scanner = new Scanner(System.in);

    public static int[] printLoop(int[] numberOfStudent, int[] numberOfSubjects){
    int i;
        for (int k = 0; k < numberOfStudent.length; k++) {
            for ( i = 0; i < numberOfSubjects.length; i++) {
                System.out.println("Entering score for student" + (k + 1));
                System.out.println("Enter score for subject " + (i + 1));
                numberOfSubjects[i] = scanner.nextInt();
                System.out.println("Saving >>>>>>>>\nsaved successfully\n");
            }
        }
    return new int[]{numberOfSubjects[0]};}
public static void printLengthOfLine(int line,int[] numberOfStudent,int[] numberOfSubjects){
        for (int i = 1; i < line; i++) {
    System.out.print("=");}
        System.out.println(" ");
    for (int i=0;i<numberOfStudent.length;i++) {
        System.out.println(i+1);
    }
    System.out.print("STUDENT");
    for (int i = 0; i < numberOfSubjects.length; i++) {
        System.out.printf("SUB%d   ",(i+1));
    }
    System.out.println("TOT    AVE   POS");

    }
public static void printSpace(){System.out.println(" ");}
}

