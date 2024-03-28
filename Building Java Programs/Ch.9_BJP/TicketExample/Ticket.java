// Exercise 5:
// Implement a class called Ticket that will serve as the superclass for all three
// types of tickets. Define all common operations in this class, and specify all differing
// operations in such a way that every subclass must implement them.

public abstract class Ticket {
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + number;
    }

}
