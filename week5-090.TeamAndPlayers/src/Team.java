import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player name) {
        if (players.size() < maxSize) {
            players.add(name);
        }
    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int total = 0;
        for (Player p : players) {
            total += p.goals();
        }
        return total;
    }
}
