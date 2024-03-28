// Exercise 11:
// A cash processing company has a class called Account used to process transactions:

// public Account(Client c)
// public boolean process(Transaction t)

// Account objects interact with Transaction objects, which have many methods including

// public int value

// Design a new class called FilteredAccount whose instances can be used in place of normal
// accounts but which include extra behavior of not processing transactions with a value
// of 0. More specifically, the new class should indicate that a zero-valued transaction
// was approved but shouldn't call the process method for it. Your class should have a single
// constructor that accepts a parameter of type client, and it should include the following
// method:

// public double percentFiltered()


public class FilteredAccount extends Account {
    private double zeroT;
    private int totalT;

    public FilteredAccount(Client c) {
        super(c);
        this.zeroT = 0.0;
        this.totalT = 0;
    }

    public double percentFiltered() {
        if (totalT == 0) {
            return 0.0;
        } 
        return (zeroT / (double) totalT) * 100.0;
    }

    public boolean process(Transaction t) {
        totalT++;
        if (t.value() == 0) {
            zeroT++;
            return true;
        }
        return super.process(t);
    }
}
