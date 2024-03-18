// This exercise is to compute a body linear motion using physics equation for position
// random values are assigned to variables, but doubles could be used for more precision 
public class Exercise1 {
    public static void main(String[] args) {
        int time = 10;
        int initialPosition = 5;
        int intialVelocity = 10;
        int acceleration = 5;
        int position =  initialPosition + (intialVelocity * time) + ((1/2) * (acceleration * (time * time)));
        System.out.println("Position : " + position);
    }
}
