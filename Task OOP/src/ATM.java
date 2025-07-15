/**
 * ATM class represents a simple bank account system.
 * It provides basic operations like checking balance,
 * depositing, and withdrawing money.
 */
public class ATM {
    private int balance;

    public ATM(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance + " EGP");
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " EGP has been deposited.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " EGP has been withdrawn.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

