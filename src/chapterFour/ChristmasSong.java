package chapterFour;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int counter = 12; counter >= 1; counter--){
            System.out.println("Christmas song");
            input = scanner.nextInt();
            switch (counter){
                case 1 -> {
                    System.out.println("""
                            On the first day of Christmas, my true love sent to me
                            A partridge in a pear tree""");
                    input = scanner.nextInt();
                }
            case 2 -> {
                System.out.println("""
                        On the second day of Christmas, my true love sent to me
                        Two turtle doves, and A partridge in a pear tree""");
            input = scanner.nextInt();}
            }

        }
    }
}
