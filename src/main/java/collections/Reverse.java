package collections;

import java.util.*;

public class Reverse {
    public static List<String> reverse(List<String> sentence) {
        Deque<String> tmp = new ArrayDeque<>();
        List<String> dst = new ArrayList<>();
        for (Iterator iterator = sentence.listIterator(); iterator.hasNext();) {
            String insert = iterator.next().toString();
            tmp.addFirst(insert);
        }

        for (Iterator iterator = tmp.iterator(); iterator.hasNext();) {
            String insert = iterator.next().toString();
            dst.add(insert);
        }
        return dst;
    }
}
