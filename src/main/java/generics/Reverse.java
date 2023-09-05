package generics;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list) {
        for (int i = 0; i<list.size();i++)  {
            list.add(list.size(),list.get(0));
            list.remove(0);
        }

    }
}
