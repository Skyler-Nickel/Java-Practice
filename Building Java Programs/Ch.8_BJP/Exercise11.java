// Add a field to BankAccount class named transactionFee and deduct transactionFee
// from withdraw

public class Exercise11 {
    public double transactionFee = 0.00;
    
    public void withdraw(double amount) {
        if ((amount + transactionFee) > balance) {
            return;
        }
        balance = balance - (amount + transactionFee);
    }
}
