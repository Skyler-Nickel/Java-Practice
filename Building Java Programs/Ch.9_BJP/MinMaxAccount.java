// Exercise 9:

// A company has written a large class BankAccount with many methods including:
// public BankAccount(Startup s)
// public void debit(Debit d)
// public void credit(Credit c)
// public int getBalance()

// Design a new class MinMaxAccount whose instances can be used in place of a bank account
// but include new behavior of remembering the minimum and maximum balances ever recorded
// for the account. The class should have a constructor that accepts a Startup parameter.
// The bank account's constructor sets the initial balance on the basis of the startup
// information.

public class MinMaxAccount extends BankAccount {
    private int minimum;
    private int maximum;

    // Constructor that accepts Startup object, assuming balance is in super
    // set the minimum and maximum for object
    public MinMaxAccount(Startup s) {
        super(s);
        minimum = Integer.MAX_VALUE;
        maximum = Integer.MIN_VALUE;
    }

    // Assume only debits and credits can change balance
    // after passing debit object we need to check the new balance in super
    // update min and max if they are lower or higher than min or max
    public void debit(Debit d) {
        super.debit(d);
        if (super.getBalance() < minimum) {
            minimum = super.getBalance();
        } else if (super.getBalance() > maximum) {
            maximum = super.getBalance();
        }
    }

    // Assume only debits and credits can change balance
    // after passing debit object we need to check the new balance in super
    // update min and max if they are lower or higher than min or max
    public void credit(Credit c) {
        super.credit(c);
        if (super.getBalance() < minimum) {
            minimum = super.getBalance();
        } else if (super.getBalance() > maximum) {
            maximum = super.getBalance();
        }
    }

    // returns the minimum balance in pennies
    public int getMin() {
        return minimum;
    }

    // returns the maximum balance in pennies
    public int getMax() {
        return maximum;
    }
}
