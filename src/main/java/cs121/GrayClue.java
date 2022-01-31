package cs121;

public class GrayClue implements WordleClue {
    final private char letter;

    public GrayClue(char letter) {
        this.letter = Character.toLowerCase(letter);
    }

    public boolean match(String word) {
        return word.toLowerCase().indexOf(letter) == -1;
    }

    @Override
    public String toString() {
        return "B"+Character.toUpperCase(letter);
    }
}
