package arrays;

public class Splitter {
    public static int[] splitter(int input) {
        String string = Integer.toString(input);
        int[] dst = new int[string.length()];
        for (int i=0;i<string.length();i++) {
            char c = string.charAt(i);
            dst[i] = Integer.valueOf(string.charAt(i)-48);
        }
        return dst;
    }
}

