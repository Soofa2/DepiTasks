import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of Player One:");
        String playerOne = sc.nextLine();

        System.out.println("Please enter name of Player Two:");
        String playerTwo = sc.nextLine();

        System.out.println(playerOne + ", enter your choice (rock, paper, or scissors):");
        String choiceOne = sc.nextLine().toLowerCase();

        System.out.println(playerTwo + ", enter your choice (rock, paper, or scissors):");
        String choiceTwo = sc.nextLine().toLowerCase();

        if (choiceOne.equals(choiceTwo)) {
            System.out.println("It's a tie!");
        } else if (
                (choiceOne.equals("rock") && choiceTwo.equals("scissors")) ||
                        (choiceOne.equals("scissors") && choiceTwo.equals("paper")) ||
                        (choiceOne.equals("paper") && choiceTwo.equals("rock"))
        ) {
            System.out.println(playerOne + " wins!");
        } else if (
                (choiceTwo.equals("rock") && choiceOne.equals("scissors")) ||
                        (choiceTwo.equals("scissors") && choiceOne.equals("paper")) ||
                        (choiceTwo.equals("paper") && choiceOne.equals("rock"))
        ) {
            System.out.println(playerTwo + " wins!");
        } else {
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }

    }
}

