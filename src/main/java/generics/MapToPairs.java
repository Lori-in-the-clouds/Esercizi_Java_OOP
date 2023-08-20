package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K,V>> dst = new ArrayList<>();
        for (Map.Entry entry : src.entrySet()) {
            Pair<K, V> tmp = (Pair<K, V>) new Pair<>(entry.getKey(),entry.getValue());
            dst.add(tmp);
        }
        return dst;
    }
}
