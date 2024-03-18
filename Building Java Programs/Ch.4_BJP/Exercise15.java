// Write a method called getGrade that accepts an int representing a student's grade
// in a course and returns that student's numerical grade (between 0.0 and 4.0)
public class Exercise15 {
    public static double getGrade(int grade) {
        if ((grade < 0) || (grade > 100)) {
            throw new IllegalArgumentException("invalid grade");
        }
        if (grade < 60) {
            return 0.0;
        } else if ((grade >= 60) && (grade <=62)) {
            return 0.7;
        } else if (grade >= 95) {
            return 4.0;
        }
        double total = (grade - 63) / 10.0 + 0.8;
        return Math.round(total * 10) / 10.0;
    }

    public static void main(String[] args) {
        System.out.println(getGrade(60));
        System.out.println(getGrade(62));
        System.out.println(getGrade(63));
        System.out.println(getGrade(92));
        System.out.println(getGrade(94));
        System.out.println(getGrade(100));
    }
}
