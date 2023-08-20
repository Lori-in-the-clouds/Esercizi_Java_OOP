package functional;

import java.util.List;

public class SquareFive {
    public static long squareFive(List<Integer> nums) {
      return nums.stream().map((Integer t1) -> (int)Math.pow(t1,2) +10).filter((Integer t1) -> !t1.toString().endsWith("5")).count();
    }
}
