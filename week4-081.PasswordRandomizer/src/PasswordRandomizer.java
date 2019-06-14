import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        while (i < this.length) {
            Random num = new Random();
            int randomNum = num.nextInt(25) + 1;
            password += "abcdefghijklmnopqrstuvwxyz".charAt(randomNum);
            i++;
        }
        return password;
    }
}
