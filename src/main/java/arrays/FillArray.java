package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] dst = new double[size];
        Arrays.fill(dst, value);
        if ( addNoise ) {
            Random random = new Random();
            dst = random.doubles(size,value - (5 / 100.0 * (double)value), value + (5 / 100.0 * (double)value)).toArray();

        }
        return dst;
    }
}
