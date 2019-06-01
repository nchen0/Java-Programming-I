import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int factorial = reader.nextInt();
        int total = 1;
        int i = 1;
        while (i <= factorial) {
            total *= i;
            i += 1;
        }
        System.out.println("Factorial is " + total);
    }
}
