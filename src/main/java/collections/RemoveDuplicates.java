package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> tmp = new HashSet<>();
        for (Integer i : list) {
            tmp.add(i);
        }
        return tmp.stream().toList();
    }
}
