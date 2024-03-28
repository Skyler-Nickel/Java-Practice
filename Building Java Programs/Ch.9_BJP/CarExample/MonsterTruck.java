// Exercise 4:
// Write a class MonsterTruck that relates to the Car and Truck classes
// Method: m1()  output: monster1
// Method: m2()  output: truck1
//                       car1
// method: toString()  output: "monster vroomvroom"

public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        super.m1();
        super.m2();
    }

    public String toString() {
        return "monster " + super.toString();
    }
}
