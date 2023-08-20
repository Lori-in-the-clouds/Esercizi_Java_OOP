package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureTest {
    @Test
    void max() {
        Measure.Measurer<String> measurer = new Measure.Measurer<>() {
            @Override
            public double measure(String item) {
                return item.length();
            }
        };
        assertEquals("hard disk", Measure.max(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
        assertEquals("cpu", Measure.min(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
    }
}