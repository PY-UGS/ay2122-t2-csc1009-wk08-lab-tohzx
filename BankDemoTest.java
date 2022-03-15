package Lab8_Q2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String args[]) {
        CheckingAccount acc = new CheckingAccount();
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter amount to deposit: $");
            acc.deposit(in.nextDouble());
            System.out.print("Enter amount to withdraw: $");
            if(acc.withdraw(in.nextDouble())) {
                System.out.println("The balance after withdraw is: $" + acc.getBalance());
            }
        } catch(InsufficientFundsException ife) {
            System.out.println("Sorry, but your account is short by: $" + Math.abs(ife.getAmount()));
        }
    }
}
