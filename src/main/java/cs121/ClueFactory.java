package cs121;

public class ClueFactory {
    static WordleClue make(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s must be non-null");
        }
        if (s.length() < 2) {
            throw new IllegalArgumentException(
                    String.format("s='%s', length=%d, must have length at least 2",
                            s, s.length())
                    );
        }
        char clueType = s.charAt(0);
        char guessLetter = Character.toLowerCase(s.charAt(1));
        if ((guessLetter < 'a') || (guessLetter > 'z')) {
            throw new IllegalArgumentException(
                    String.format("s=%s, second char must be an English letter",
                            s));
        }
        char positionChar;
        switch (Character.toUpperCase(clueType)) {
            case 'G':
                positionChar = s.charAt(2);
                return new GreenClue(guessLetter, positionChar-'0');
            case 'Y':
                positionChar = s.charAt(2);
                return new YellowClue(guessLetter, positionChar-'0');
            case 'B': // "black"
                return new GrayClue(guessLetter);
            default:
                throw new IllegalArgumentException(
                        String.format("s=%s, must start with G, Y, or B", s)
                );
        }
    }
}
