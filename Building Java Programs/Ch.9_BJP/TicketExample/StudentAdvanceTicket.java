// Exercise 8:
// Implement a class called StudentAdvanceTicket to represent tickets purchased in advance
// by students. A student advance ticket is constructed with a ticket number and with
// the number of days in advance that the ticket was purchased. Student advance tickets
// purchased 10 or more days before the event cost $15, and student advance tickets
// purchased fewer than 10 before the event cost $20(half of a normal ticket). When
// a student advance ticket is printed, the String should mention that the student must
// show his or her student ID.

public class StudentAdvanceTicket extends AdvanceTicket {
    private int numberOfDays;

    public StudentAdvanceTicket(int number, int numberOfDays) {
        super(number, numberOfDays);
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        if (numberOfDays > 9) {
            return 15.0;
        }
        return 20.0;
    }

    public String toString() {
        return super.toString() + " (ID required)";
    }
}
