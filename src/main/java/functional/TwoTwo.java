package functional;

import java.util.List;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums) {
       return nums.stream().map((Integer t1) -> t1*2).filter((Integer t1) -> !t1.toString().endsWith("2")).toList();
    }
}

