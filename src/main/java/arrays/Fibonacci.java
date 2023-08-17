package arrays;

public class Fibonacci {
    public static int rec(int n) {
      if (n==0) return 0;
      if (n==1) return 1;
      return rec(n-1) + rec(n-2);
    }
    public static long[] fibonacci(int n) {
        long[] dst = new long[n];
        for (int i=0;i<n;i++) {
            dst[i]=rec(i);
        }
        return dst;
    }
}
