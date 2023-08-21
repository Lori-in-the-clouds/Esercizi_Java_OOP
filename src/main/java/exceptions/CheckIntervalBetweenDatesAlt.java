package exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            LocalDate t1 = LocalDate.parse(begin);
            LocalDate t2 = LocalDate.parse(end);
            return t1.isBefore(t2);
        } catch (DateTimeException e) {
            return false;
        }
    }
}
