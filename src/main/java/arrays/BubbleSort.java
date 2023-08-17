package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v) {
        boolean cambio = false;
        do {
            cambio = false;
            for (int i = 0; i < v.length - 1; i++) {
                if ( v[i] > v[i + 1] ) {
                    cambio = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        } while (cambio);
    }


    public static int[] bubbleSortCopy(int[] v) {
        bubbleSort(v);
        int[] dst = Arrays.copyOf(v,v.length);
        return dst;
    }
}
