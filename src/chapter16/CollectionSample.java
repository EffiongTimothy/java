package chapter16;

import java.util.LinkedList;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("boy");
        names.add("girl");
        System.out.println(names);
        boolean b = names.contains("boy");
        System.out.println(b);
        System.out.println(names.get(1));

    }
}
