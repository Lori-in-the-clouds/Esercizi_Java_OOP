package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTestTest {
    final int times = 2000;

    @Test
    void insertBeginning() {
        List<String> a1 = new ArrayList<>();
        List<String> a2 = new LinkedList<>();
        long t1 = SpeedTest.insertBeginning(a1,"0",times);
        long t2 = SpeedTest.insertBeginning(a2,"0",times);
        assertTrue(t2<t1);
    }

    @Test
    void insertEnd() {
        List<String> a1 = new ArrayList<>();
        List<String> a2 = new LinkedList<>();
        long t1 = SpeedTest.insertEnd(a1,"0",times);
        long t2 = SpeedTest.insertEnd(a2,"0",times);
        assertTrue(t2>t1);
    }
}