// This is a client program to test the Ticket class and subclasses

public class TicketMain {
    public static void main(String[] args) {
        WalkupTicket walkupTicket = new WalkupTicket(17);
        AdvanceTicket advanceTicket = new AdvanceTicket(17, 10);
        AdvanceTicket advanceTicket2 = new AdvanceTicket(17, 9);
        StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(17, 10);
        StudentAdvanceTicket studentAdvanceTicket2 = new StudentAdvanceTicket(17, 9);

        System.out.println("Walkup Ticket " + walkupTicket.toString());
        System.out.println("Advance Ticket (days > 9) " + advanceTicket.toString());
        System.out.println("Advance Ticket (days < 10) " + advanceTicket2.toString());
        System.out.println("Student Advance Ticket (days > 9) " + studentAdvanceTicket.toString());
        System.out.println("Student Advance Ticket (days < 10) " + studentAdvanceTicket2.toString());
    }
}
