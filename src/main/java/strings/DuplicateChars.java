package strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string) {
        StringBuilder seen = new StringBuilder();
        StringBuilder dst = new StringBuilder();
        if (string.length()<2) return string.toCharArray();

        for (int i = 0; i < string.length() - 1; i++) {
            String tmp = string.substring(i + 1);
            if ( tmp.contains(String.valueOf(string.charAt(i))) && !seen.toString().contains(String.valueOf(string.charAt(i))) ) {
                dst.append(string.charAt(i));
                seen.append(string.charAt(i));
            }
        }
        char[] result = dst.toString().toCharArray();
        Arrays.sort(result);
        return result;

    }
    public static void main(String[] args) {
        char[] ris = duplicateChars("whistleblower");
    }
}
