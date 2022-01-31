package cs121;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
This class wraps the reading of words.txt with a simple interface:
hasNextWord()/nextWord
 */
public class WordSource {
    private Scanner scanner;

    public WordSource() {
        try {
            scanner = new Scanner(
                    new File("words.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(-1);
        }
    }

    public boolean hasNextWord() {
        return scanner.hasNextLine();
    }

    public String nextWord() {
        return scanner.nextLine();
    }
}
