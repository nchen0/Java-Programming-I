
public class Main {
    public static void main(String[] args) {
        // write testcode here
        // indexes:   0  1  2  3  4
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
    }

    public static int smallest(int[] array) {
       int infinity = Integer.MAX_VALUE;
       for (int a : array) {
           if (a < infinity) {
               infinity = a;
           }
       }
       return infinity;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestInt = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestInt) {
                return i;
            }
        }
        return -1;
    }

}
