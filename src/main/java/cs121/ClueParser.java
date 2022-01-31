package cs121;

import java.util.StringTokenizer;

public class ClueParser {
    static ClueList parseClues(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        ClueList clues = new ClueList();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            clues.add(token);
        }
        System.out.printf("parsed %d clues:[%s]\n",
                clues.size(), clues);
        return clues;
    }
}
