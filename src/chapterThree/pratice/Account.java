package chapterThree.pratice;

import java.math.BigDecimal;

public class Account{

private String name;
private double balance;


public Account(String name, double balance){
this.name = name;
this.balance = balance;
}


public void SetName(String name){
this.name = name;
}
public String getName(){
return name;
}

public double getBalance(){
return balance;
}

    public void deposit(BigDecimal valueOf) {
    }
}


