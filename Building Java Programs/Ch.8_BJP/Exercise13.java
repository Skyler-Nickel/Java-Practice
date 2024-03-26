// Add a transfer method to the BankAccount class
// Your method should move money from the current bank account to another bank account.
// The method accepts two parameters: a second BankAccount to accept the money, and
// a real number for the amount to transfer. There is a $5.00 fee for transferring
// money

import BankAccountExample.BankAccount;

public class Exercise13 {
    public void transfer(BankAccount account, double amount) {
        // optional line, client could set transaction fee also
        transactionFee = 5.00;
        if (transactionFee > this.balance) {
            return;
        } else if ((amount + transactionFee) > this.balance) {
            this.balance -= transactionFee;
            account.balance += this.balance;
            this.balance -= this.balance;
            return;
        }
        this.balance -= amount + transactionFee;
        account.balance += amount;
    }
}
