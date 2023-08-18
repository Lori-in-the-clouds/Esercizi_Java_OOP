package collections;

import java.util.*;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
      /*
        for (Iterator<String> t1 = map.keySet().iterator();t1.hasNext();) {
               String tmp1 = t1.next().toString();
            for (Iterator<String> t2 = map.values().iterator();t2.hasNext();) {
                String tmp2 = t2.next().toString();
                if (tmp1.equals(tmp2)) return true;
            }
        }
        return false;
    }*/
        Set<String> intersection = new HashSet<>(map.keySet());
        //retainAll conserva solo i valori in comune con la collection passata come parametro
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();

    }
}
