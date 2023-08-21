package exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws  RuntimeException{
            LocalDate t1 = LocalDate.parse(begin);
            LocalDate t2 = LocalDate.parse(end);
            return t1.isBefore(t2);

    }
}
