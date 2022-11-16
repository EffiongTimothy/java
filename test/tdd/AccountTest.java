package tdd;

import chapterThree.tdd.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    @Test
    public void depositTest() {

        Account deborahAccount = new Account();

        deborahAccount.deposit(5000);

        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);


    }


    @Test
    public void depositTwiceTest() {
        // given there is an account
        Account deborahAcoount = new Account();
        // given that an intial ballance is 4000
        deborahAcoount.deposit(4000);
        // when i deposit 2000
  deborahAcoount.deposit(2000);
    // check that balance is 6000
    int deborahBalance = deborahAcoount.getBalance();
    assertEquals(6000, deborahBalance);
    }
@Test
public void depositNegativeAmountTest() {
    // given there is an account
    Account deborahAcoount = new Account();
    // given that an intial ballance is 4000
    deborahAcoount.deposit(4000);
    // when i deposit -2000
    deborahAcoount.deposit(-2000);
    // check that balance is 4000
    int deborahBalance = deborahAcoount.getBalance();
    assertEquals(4000, deborahBalance);
}
@Test
public void withdrawAmountTest(){
        // given there is an account
        Account deborahAcoount = new Account();
        // given that an intial ballance is 4000
        deborahAcoount.deposit(10000);
        // when i withdraw 2000
        deborahAcoount.withdraw(2000);
        // check that balance is 2000
        int deborahBalance = deborahAcoount.getBalance();
        assertEquals(8000, deborahBalance);
}
@Test
public void withdrawNagativeTest() {
    // given there is an account
    Account nativeAcoount = new Account();
    // given that an intial ballance is 4000
    nativeAcoount.deposit(10000);
    // when i withdraw 2000
    nativeAcoount.withdraw(20000);
    // check that balance is 2000
    int deborahBalance = nativeAcoount.getBalance();
    assertEquals(10000, deborahBalance);


    }
@Test
    public void withdrawalEmptyBalance() {
    Account empty = new Account();
        // given there is an account
    empty.deposit(0);

    empty.withdraw(2000);
    // check that balance is 2000
    int deborahBalance = empty.getBalance();
    assertEquals(0, deborahBalance);

    }
@Test
public void withdrawalAndDeposit(){
        Account deborah = new Account();
        deborah.deposit(5000);
        deborah.deposit(5000);
        deborah.withdraw(6000);
        int deborahBalance = deborah.getBalance();
        assertEquals(4000, deborahBalance);

}

@Test
public void withdrawalTwicetest(){
        Account pologram = new Account();
        pologram.deposit(4000);
        pologram.withdraw(2000);
    pologram.withdraw(1000);
    int pologramAccount = pologram.getBalance();
    assertEquals(1000, pologramAccount);


}
@Test
public void createPinTest(){
        Account accountPin = new Account();

        accountPin.pinNumber("g");

assertEquals(7547, accountPin);



}
@Test
    public void inputPinWithdrawal(){
        Account money = new Account();
        money.pinNumber("h");
        money.deposit(10000);
        money.withdraw(3000);

        assertEquals(4565, money);
        int moneyAccount = money.getBalance();
        assertEquals(7000, moneyAccount);
    }
}



