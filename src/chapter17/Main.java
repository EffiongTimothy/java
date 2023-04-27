package chapter17;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        CarMethod carMethod = (name,price) -> "its moving "+name + price;
  var v =  toyota.move(carMethod);
        System.out.println(v);
        System.out.println(carMethod.move("corolla",3.00));
    }
}
