package cs121;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
This class wraps the reading of wordfreq.txt with a simple interface:
hasNextWord()/nextWord
 */

public class WordFreqSource {
    private Scanner scanner;
    private long lastWordFrequency = 20000000;
    final static private long frequencyThreshold = 80000;

    public WordFreqSource() {
        try {
            scanner = new Scanner(
                    new File("wordfreq.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(-1);
        }
    }

    public boolean hasNextWord() {
        return scanner.hasNextLine() &&
                lastWordFrequency > frequencyThreshold;
    }

    public String nextWord() {
        String line = scanner.nextLine();
        int tabIndex = line.indexOf('\t');

        try {
            String digits = line.substring(tabIndex+1);
            lastWordFrequency = Long.parseLong(digits);
        } catch (NumberFormatException nfe) {
            // ignore
        }

        return line.substring(0, tabIndex);
    }
}
