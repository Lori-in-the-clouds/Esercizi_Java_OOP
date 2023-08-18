package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> dst = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            dst.add(i);
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (Iterator<Integer> iterator = dst.iterator(); iterator.hasNext(); ) {
                int value = iterator.next();
                if ( value % i == 0 && value != i ) {
                    iterator.remove();
                }
            }
        }
        return dst;
    }
}

