// Exercise 13:
// Add an equals method to the Cash class introduced in this chapter. Two Cash objects
// are considered equal if they represent the same amount of money.

// A Cash object represents an amount of money held by an investor.
public class Cash implements Asset {
    private double amount; // amount of money held

    // Constructs a cash investment of the given amount
    public Cash(double amount) {
        this.amount = amount;
    }

    // returns this cash investment's market value, which
    // is equal to the amount of cash
    public double getMarketValue() {
        return amount;
    }

    // since cash is a fixed asset, it never has any profit
    public double getProfit() {
        return 0.0;
    }

    // sets the amount of cash invested to the given value
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // equals method
    public boolean equals(Object o) {
        if (o instanceof Cash) {
            Cash c = (Cash) o;
            return amount == c.amount;
        }
        return false;
    }
}
