// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    private String name;
    private double balance;
    public double transactionFee = 0.00;

    public BankAccount() {
        this("", 0.00);
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if ((amount + transactionFee) > balance) {
            return;
        }
        balance = balance - (amount + transactionFee);
    }

    public String toString() {
        return name + ", $" + balance;
    }

    public void transfer(BankAccount account, double amount) {
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
