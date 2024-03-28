// Client to test implemented Employee class and subclasses


public class EmployeeMain {
    public static void main(String[] args) {
        Employee edna = new Employee();
        Lawyer lucy = new Lawyer();
        Secretary stan = new Secretary();
        LegalSecretary leo = new LegalSecretary();
        Janitor joe = new Janitor();
        Marketer abby = new Marketer();
        HarvardLawyer john = new HarvardLawyer();

        abby.advertise();
        joe.clean();
        System.out.println();

        printInfo(edna);
        printInfo(lucy);
        printInfo(stan);
        printInfo(leo);
        printInfo(joe);
        printInfo(abby);
        printInfo(john);
    }

    // Prints information about any kind of employee.
    public static void printInfo(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.printf("$%.2f, ", e.getSalary());
        System.out.print(e.getVacationDays() + ", ");
        System.out.print(e.getVacationForm() + ", ");
        System.out.println(e); // toString representation of employee
    }
}
