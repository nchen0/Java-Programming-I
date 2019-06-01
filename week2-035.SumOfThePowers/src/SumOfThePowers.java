
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = reader.nextInt();

        System.out.println((int)(Math.pow(2, n+1)) - 1);

    }
}
