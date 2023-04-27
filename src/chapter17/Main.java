package chapter17;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        CarMethod carMethod = new CarMethod(){

            @Override
            public void move() {
                System.out.println("move");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        };
    toyota.move(carMethod);

    }
}
