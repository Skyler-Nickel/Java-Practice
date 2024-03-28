// Exercise 2:
// Write a class Janitor to accompany the other law firm classes described in this chapter.
// Janitors work twice as many hours per week as other employees (80 hours/week), they
// make $30,000 ($10,000 less than general employees), they get half as much vacation as
// other employees (only 5 days), and they have an additional method clean that prints
// "Workin' for the man."

public class Janitor extends Employee {
    // doubles the amount of hours to 80 from employee super 40 hours
    public int getHours() {
        return super.getHours() * 2;
    }

    // subtracts $10,000 dollars from the employee super $40,000
    public double getSalary() {
        return super.getSalary() - 10000.0;
    }

    // halves the vacation days from the employee super 10 days
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public void clean() {
        System.out.println("Workin\' for the man.");
    }    
}
