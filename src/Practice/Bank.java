package Practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Bank {
        //I have to keep the account somewhere
        List<Account1> accounts = new ArrayList<>();
        public String createAccountFor(String firstName, String lastName, String pin) {
            int accountNumber = accounts.size() + 1;
            Account1 newAccount = new Account1(accountNumber, firstName+" "+lastName, pin);
            accounts.add(newAccount);
            return firstName;
        }

        public int getNumberOfCustomers() {
            return accounts.size();
        }

        public Account1 findAccount(int accountNumber) {
            return accounts.get(accountNumber - 1);
        }

        //To check the balance, you check the account number and balance
        public BigDecimal checkBalanceFor(int accountNumber, String pin) {
            Account1 account = accounts.get(accountNumber - 1);
            //Account1 account = findAccount(accountNumber);
            return account.getBalance(pin);
        }

        public void depositInto(int accountNumber, BigDecimal amount) {
            Account1 account = findAccount(accountNumber);
            account.deposit(amount);
            //findAccount(accountNumber).deposit(amount);
        }

        public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
            findAccount(accountNumber).withdraw(amount, pin);
        }


        public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
            //For transfer, never deposit first, withdraw first before deposit for transfer
            //get the money first, let it leave the account first
            Account1 senderAccount = findAccount(senderAccountNumber);
            Account1 receiverAccount = findAccount(receiverAccountNumber);
            senderAccount.withdraw(amount, senderPin);
            receiverAccount.deposit(amount);
        }
    }

