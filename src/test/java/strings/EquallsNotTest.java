package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquallsNotTest {
    @Test
    void equalIsNot() {
        assertFalse(EquallsNot.equalIsNot("This is not"));
        assertTrue(EquallsNot.equalIsNot("This is notnot"));
        assertTrue(EquallsNot.equalIsNot("noisxxnotyynotxisi"));
    }
}