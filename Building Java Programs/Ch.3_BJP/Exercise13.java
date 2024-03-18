// Write a method called pay that accepts two parameters: a real number(TA Salary)
// and int(hours worked). The method should return how much money to pay the TA
public class Exercise13 {
    public static double pay(double salary, int hours) {
        double result = salary * Math.min(hours, 8);
        for (int i = 8; i < hours; i++) {
            result += (1.5 * salary);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }
}
