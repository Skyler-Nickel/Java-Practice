// Exercise 18:
// RandomIncrementer implements Incrementable interface
// RandomIncrementer begins its value at a random integer and changes it to a new
// random integer each time it is incremented 

import java.util.*;

public class RandomIncrementer implements Incrementable {
    private int value;
    private Random rand;
    
    public RandomIncrementer() {
        this.rand = new Random();
        this.value = rand.nextInt();
    }

    public void increment() {
        value = rand.nextInt();
    }

    public int getValue() {
        return value;
    }
}
