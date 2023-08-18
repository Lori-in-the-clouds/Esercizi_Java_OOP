package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SpeedTest {
    public static long insertBeginning(List<String> list, String item, int times) {
      long start = System.nanoTime();
      for (int i = 0;i<times;i++) {
          list.add(0,item);
      }
      long finish = System.nanoTime();
      return finish-start;
    }
    public static long insertEnd(List<String> list, String item, int times) {
        long start = System.nanoTime();
        for (int i = 0;i<times;i++) {
            list.add(item);
        }
        long finish = System.nanoTime();
        return finish-start;
    }
}
