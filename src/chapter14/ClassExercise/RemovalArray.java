package chapter14.ClassExercise;

import java.util.Arrays;

public class RemovalArray {
    public static void main(String[] args) {
        int[] array = {9,5,4,3};
        arraySorter(array);
    }

    private static void arraySorter(int[] array) {
        int sum = 0;
        int index = 0;
        for (int j = 1; j < array.length; j++){
            if (j !=index){
                sum +=array[j];
            }
        }
        System.out.println(sum);
    }


}
