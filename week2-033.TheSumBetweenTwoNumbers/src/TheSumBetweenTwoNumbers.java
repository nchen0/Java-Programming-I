
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First number: ");
        int first = reader.nextInt();

        System.out.println("Second number: ");
        int second = reader.nextInt();

        int i = first;
        int sum = 0;
        while (i <= second) {
            sum += i;
            i++;
        }
        System.out.println("The sum " + sum);
    }
}
