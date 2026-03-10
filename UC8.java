import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Method to build and return the map of character patterns
    public static Map<Character, String[]> buildCharacterMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to display banner text
    public static void displayBanner(String text, Map<Character, String[]> map) {

        int rows = 5;  // height of characters

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = buildCharacterMap();

        String word = "OOPS";

        displayBanner(word, bannerMap);
    }
}