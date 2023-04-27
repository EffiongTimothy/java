package ChapterFive;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number");
int side1= 1;
int side2=1;
int side3=1;
        for (int i = side1; i <= 500 ; i++) {
            for (int j = side2; j <= 500 ; j++) {
                for (int k = side3; k <= 500 ; k++) {
            if ((i*i) + (j*j) == (k*k)){
                System.out.printf("%d  %d  %d%n",i,j,k);
                System.out.printf("%d + %d = %d%n", i*i,j*j,k*k);

            }
                }
            }

        }
    }
}
