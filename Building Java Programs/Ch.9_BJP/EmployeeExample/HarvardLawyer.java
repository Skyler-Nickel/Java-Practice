// Exercise 3:
// Write a class HarvardLawyer to accompany the other law firm classes described earlier
// in this chapter. Harvard lawyers are like normal lawyers, but they make 20% more than
// a normal lawyer, they get 3 days more vacation, and they have to fill out four of the
// lawyer's forms to go on vacation. That is getVacationForm method should return
// "pinkpinkpinkpink".

public class HarvardLawyer extends Lawyer {
    // Make 20% more than lawyers
    public double getSalary() {
        return super.getSalary() + (super.getSalary() * .2);
    }

    // get three more days than lawyers
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    // Will return lawyer form * 4, "pinkpinkpinkpink"
    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}
