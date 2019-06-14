import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()

        int i = 0;
        while (i < 7) {
            Random num = new Random();
            int drawn = num.nextInt(39) + 1;
            if (!this.containsNumber(drawn)) {
                this.numbers.add(drawn);
                i++;
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (!this.numbers.contains(number)) {
            return false;
        }
        return true;
    }
}
