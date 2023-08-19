package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String,Integer> dst = new HashMap<>();

        List<String> lines = getLines("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        for (String i : lines) {
            List<String> words = lineToWords(i);
            for (String j: words) {
                if (dst.containsKey(j)) {
                    int val = dst.get(j)+1;
                    dst.put(j,val);
                } else {
                    dst.put(j,1);
                }
            }
        }
        return dst;
    }
}
