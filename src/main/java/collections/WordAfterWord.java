package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static String wordAfterWord(String filename, String word) throws IOException {
        List<String> book_lines = getLines("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        TreeSet<String> tmp = new TreeSet<>();
        for (String i : book_lines) {
            tmp.addAll(lineToWords(i));
        }
        Set<String> dst = tmp.tailSet(word,false);
        Iterator iterator = dst.iterator();
        return iterator.next().toString();
    }
}
