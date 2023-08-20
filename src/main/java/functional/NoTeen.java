package functional;

import java.util.List;
import java.util.stream.Stream;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
       return nums.stream().filter( (Integer t1) -> !(t1 >= 13 && t1 <= 19)).toList();
    }
}
