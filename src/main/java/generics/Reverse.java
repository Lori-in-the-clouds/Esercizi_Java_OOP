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

    public static void main(String[] args) {
        List<Integer> prova = new ArrayList<>();
        prova.add(1);
        prova.add(2);
        prova.add(3);
        prova.add(4);
        prova.add(5);
        reverse(prova);
    }
}
