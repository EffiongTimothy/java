package dsa;

import java.util.Arrays;

public class IndexOfArray {
    public static void main(String[] args) {
       indexOfArray(3,4,1);
    }
private static void indexOfArray(int array, int start, int end){
   int arraySum =0;
   int sum = 0;
   int[] arrayC = new int[array];
    for (int i = 0; i < arrayC.length; i++) {
        arraySum+=arrayC.length;
        arrayC[i] += arraySum;

        System.out.println(Arrays.toString(arrayC));
    }
}
}
