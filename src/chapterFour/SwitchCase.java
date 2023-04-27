package chapterFour;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1.2000
                2.5000
                3.10000
                4.15000
                5.20000
                6.other amount
                """);
        System.out.println("pick an option: ");
int input = scanner.nextInt();
switch (input) {
    case 1:
        System.out.println("take your 2k");
        break;
    case 2:
        System.out.println("take your 5k");
        break;
    case 3:
        System.out.println("take your 10k");
        break;
    case 4:
        System.out.println("take your money");
        break;
    case 5:
        System.out.println("take your money");
        break;
    case 6:
    {
        System.out.println("enter an amount");
        String amount = scanner.next();
        otherAmount(amount);
        break;

    }
    default:
        System.out.println("no money");

}

    }

    private static void otherAmount(String amount) {
        System.out.println("please take your"+amount+"k");
    }

}
