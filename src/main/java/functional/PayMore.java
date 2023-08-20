package functional;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        fees.replaceAll((String t1,Double t2) ->  t1.startsWith(numberFamily) ? t2 + costDelta : t2);
    }
}
