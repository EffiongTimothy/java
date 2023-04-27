package Practice;

import java.math.BigDecimal;

public class Account1 {
 private int accountNumber;
 private  String accountName;
private BigDecimal balance = BigDecimal.ZERO;
private final String pin ;
    public Account1(int accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;

    }

    public void deposit(BigDecimal amount) {
       this.balance = balance.add(amount);
    }
    public void  validatePin(String pin){
        if (!this.pin.equals(pin)) throw new  IllegalArgumentException("invalid pin");

    }
    public void withdraw(BigDecimal amount,String pin) {
        validatePin(pin);
        this.balance = balance.subtract(amount);
    }
public BigDecimal getBalance(String pin){
        if (!pin.equals(this.pin)) throw new  IllegalArgumentException("invalid pin");
        return balance;
}
@Override
    public String toString(){
        return String.format("""
                ====================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                =======================
                """,accountName,accountNumber,balance.toPlainString());
}
}
