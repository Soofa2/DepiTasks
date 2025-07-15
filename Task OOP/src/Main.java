import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Login step
        String correctUsername = "user";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        if (!enteredUsername.equals(correctUsername) || !enteredPassword.equals(correctPassword)) {
            System.out.println("Login failed. Exiting...");
            return;
        }

        System.out.println("Login successful.\n");

        // Create ATM object with initial balance
        ATM atm = new ATM(1000); // تبدأ برصيد 1000 جنيه

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                atm.checkBalance();
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                int amount = input.nextInt();
                atm.withdraw(amount);
            } else if (choice == 3) {
                System.out.print("Enter amount to deposit: ");
                int amount = input.nextInt();
                atm.deposit(amount);
            } else if (choice == 4) {
                System.out.println("Thank you. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

    }
}
