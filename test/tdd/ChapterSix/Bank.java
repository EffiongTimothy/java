//package tdd.ChapterSix;
//
//import Practice.Account1;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//
//public class Bank {
//    ArrayList<Account1>account1s = new ArrayList<>();
//
//    public String createAccount1s(String firstName, String lastName, String pin) {
//        int accountNumber = account1s.size()+1;
//        Account1 bankAccount = new Account1(1,firstName+" "+lastName,pin);
//    account1s.add(bankAccount);
//    return "your Account Number is "+accountNumber;
//    }
//
//
//    public int getNumberOfCustomers(){
//        return account1s.size();
//    }
//    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
//
//
//    return BigDecimal.valueOf(accountNumber);}
//
//    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
//    }
//
//    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
//    }
//
//    public void depositInto(int accountNumber, BigDecimal amount) {
//    }
//
//    public void createAccountFor(String firstName, String lastName, String pin) {
//    }
//}
