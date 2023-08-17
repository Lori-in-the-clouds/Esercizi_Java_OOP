package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {
    @Test
    public void removeFirstTwoChars() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoChars("Hello World!"));
       // assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("No"));
       // assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("Y"));
    }
}