package tdd;

import Practice.Account1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account1Test {
private Account1 paulineAccount;
@BeforeEach
public void setPaulineAccount(){
    paulineAccount = new Account1(1, "john", "1234");


}
    @Test
    public void depositTest(){
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithCorrectPin(){
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000),paulineAccount.getBalance("1234"));
    }
    @Test
    public void withdraw(){
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        paulineAccount.withdraw(BigDecimal.valueOf(500),"1234");
        assertEquals(BigDecimal.valueOf(1500),paulineAccount.getBalance("1234"));
    }
}
