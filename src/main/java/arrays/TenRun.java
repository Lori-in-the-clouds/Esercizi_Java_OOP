package arrays;

public class TenRun {
    public static int[] tenRun(int[] v) {
        int dst[] = new int[v.length];
        boolean control = false;

        for (int i=0;i<v.length;i++) {

            while (v[i] % 10 == 0) {
                int val = v[i];
                control = true;
                do {
                    dst[i] = val;
                    i++;
                    if (i == v.length) return dst;
                } while (v[i] % 10 != 0);
            }
            dst[i] = v[i];
        }
        return dst;
    }
}
