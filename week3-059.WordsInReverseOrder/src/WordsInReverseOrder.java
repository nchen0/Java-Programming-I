import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> reversed = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String response = reader.nextLine();

            if (response.isEmpty()) {
                break;
            }
            reversed.add(response);

        }
        Collections.reverse(reversed);
        System.out.println("You typed the following words: ");
        for (String word : reversed) {
            System.out.println(word);
        }
    }

}
