package collections;

import java.util.StringTokenizer;

public class Measure {
    public static <T> T max(T[] array, Measurer<T> measurer) {
        T max = array[0];
        for (T i : array) {
            if (measurer.measure(i) > measurer.measure(max)) max = i;
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer) {
        T min = array[0];
        for (T i : array) {
            if (measurer.measure(i) < measurer.measure(min)) min = i;
        }
        return min;
    }
    public interface Measurer<T> {
        double measure(T item);
    }


}



