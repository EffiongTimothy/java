package chapter16;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private double balance;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    @Override
    public int compareTo(Customer customer) {
        if (this.getBalance()>customer.getBalance())return 1;
        else if (this.getBalance()<customer.getBalance())return -1;
        return 0;
    }
}
