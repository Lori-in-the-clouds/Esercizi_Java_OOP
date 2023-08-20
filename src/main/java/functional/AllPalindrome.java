package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.zip.CheckedOutputStream;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
      /* return strings.stream().allMatch(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                StringBuilder tmp = new StringBuilder(s);
                if (tmp.reverse().toString().equals(s)) return true;
                return false;
           }
        });*/
        return strings.stream().allMatch(AllPalindrome::test);
    }
    public static boolean test(String s) {
        StringBuilder tmp = new StringBuilder(s);
        if (tmp.reverse().toString().equals(s)) return true;
        return false;
    }
}

