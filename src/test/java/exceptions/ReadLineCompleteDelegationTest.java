package exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineCompleteDelegationTest {
    @Test
    void readLineCompleteDelegationTest() {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("/tmp/missing"));
    }
}