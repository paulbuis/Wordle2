package cs121;

public class GreenClue implements WordleClue {
    final private char letter;
    final private int index;

    public GreenClue(char letter, int position) {
        if (position < 1 || position > 5) {
            throw new IllegalArgumentException(
                    String.format("position=%d, must be between 0 and 5", position)
            );
        }

        this.letter = Character.toLowerCase(letter);
        index = position - 1;
    }

    public boolean match(String word) {
        if (word.length() <= index) {
            return false;
        }
        return letter == Character.toLowerCase(word.charAt(index));
    }

    @Override
    public String toString() {
        return String.format("G%s%1d", Character.toUpperCase(letter), index+1);
    }
}
