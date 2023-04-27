package codeWars;

public class SumingArrays {
    public static void main(String[] args) {
        double[] a ={-9,-8};
        System.out.println(sum(a));
    }
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for (int i = 0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        return sum;

    }
}

