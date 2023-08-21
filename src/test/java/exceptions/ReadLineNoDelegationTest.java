package exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineNoDelegationTest {
    @Test
    void noDelegation() {

        assertNull(ReadLineNoDelegation.readLineNoDelegation("/tmp/missing"));
    }
}