package chapterFour;
public class ClassExercise {
    public static void main(String[] args) {
        int key = 4;
        for (int counter = 1; counter < 10; counter +=2) {
            for (int j = 0; j < key; j++) {
                System.out.print(" ");
            }
                for (int j = 1; j <= counter; j++) {
                    System.out.print("*");
                }
                System.out.println();
                key--;
            }
key =1;
        for (int i = 7; i > 0; i-=2) {
            for (int j = 0; j < key; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
       key++;
        }
    }}
