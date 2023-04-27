package ChapterSeven;

import java.util.Arrays;

public class ArrayXAndO {
    public static void main(String[] args) {
        char[][] array = {{'X','O','X'},{'O','O','X'},{'X','O','O'}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
        for (char[] item : array) {
            for (char index: item) {
                System.out.print(index+ " ");
            }
            System.out.println();
        }

        System.out.println();

        for (char[] chars : array) {
            for (char value: chars) {
                if (value=='X') {
                    System.out.print(1+" ");
                }
                else {System.out.print(0+" ");
                }

            }
            System.out.println();

        }

    }
        }


