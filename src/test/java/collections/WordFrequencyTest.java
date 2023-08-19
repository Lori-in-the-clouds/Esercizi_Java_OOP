package collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {
    final String filename = "C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt";

    @Test
    void wordFrequency() throws IOException {
        assertEquals(1, WordFrequency.wordFrequency(filename).get("zulu"));
        assertEquals(2, WordFrequency.wordFrequency(filename).get("velocipedes"));
        assertEquals(3, WordFrequency.wordFrequency(filename).get("bachelor"));
    }
}