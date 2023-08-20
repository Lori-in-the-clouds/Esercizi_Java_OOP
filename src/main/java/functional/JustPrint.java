package functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach((T tmp) -> {System.out.println("Hello "+ tmp.toString()+"!");} );
    }
    public static <K,V> void justPrintMap(Map<K, V> map) {
        map.forEach((K key,V value) -> {System.out.println("k:"+key.toString()+", v:"+value.toString());});
    }
}
