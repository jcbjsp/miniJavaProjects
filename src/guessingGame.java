import java.util.Random;
import java.util.Scanner;
public class guessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println(randomNumber);
        int lives = 6;
        System.out.println("Enter a guess between 1 - 100");
        while (gameContinue && lives != 0) {
            System.out.println("Enter a guess: ");
            int guess = scan.nextInt();
            if (guess > 100) {
                System.out.println("You're an idiot!");
            }
             else if (guess < randomNumber) {
                lives--;
                System.out.println("Guess higher! You have " + lives + " lives remaining");
            } else if (guess > randomNumber) {
                lives--;
                System.out.println("Guess lower! You have " + lives + " lives remaining");
            } else {
                System.out.println("You've guessed right! Now touch grace");
                gameContinue = false;
            }
        }
        if (lives == 0) {
            System.out.println("Do better");
        }
    }
}
