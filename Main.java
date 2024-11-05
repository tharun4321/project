import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = 100; // Target score to win
        int score1 = 0; // Score for Player 1
        int score2 = 0; // Score for Player 2
        Random random = new Random();

        while (score1 < target && score2 < target) {
            // Player 1's turn
            int rollCount1 = 0;
            while (true) {
                int roll = random.nextInt(6) + 1;
                System.out.println("Player 1 rolls: " + roll);
                if (roll == 6) {
                    rollCount1++;
                    if (rollCount1 == 3) {
                        System.out.println("Player 1 rolled three 6s in a row, extra rolls not counted!");
                        break; // Stop giving extra turns after three 6s
                    }
                } else {
                    rollCount1 = 0; // Reset the count if a number other than 6 is rolled
                }
                score1 += roll;
                if (roll != 6 || score1 >= target) break; // Stop rolling if no extra roll or target reached
            }
            
            // Check if Player 1 won
            if (score1 >= target) {
                System.out.println("Player 1 wins with a score of " + score1);
                System.out.println("Player 2's score: " + score2);
                break;
            }

            // Player 2's turn
            int rollCount2 = 0;
            while (true) {
                int roll = random.nextInt(6) + 1;
                System.out.println("Player 2 rolls: " + roll);
                if (roll == 6) {
                    rollCount2++;
                    if (rollCount2 == 3) {
                        System.out.println("Player 2 rolled three 6s in a row, extra rolls not counted!");
                        break; // Stop giving extra turns after three 6s
                    }
                } else {
                    rollCount2 = 0; // Reset the count if a number other than 6 is rolled
                }
                score2 += roll;
                if (roll != 6 || score2 >= target) break; // Stop rolling if no extra roll or target reached
            }
            
            // Check if Player 2 won
            if (score2 >= target) {
                System.out.println("Player 2 wins with a score of " + score2);
                System.out.println("Player 1's score: " + score1);
                break;
            }
            in.close();
        }
    }
}
