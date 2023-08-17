package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        StringBuilder dst = new StringBuilder();
        if (string.length()<=2) return "";
        for (int i =2;i<string.length();i++) {
            dst.append(string.charAt(i));
        }
        return dst.toString();
    }
}
