
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String personA = reader.nextLine();
        System.out.println("Type your age: ");
        int ageA = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String personB = reader.nextLine();
        System.out.println("Type your age: ");
        int ageB = Integer.parseInt(reader.nextLine());

        System.out.println(personA + " and " + personB + " are " + (ageA + ageB) + " years old in total.");
        // Implement your program here
    }
}
