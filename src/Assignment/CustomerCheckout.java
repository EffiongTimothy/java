package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addMoreItems,cashierName;
        System.out.println("what is the customer's name: ");
         String customerName = scanner.nextLine();
        do {
            System.out.println("what did user buy:");
            String item = scanner.next();

            System.out.println("How many pieces:");
            int numberOfItems= scanner.nextInt();
            System.out.println("how much per unit:");
            double pricePerItem = scanner.nextDouble();
            System.out.println("Add more items");
             addMoreItems = scanner.next();
             if (addMoreItems.equalsIgnoreCase("no"))break;
             else System.out.println("enter a yes or no answer");
             addMoreItems =scanner.next();
        }   while (addMoreItems.equalsIgnoreCase("yes"));
        System.out.println("what is your name");
          cashierName = scanner.next();
        System.out.println("how much discount will user get");
         double discountRate = scanner.nextDouble();
        System.out.print("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                DATE : 18-DEC-22 8:48:11 pm\n""");
        System.out.printf("Cashier:%s%n",cashierName);
        System.out.printf("Customer Name:%s%n",customerName);
        System.out.printf("""
                =================================================
                         ITEM   QTY     PRICE        TOTAL(NGN)
                -------------------------------------------------""");
        System.out.println();

    }



}
