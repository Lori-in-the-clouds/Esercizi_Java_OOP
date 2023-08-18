package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodiceMorseTest {
    @Test
    void morseCode() throws IllegalAccessException {
        assertEquals(".... . ._.. ._.. ___", CodiceMorse.morseCode("Hello"));
        assertEquals(".__ ___ ._. ._.. _..", CodiceMorse.morseCode("world"));
        assertEquals("", CodiceMorse.morseCode(""));
        assertThrows(IllegalArgumentException.class, () -> CodiceMorse.morseCode("w0rld"));
    }
}