package collections;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T max  = list.get(0);
        for (T i : list) {
           if (cmp.compare(i,max) > 0) {
               max = i;
           }
        }
        return max;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T min = list.get(0);
        for (T i : list) {
            if (cmp.compare(i,min) < 0) {
                min = i;
            }
        }
        return min;
    }
}

