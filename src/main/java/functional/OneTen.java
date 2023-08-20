package functional;

import java.util.List;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums) {
        return nums.stream().map((Integer t1) -> (t1+1)*10).toList();
    }
}
