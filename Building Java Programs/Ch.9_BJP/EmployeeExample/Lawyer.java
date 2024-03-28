// Textbook example that represents inheritance

// A class to represent Lawyer
public class Lawyer extends Employee {
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return 15;
    }

    // overrides getVacationForm from Employee class
    public String getVacationForm() {
        return "pink";
    }

    public void sue() {
        System.out.println("I\'ll see you in court!");
    }
}
