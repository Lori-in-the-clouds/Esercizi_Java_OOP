package arrays;

import java.util.Arrays;

public class CopyArray {
    public static double[] copyArray(double[] v) {
        double [] dst = Arrays.copyOf(v,v.length);
        return dst;
    }
}
