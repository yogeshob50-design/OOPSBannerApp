public class UC6 {

    // Helper method for O
    static String[] getOPattern() {
        return new String[]{
            String.join("", " ***  "),
            String.join("", "*   * "),
            String.join("", "*   * "),
            String.join("", "*   * "),
            String.join("", "*   * "),
            String.join("", "*   * "),
            String.join("", " ***  ")
        };
    }

    // Helper method for P
    static String[] getPPattern() {
        return new String[]{
            String.join("", "***** "),
            String.join("", "*   * "),
            String.join("", "*   * "),
            String.join("", "***** "),
            String.join("", "*     "),
            String.join("", "*     "),
            String.join("", "*     ")
        };
    }

    // Helper method for S
    static String[] getSPattern() {
        return new String[]{
            String.join("", " *****"),
            String.join("", "*     "),
            String.join("", "*     "),
            String.join("", " **** "),
            String.join("", "     *"),
            String.join("", "     *"),
            String.join("", "***** ")
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build OOPS banner using methods
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + o[i] + p[i] + s[i];
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}