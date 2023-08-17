package arrays;

import java.util.Arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
       double[] dst = new double[v.length];
       for (int i =0; i <v.length;i++) {
           dst[i]= v[i] / factor;
       }
       return dst;
    }
}
