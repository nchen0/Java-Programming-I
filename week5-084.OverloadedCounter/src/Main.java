public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter first = new Counter(2, true);
        Counter second = new Counter(false);

        first.decrease(4);
        System.out.println(first.value());
    }
}
