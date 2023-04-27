package oopPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Mammal mammal = new Mammal();
//        mammal.walk();
//
//        Animal dog= new Mammal();
//        dog.sleep();
        Animal[] rat = new Animal[]{
                new Mammal(),
                new Reptile()
        };
        for (Animal animal:rat) {
    if (animal instanceof Reptile)animal.walk();
        }
        //System.out.println(Arrays.toString(rat));
    }
    Address address = new Address("01","Lagos");

    Student student = new Student(address);


}
