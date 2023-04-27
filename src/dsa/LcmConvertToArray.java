package dsa;

import java.util.Arrays;

public class LcmConvertToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertToArray(100)));
    }
    public static int[] convertToArray(int value) {
            int[] array = new int[value];
            int index = 0;
            int divider = 2;
        while (divider > 0) {
         if (value % divider == 0){
         value /= divider;
         array[index] = divider;
         index++;}
         else {divider++;}
        }
   return Arrays.copyOf(array,index);
        }

    }



