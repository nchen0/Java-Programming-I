import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        Boolean correct = false;
        while (correct == false) {
            System.out.println("Type a word: ");
            String response = reader.nextLine();
            if (response.equals("")) {
                correct = true;
            } else {
                words.add(response);
            }
        }
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
