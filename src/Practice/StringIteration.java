package Practice;

public class StringIteration {
    public static void main(String[] args) {
        solution(5,5,3,4,9);

    }
private static void solution(int number1,int number2,int number3,int number4,int number5 ){
   String s = "";
   String b = "";
   String c = "";
   String d = "";
   String e = "";
   for(int i = 1; i <= number1; i++){
       s+="*";
   }
    System.out.println(s);

    for (int j = 0; j < number2; j++) {
       b+="*";
    }
    System.out.println(b);
    for (int i = 0; i < number3; i++) {
        c+="*";
    }
    System.out.println(c);
    for (int i = 0; i < number4; i++) {
        d+="*";
    }
    System.out.println(d);
    for (int i = 0; i < number5; i++) {
        e+="*";
    }
    System.out.println(e);
        }
}
