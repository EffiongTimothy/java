package tdd;

public class TimoBank {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance  ;
private String name ;
    public void  deposit(double balance) {
    this.balance = balance;

    }

}
