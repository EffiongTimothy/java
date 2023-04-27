package Practice;

import static Practice.PowerOf.secondValue;

public class PowerOf {
    public static void main(String[] args) {
        int value = 19;
        //firstValue(value);
        secondValue(firstValue(value));

    }


    public static int firstValue(int value) {
        int sum = 0;
        for (int i = 0; i < 1; i++) {
            int split1 = (value / 10) % 10;
            int split2 = (value) % 10;
            int power = (int) Math.pow(split1, 2);
            int power2 = (int) Math.pow(split2, 2);
            sum = power + power2;
            System.out.println("power of " + split1 + " is " + power + " and power of " + split2 + " is " + power2);
            System.out.println(power + " + " + power2 + " = " + sum);
        }
        return sum;
        }

    public static int secondValue(int sum) {
       int result = 0;
        for (int i = 0; i < 1; i++) {
            int split1 = (sum / 10) % 10;
            int split2 = (sum) % 10;
            int power = (int) Math.pow(split1, 2);
            int power2 = (int) Math.pow(split2, 2);
             result = power + power2;
            System.out.println("power of " + split1 + " is " + power + " and power of " + split2 + " is " + power2);
            System.out.println(power + " + " + power2 + " = " + result);
        }
        return result;
    }
    }