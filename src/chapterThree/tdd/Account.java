package chapterThree.tdd;

public class Account {

    private int balance;
    private String pinNumber = "2222";


    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;}
    }

    public  void  withdraw(int amount) {

        if (amount > balance) {
            this.balance = balance;}
        if (amount < balance) {
            balance = balance - amount;}
    }
    public int getBalance() {
        return balance;}

    public void pinNumber(String Pin) {
 pinNumber = Pin;}

}