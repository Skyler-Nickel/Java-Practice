// Example provided in chapter 10
// A class for storing one voter's preferences.

import java.util.*;

public class Ballot implements Comparable<Ballot> {
    private ArrayList<String> preferences;

    // constructs a ballot with candidate names in order
    public Ballot(String[] names) {
        preferences = new ArrayList<>();
        for (String next: names) {
            preferences.add(next);
        }
    }

    // returns the current first choice for this ballot
    public String getCandidate() {
        return preferences.get(0);
    }

    // eliminates the given candidate from consideration
    public void eliminate(String name) {
        preferences.remove(name);
    }

    // compares this ballot to another in order
    public int compareTo(Ballot other) {
        return getCandidate().compareTo(other.getCandidate());
    }
}
