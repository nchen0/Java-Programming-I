
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        // Implement your program here. Remember to ask the input from user
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers: " + (a + b));
    }
}
