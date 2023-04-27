package philipCode;

import java.util.Scanner;

public class PhilipCpde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naira =0;
        int dollar = 0;
        int convertion = 0;
        System.out.println("enter value for dollar ");
        dollar = scanner.nextInt();
//        System.out.println("enter value for naira ");
//        naira = scanner.nextInt();
        convertion = dollar * 470;
        System.out.println("value for naira is  "+convertion);


    }
}
