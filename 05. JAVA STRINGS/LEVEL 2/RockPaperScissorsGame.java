import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateWinStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[1][3];
        double playerWinPercentage = (playerWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player: " + playerWins + " Wins";
        stats[0][1] = "Computer: " + computerWins + " Wins";
        stats[0][2] = "Player Win %: " + String.format("%.2f", playerWinPercentage) + 
                      " | Computer Win %: " + String.format("%.2f", computerWinPercentage);

        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s\n", "Player", "Computer", "Winner");
        System.out.println("-----------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s | %-10s | %-10s\n", row[0], row[1], row[2]);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("\nWin Statistics:");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s | %-20s\n", stats[0][0], stats[0][1]);
        System.out.println(stats[0][2]);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int totalGames = scanner.nextInt();

        String[][] gameResults = new String[totalGames][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter Rock, Paper, or Scissors: ");
            String playerChoice = scanner.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] winStats = calculateWinStats(playerWins, computerWins, totalGames);
        displayResults(gameResults, winStats);

        scanner.close();
    }
}
