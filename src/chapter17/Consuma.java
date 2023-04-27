package chapter17;

import java.util.function.Consumer;

public class Consuma {
    public static void main(String[] args) {
        Consumer<String> consumer  = (name)-> System.out.println(name);

        consumer.accept("name");

    }
}
