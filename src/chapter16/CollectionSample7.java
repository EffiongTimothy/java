package chapter16;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample7 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
//        Set<Integer> nums = new TreeSet<>();
        nums.add(20);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        Set<String> name = new TreeSet<>();
        name.add("ade");
        name.add("boluwatife");
        name.add("balu");
        name.add("bolanle");
        name.add(" bolu");
        System.out.println(name);
    }
}
