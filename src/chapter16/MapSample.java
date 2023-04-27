package chapter16;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        Map<String,String> nigerianStates = new HashMap<>();
        nigerianStates.put("cross-river "," calabar");
        nigerianStates.put("Lagos "," ikeja");
        nigerianStates.put("Sokoto "," sokoto");
        nigerianStates.put("Abia "," umuaha");
        System.out.println(nigerianStates);

        Map<String,String[]> nigerianState = new HashMap<>();
        nigerianState.put("cross-river ",new String[]{" calabar","omole"});
        nigerianState.put("Lagos ",new String[]{" ikeja","sabo"});
        nigerianState.put("Sokoto ",new String[]{" sokoto","yam"});
        nigerianState.put("Abia ",new String[]{" umuaha","alaba"});

        nigerianState.keySet().forEach(key ->Arrays.sort(nigerianState.get(key)));
        nigerianState.forEach((key,value)-> System.out.println(key+ ":" + Arrays.toString(value)));

        Map<String, Integer> people = new TreeMap<>();
        people.put("henry",22);
        people.put("prince",35);
        people.put("jerry",30);
        people.put("gwen",90);
        System.out.println(people);



        List<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("max"+Collections.max(list));
        System.out.println("min"+Collections.min(list));


        List<Customer> list2 = new LinkedList<>();
        list2.add(new Customer(1,"fem",400_00.00));
        list2.add(new Customer(2,"dean",40_00.00));
        list2.add(new Customer(3,"jake",4_00.00));
        list2.add(new Customer(4,"jen",40.00));
        Comparator<Customer> comparator = (c1,c2) -> {
            if (c1.getBalance() < c2.getBalance()) return 1;
            else if (c1.getBalance() > c2.getBalance()) return -1;
        return 0;
        };
        Collections.sort(list2);
        System.out.println(list2);

    }
}
