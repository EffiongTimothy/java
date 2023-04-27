package leetcodePractice;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers ={2,3,4,5};
        for (int i = 0; i < numbers.length; i++){
            for (int j:numbers) {
                numbers[3] =numbers[j] ;
            }
        }
    }

}
