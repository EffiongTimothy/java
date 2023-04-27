package ChapterSeven;

public class testing {
    public static void main(String[] args) {
        int[] arr ={2,3,56,2,1};
        int findNumber = 56;
        for (int i = 0; i < arr.length; i++) {
            if (findNumber == arr[i]){
                System.out.println(" found "+arr[i]+" at position "+(i+1)+" Length of array is "+arr.length);

            }

        }
}
}
