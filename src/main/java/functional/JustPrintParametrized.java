package functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <T> void justPrintList(List<T> list, Consumer<T> counsumer) {
        list.forEach(counsumer);
    }

    public static <K,V> void justPrintMap(Map<K, V> map, BiConsumer<K,V> consumer) {
        map.forEach(consumer);
    }
}
