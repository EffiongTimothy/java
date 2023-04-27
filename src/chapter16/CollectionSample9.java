package chapter16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample9 {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"dean",900_000.00);
        Customer customer2 = new Customer(2,"dean1",90_000.00);
        Customer customer3 = new Customer(3,"dean2",9_000.00);
//        Comparator<Customer> comparator = (c1,c2) ->{
//            if(c1.getId() > c2.getId()) return 1;
//            else if (c1.getId() < c2.getId()) return -1;
//            return 0;
//        };
        Set<Customer> customers = new TreeSet<>(Comparator.reverseOrder());
        customers.add(customer3);
        customers.add(customer2);
        customers.add(customer);
        System.out.println(customers);

    }
}
