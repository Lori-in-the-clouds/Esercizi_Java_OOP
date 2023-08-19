package generics;

import java.util.Iterator;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder dst = new StringBuilder();
        for (Iterator iterator = src.iterator(); iterator.hasNext();) {
            dst.append(iterator.next().toString());
            dst.append(", ");
        }
        return dst.toString();
    }
}
