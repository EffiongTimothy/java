//package chapter14.ClassExercise;
//
//public class RemoveArray {
//    int[] arr = {1, 2, 3, 4, 5};
//    int indexToRemove = 2;
//    int[] newArr = new int[arr.length - 1];
//
//System.arraycopy(arr, 0, newArr, 0, indexToRemove);
//System.arraycopy(arr, indexToRemove + 1, newArr, indexToRemove, arr.length - indexToRemove - 1);
//
//System.out.println(Arrays.toString(newArr)); // [1, 2, 4, 5]
//
//}
