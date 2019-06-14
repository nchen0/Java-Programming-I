public class Counter {
    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter += 1;
    }

    public void decrease() {
        if (!this.check || this.value() >= 1) {
            this.counter -= 1;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (!this.check || this.value() >= decreaseAmount) {
                this.counter -= decreaseAmount;
            } else if(this.value() <= decreaseAmount) {
                this.counter = 0;
            }
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }
}
