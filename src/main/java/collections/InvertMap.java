package collections;

import java.util.*;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
       /* List<String> values = new ArrayList<>(src.values());
        List<Integer> keys = new ArrayList<>(src.keySet());
        Map<String,Integer> dst = new HashMap<>();
        Iterator i1 = values.iterator();
        Iterator i2 = keys.iterator();
        while(i1.hasNext() && i2.hasNext()) {
            dst.put(i1.next().toString(),Integer.valueOf(i2.next().toString()));
        }
        return dst;*/
        Map<String,Integer> dst = new HashMap<>();
        for (Map.Entry<Integer,String> entry : src.entrySet()) {
            dst.put(entry.getValue(), entry.getKey());
        }
        return dst;
    }
}
