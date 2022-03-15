package Lab8_Q2;

public class CheckingAccount {
    private double balance;
    private int accNumber;
    
    public CheckingAccount() {
        this.balance = 0;
        this.accNumber = 0;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean withdraw(double amount) throws InsufficientFundsException {
        if(balance - amount < 0) {
            throw new InsufficientFundsException(balance - amount);
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }
}
