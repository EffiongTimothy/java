package chapterThree.pratice;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {



        Student run = new Student("rema",600,"0876543232");

                run.deposit(0);
                 run.withdrawAmount(1000.00);

        System.out.println(run.getName());

        if (run.getbalance() < 0) {
            System.out.println("insufficient funds");
        } else {
            System.out.println(run.getbalance());
        }
        if (run.getNewBalance() > 0) {
            System.out.println(run.getNewBalance());
        }
    }

}