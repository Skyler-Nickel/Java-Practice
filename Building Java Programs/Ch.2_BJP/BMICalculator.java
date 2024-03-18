// Book example
public class BMICalculator {
    // Computes BMI for person
    public static void main(String[] args) {
        //variable declaration with initializing to zero
        double height = 0;
        double weight = 0;
        double bmi = 0;

        //sets value for variables
        height = 70;
        weight = 195;
        bmi = weight / (height * height) * 703;

        //prints output
        System.out.println("Current BMI: " + bmi);
    }
}