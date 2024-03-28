// client to test car 

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Truck myTruck = new Truck();
        MonsterTruck myMonTruck = new MonsterTruck();

        System.out.println(myCar);
        myCar.m1();
        myCar.m2();
        System.out.println(myTruck);
        myTruck.m1();
        myTruck.m2();
        System.out.println(myMonTruck);
        myMonTruck.m1();
        myMonTruck.m2();
    }
}
