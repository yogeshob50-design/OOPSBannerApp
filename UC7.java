/**
 * BannerAppUC7
 * Displays the word OOPS using character patterns stored in an inner class.
 */
public class UC7 {

    /**
     * Inner static class to store a character and its banner pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character the letter
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns
    static String[] getOPattern() {
        return new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        };
    }

    static String[] getPPattern() {
        return new String[]{
                "***** ",
                "*   * ",
                "*   * ",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    static String[] getSPattern() {
        return new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                "***** "
        };
    }

    public static void main(String[] args) {

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        String word = "OOPS";

        // Build banner line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap map : letters) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]);
                    }
                }
            }

            System.out.println(line);
        }
    }
}