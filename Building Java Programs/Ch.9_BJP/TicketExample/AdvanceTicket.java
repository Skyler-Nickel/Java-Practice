// Exercise 7:
// Implement a class called AdvanceTicket to represent tickets purchased in advance.
// An advance ticket is constructed with a ticket number and with a ticket number
// of days in advance that the ticket was purchased. 10 or more days = $30
// less than 10 days = $40

public class AdvanceTicket extends Ticket {
    private int numberOfDays;

    public AdvanceTicket(int number, int numberOfDays) {
        super(number);
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        if (numberOfDays > 9) {
            return 30.0;
        }
        return 40.0;
    }
    
    public String toString() {
        return super.toString() + ", Price: " + getPrice();
    }
}
