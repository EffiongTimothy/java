package chapterThree.pratice;

public class Student {
    private String name ;

    private String accountNumber ;
    private double amount;


    public Student(String name,double amount, String accountNumber ) {
        this.name= name;
        this.amount = amount;
        this.accountNumber = accountNumber;}

    public void setName(String newName){
            this.name = newName;
        }
    public String getName(){
        return  name;
    }

    public void setAge(String accountNumber) {
        this.accountNumber = accountNumber;
    }
public String getAccountNumber(){
        return accountNumber;
    }

    public void withdrawAmount(double withdrawAmount) {
        amount = amount - withdrawAmount;
    }

    public double getbalance() {
        return amount;
    }
public void deposit(double depositAmount){
        amount = amount + depositAmount;
}

    public double getNewBalance() {
        return amount;
    }


}


