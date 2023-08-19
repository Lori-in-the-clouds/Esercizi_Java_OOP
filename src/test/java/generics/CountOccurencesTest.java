package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurencesTest {
    @Test
    void countOccurrences() {
        assertEquals(1, CountOccurences.countOccurrences(new Integer[]{1, 2, 3}, 3));
        assertEquals(3, CountOccurences.countOccurrences(new Integer[]{1, 2, 3, 3, 3}, 3));
        assertEquals(2, CountOccurences.countOccurrences(new Integer[]{null, 2, null}, null));
        assertEquals(1, CountOccurences.countOccurrences(new Integer[]{null, 2, null}, 2));
    }
}