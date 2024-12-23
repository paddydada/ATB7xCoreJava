package StringProgram;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Hardcoded input for testing in Eclipse
        int n = 5;
        List<Player> players = new ArrayList<>();
        players.add(new Player("amy", 100));
        players.add(new Player("david", 100));
        players.add(new Player("heraldo", 50));
        players.add(new Player("aakansha", 75));
        players.add(new Player("aleksa", 150));

        // Sort players using a custom comparator
        players.sort((p1, p2) -> {
            if (p1.score != p2.score) {
                return Integer.compare(p2.score, p1.score); // Descending order of scores
            }
            return p1.name.compareTo(p2.name); // Ascending order of names
        });

        // Output the sorted players
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
