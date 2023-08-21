package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> dst = new ArrayList<>();
        for (List<String> list : lists) {
            boolean control = true;
            for (String i : list) {
                try {
                    CheckString.checkString(i);

                } catch (ParseException e) {
                    control = false;
                }
            }
            if (control) {
                dst.add(list);
            }
        }
        return dst;
    }
}
