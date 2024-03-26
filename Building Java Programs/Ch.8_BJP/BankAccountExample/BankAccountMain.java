// Client to test BankAccount class

public class BankAccountMain {
    public static void main(String[] args) {
        // Test withdraw
        BankAccount acc1 = new BankAccount("John", 100.00);
        acc1.transactionFee = 3.50;
        String s = acc1.toString();
        System.out.println(s);
        acc1.withdraw(46.50);
        s = acc1.toString();
        System.out.println(s);
        System.out.println();

        // Test the toString method
        BankAccount yana = new BankAccount("Yana", 3.03);
        String s1 = yana.toString();
        System.out.println(s1);
        System.out.println();
        
        // Test transfer
        BankAccount ben = new BankAccount("ben", 0.00);
        String s2 = ben.toString();
        System.out.println(s2);
        ben.deposit(80.00);
        s2 = ben.toString();
        System.out.println(s2);
        
        BankAccount hal = new BankAccount("hal", 0.00);
        String s3 = hal.toString();
        System.out.println(s3);
        
        hal.deposit(20.00);
        s3 = hal.toString();
        System.out.println(s3);
        
        ben.transfer(hal, 20.00); // ben $55, hal $40
        s2 = ben.toString();
        s3 = hal.toString();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        ben.transfer(hal, 10.00); // ben $40, hal $50
        s2 = ben.toString();
        s3 = hal.toString();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        hal.transfer(ben, 60.00); // ben $85, hal $0
        s2 = ben.toString();
        s3 = hal.toString();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
    }    
}
