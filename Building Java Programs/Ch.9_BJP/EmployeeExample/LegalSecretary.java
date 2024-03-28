// Textbook example showing multilevel inheritance

// A class to represent legal secretaries.
public class LegalSecretary extends Secretary {
    // overrides getSalary from Employee class
    public double getSalary() {
        return super.getSalary() + 5000.0;
    }

    // new behavior of LegalSecretary objects
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
