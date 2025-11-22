import java.util.Scanner;

public class PRODIGY_SD_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = (int)(Math.random() * 100) + 1;  
        int guess = 0;
        int attempts = 0;
        System.out.println("Guess the number (1 to 100):");
        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high! Try again.");
            } 
            else if (guess < target) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }
    }
}