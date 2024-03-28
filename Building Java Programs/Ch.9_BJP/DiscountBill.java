// Exercise10:
// Suppose a class GroceryBill keeps track of a list of items being purchased at a market:

// public GroceryBill(Employee clerk)
// public void add(Item i)
// public double getTotal()
// public void printReceipt()

// Define a class DiscountBill that extends GroceryBill to compute discounts for preferred
// customers. Its constructor accepts a parameter for whether the customer should get the
// discount. Your class should also adjust the total reported for preferred customers. For
// example, if the total would have been $80 but a preferred customer is getting a
// $20 in discounts, then getTotal should report the total as $60 for that customer.
// Also keep track of the number of items on which a customer is getting a nonzero
// discount and the sum of these discounts, both as a total amount and as a percentage
// of the original bill.

public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private double discountAmount;
    private int discountCount;
    

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
        this.discountAmount = 0.0;
        this.discountCount = 0;
    }

    public double getTotal() {
        return super.getTotal() - discountAmount;
    }

    public void add(Item i) {
        super.add(i);
        if (preferred && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return (discountAmount / super.getTotal()) * 100.0;
    }
}
