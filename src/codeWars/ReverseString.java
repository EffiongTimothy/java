package codeWars;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] stringArray = {"my", "name", "is","boy"};
        String words = "this name";
        reverseArray(stringArray);
        System.out.println(reverseString(words));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(reverseStringArray(stringArray)));
    }
    private static  String reverseString(String value) {
       String reveredString="";
        for (int i = value.length() -1; i >= 0 ; i--) {
            reveredString += value.charAt(i);

        }
   return reveredString;
    }
    public static String[] reverseStringArray(String[] array) {
        String[] stringArray = new String[array.length];
        int index = 0;
        for (int i = array.length -1; i >= 0 ; i--) {
            stringArray[index] = array[i];
            index++;
        }
        return stringArray;
    }
    public static void reverseArray(String[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

}
