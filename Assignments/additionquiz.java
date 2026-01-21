import java.util.Random;
import java.util.Scanner;

public class additionquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int attempts = 3; // user gets 3 tries

        for (int i = 1; i <= attempts; i++) {
            // generate random numbers between 1 and 20
            int num1 = rand.nextInt(20) + 1;
            int num2 = rand.nextInt(20) + 1;
            int num3 = rand.nextInt(20) + 1;

            System.out.println("Attempt " + i + " of " + attempts);
            System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");

            int answer = input.nextInt();
            int correctSum = num1 + num2 + num3;

            if (answer == correctSum) {
                System.out.println(" Correct! You win!");
                break; // stop loop if answer is correct
            } else {
                System.out.println("Incorrect. Try again.");
            }

            // If it's the last attempt and still wrong
            if (i == attempts) {
                System.out.println("No more attempts left! The correct answer was " + correctSum);
            }
        }

        input.close(); 
    }
}
