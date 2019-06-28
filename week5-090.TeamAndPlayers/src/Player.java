public class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this.name = name;
        this.goals = 0;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    public String toString() {
        return "Player: " + name + ", goals " + goals;
    }
}
