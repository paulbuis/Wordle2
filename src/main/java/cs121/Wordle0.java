package cs121;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
This program reads "wordfreq.txt" and outputs "words.txt"
which includes only common 5-letter words (from most common to least common).
 */
public class Wordle0 {
    public static void main(String[] args) {
        WordFreqSource source = new WordFreqSource();
        PrintStream output = null;
        try {
            output = new PrintStream(new File("words.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        while (source.hasNextWord()) {
            String word = source.nextWord();
            if (word.length() != 5) {
                continue;
            }
            output.println(word);
        }
    }
}
