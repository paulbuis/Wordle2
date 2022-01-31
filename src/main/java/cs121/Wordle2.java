package cs121;


public class Wordle2 {

    public static void outputLikelyWords(ClueList clues) {
        System.out.printf("Using clues: [%s]\n", clues);
        int count = 0;
        WordSource source = new WordSource();
        while (source.hasNextWord()) {
            String word = source.nextWord();

            if (clues.allMatch(word)) {
                count++;
                System.out.printf("%2d: %s\n", count, word);

                if (count == 10) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ClueList clues = ClueParser.parseClues("BA YL2 GO3 YN4 BE");
        outputLikelyWords(clues);
        long stopTime = System.nanoTime();
        System.out.printf("%.1f milliseconds\n", (stopTime-startTime)*1e-6);
        System.out.println();

        ClueList clues1 = ClueParser.parseClues("BB BU BT YO1 YN5");
        clues.addAll(clues1);
        outputLikelyWords(clues);
        System.out.println();

        ClueList clues2 = ClueParser.parseClues("YN3 YO2");
        clues.addAll(clues2);
        outputLikelyWords(clues);
    }
}

