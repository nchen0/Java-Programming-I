
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int n;
        int count = 0;
        System.out.println("Guess a number: ");
        while ((n = reader.nextInt()) != numberDrawn) {
            count += 1;
            if (n > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else {
                System.out.println("The number is greater, guesses made: " + count);
            }
            System.out.println("Guess a number: ");
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
