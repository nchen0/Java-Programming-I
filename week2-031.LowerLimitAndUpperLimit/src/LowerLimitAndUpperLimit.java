
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First");
        int first = reader.nextInt();

        System.out.println("Second");
        int second = reader.nextInt();

        int i = first;
        while (i <= second) {
            System.out.println(i);
            i++;
        }
    }
}
