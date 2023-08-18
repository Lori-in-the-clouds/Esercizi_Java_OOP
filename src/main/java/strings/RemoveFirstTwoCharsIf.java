package strings;

public class RemoveFirstTwoCharsIf {

    public static String removeFirstTwoCharsIf(String string) {
        StringBuilder dst = new StringBuilder();
        if (string.length() >0 && string.charAt(0)=='H') dst.append('H');
        if (string.length() > 1 && string.charAt(1)=='e') dst.append('e');
        for(int i=2;i<string.length();i++) {
            dst.append(string.charAt(i));
        }
        return dst.toString();
    }
}
