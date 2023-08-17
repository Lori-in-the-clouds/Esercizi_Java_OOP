package strings;

public class Reverse {
    public static String reverse(String string) {
        StringBuilder dst = new StringBuilder();
        for (int i = string.length()-1;i>=0;i--) {
            dst.append(string.charAt(i));
        }
        return dst.toString();
    }
}
