package collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> dst = new HashSet<>();
        for (Integer i : first) {
            if (second.contains(i)) {
                dst.add(i);
            }
        }
        return dst;
    }
}
