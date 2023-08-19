package generics;

import java.util.List;

public class AppendBounded {
    public static <T> void Append (List<T> dst, List<? extends T> src) {
        dst.addAll(src);
    }
}
