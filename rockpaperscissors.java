import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        String computer = choices[rand.nextInt(3)];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rock, paper, or scissors: ");
        String player = scanner.nextLine().toLowerCase();

        System.out.println("Computer chose " + computer);

        if (player.equals(computer)) {
            System.out.println("Tie!");
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                   (player.equals("paper") && computer.equals("rock")) ||
                   (player.equals("scissors") && computer.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        scanner.close();
    }
}