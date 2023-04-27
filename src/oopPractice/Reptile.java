package oopPractice;

public class Reptile extends Animal {
    @Override
    public void sleep(){
        System.out.println("sleep like reptile");
    }
    @Override
    public void walk() {
        System.out.println("walk Like reptile");
    }
}
