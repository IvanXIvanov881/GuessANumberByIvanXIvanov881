import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerRandon = randomNumber.nextInt(100);

        int counter = 0;

        System.out.println("You are allowed 7 attempts to Guess a number between 0-100.\n Good luck!\n");

        while (true) {

            if (counter == 7) {

                System.out.println("\nComputer Win!");
                System.out.printf("Computer number: %d",computerRandon);
                break;
            }

            System.out.println("Guess a number (0-100): ");

            String playerInput = scanner.next();

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                }
            }

            if (!isValid) {
                System.out.println("Invalid input.. Try again!");
            }

            if (isValid) {
                int playerNumber = Integer.parseInt(playerInput);

                if (playerNumber == computerRandon) {
                    System.out.println("You Win!");
                    break;
                } else if (playerNumber < computerRandon) {
                    System.out.println("Too low!");
                } else if (playerNumber > computerRandon) {
                    System.out.println("Too high!");
                }

                counter++;
            }

        }

    }
}
