package generics;

import java.util.Iterator;
import java.util.List;

public class Append {
    public static <T> void append(List<T> dst, List<T> src) {
        for (T i : src) {
            dst.add(i);
        }
        return;
    }
}
