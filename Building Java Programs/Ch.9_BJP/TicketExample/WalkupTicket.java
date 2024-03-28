// Exercise 6:
// Implement a class called WalkupTicket to represent a walk-up event ticket. Walk-up
// tickets are also constructed by number, and they have a price of $50.

public class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }

    public double getPrice() {
        return 50.0;
    }

    public String toString() {
        return super.toString() + ", Price: " + getPrice(); 
    }
}
