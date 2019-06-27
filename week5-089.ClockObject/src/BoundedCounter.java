public class BoundedCounter {
    private int value;
    private int upperBound;

    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.upperBound = upperBound;
    }

    public void next() {
        if (this.value + 1 > this.upperBound) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0 && value <= this.upperBound) {
            this.value = value;
        }
    }
}