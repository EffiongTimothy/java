package ChapterFive;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("in the lop 1= "+i);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("in the loop j= "+j);
//            }
//
//        }

        int [][] arr = new int[1][5];
        for (int j=0;j<arr.length;j++ ) {
            for (int i = 0; i < arr[j].length ; i++) {
                System.out.println(arr[j][i]);
            }

        }
}
}
