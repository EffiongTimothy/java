package codeWars;

public class Clock {
    public static void main(String[] args) {
        System.out.println(Past(6,7,10));
    }
        public static int Past(int h, int m, int s) {
            int hour =  h * 3600000;
            int minutes =  m * 60000;
            int second = s * 1000;
            return hour + minutes + second;
            //Happy Coding! ^_^
        }
    }

