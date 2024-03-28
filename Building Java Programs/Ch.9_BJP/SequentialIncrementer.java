// Exercise 18:
// SequentialIncrementer implements Incrementable
// SequentialIncrementer starts value at 0 and increases by 1 each time incremented.

public class SequentialIncrementer implements Incrementable {
    private int value;

    public SequentialIncrementer() {
        this.value = 0;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
