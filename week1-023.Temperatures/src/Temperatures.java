
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        while (true) {
            System.out.println("Add a temperature");
            double temp = Double.parseDouble(reader.nextLine());

            if (temp < 40 && temp > -30) {
                Graph.addNumber(temp);
            }
        }
        // Remove or comment out these lines above before trying to run the tests.
    }
}
