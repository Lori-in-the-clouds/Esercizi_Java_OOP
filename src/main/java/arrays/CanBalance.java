package arrays;

public class CanBalance {
    public static boolean canBalance(int[] v) {

        if (v.length == 0) return false;

        for (int i =0;i<v.length;i++) {
            int sum1=0;
            int sum2=0;

            for (int k1 = 0;k1 <= i;k1++) {
                sum1+=v[k1];
            }
            for (int k2 = i+1;k2<v.length;k2++) {
                sum2+=v[k2];
            }

            if (sum1 == sum2) return true;
        }
        return false;
    }
}
