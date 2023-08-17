package arrays;

import java.util.Arrays;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v) {
        int dst[] = new int[v.length];
        //Arrays.fill(dst,0);
        int index= 0;
        for(int i=0;i<v.length;i++) {
            if (v[i] != 0) {
                dst[index] = v[i];
                index++;
            }
        }
        return dst;
    }
}
