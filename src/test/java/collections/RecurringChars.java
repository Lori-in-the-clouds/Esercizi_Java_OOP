package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        Set<Character> dst = new HashSet<>();
        Set<Character> seen = new HashSet<>();
        for (int i = 0;i<string.length();i++) {
            if (!seen.contains(string.charAt(i))) {
                seen.add(string.charAt(i));
            } else {
                dst.add(string.charAt(i));
            }
        }
        return dst;
    }
}
