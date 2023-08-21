package exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2) throw new ParseException(s,0);
        int index = 0;
        for (Character c : s.toCharArray()) {
            if (index % 2 == 0) {
                if (!Character.isLetter(c)) throw new ParseException(s,index);
            } else {
                if (!Character.isDigit(c)) throw new ParseException(s,index);
            }
            index++;
        }

    }
}
