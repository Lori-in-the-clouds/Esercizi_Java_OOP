package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> dst = new ArrayList<>();
        for (String i : strings) {
          try {
              CheckString.checkString(i);
              dst.add(i);

          } catch (ParseException e) {
          }
        }
        return dst;
    }
}
