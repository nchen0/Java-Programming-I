import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString.substring(1, arrayString.length() - 1));
    }
}
