package cs121;

import java.util.ArrayList;
import java.util.List;

public class ClueList {

    private final List<WordleClue> clues = new ArrayList<>();

    public boolean allMatch(String word) {
        for (WordleClue clue : clues) {
            if (!clue.match(word)) {
                return false;
            }
        }
        return true;
    }

    public void add(String encodedClue) {
        try {
            WordleClue clue = ClueFactory.make(encodedClue);
            clues.add(clue);
        } catch (IllegalArgumentException iae) {
            System.err.printf("Illegal Clue: %s\n", encodedClue);
        }
    }

    public void addAll(ClueList moreClues) {
        clues.addAll(moreClues.clues);
    }

    public int size() {
        return clues.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < clues.size(); index++) {
            sb.append(clues.get(index).toString());
            if (index != (clues.size() - 1)) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
