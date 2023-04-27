package chapterThree.tdd;

public class CarApplication {
    public static void main(String[] args) {
        Car benz = new Car("A5","2021",300000);
        Car toyota = new Car("camry", "2021", 500000);
        System.out.println(benz.getPrice());
        System.out.println(toyota.getPrice());

    }
}
