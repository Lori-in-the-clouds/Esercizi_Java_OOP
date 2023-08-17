package arrays;

import java.util.Arrays;

public class SearchArray {

    public static boolean containsBruteForce(String[] strings, String searched) {
        for (String st : strings) {
            if (st.equals(searched)) return true;
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched) {
        Arrays.sort(strings);
        int result  = Arrays.binarySearch(strings,searched);
        if (result < 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        String[] st = new String[]{"world","bike"};
        containsBinary(st,"bike");
    }
}
