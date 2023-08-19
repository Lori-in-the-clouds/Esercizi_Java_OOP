package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WorldFrequencySorted {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> dst = new HashMap<>();

        List<String> lines = getLines("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        for (String i : lines) {
            List<String> words = lineToWords(i);
            for (String j : words) {
                if ( dst.containsKey(j) ) {
                    int val = dst.get(j) + 1;
                    dst.put(j, val);
                } else {
                    dst.put(j, 1);
                }
            }
        }
        return dst;
    }

    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) throws IOException {
        Map<String, Integer> words = wordFrequency("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        List<Map.Entry<String, Integer>> tmp = new ArrayList<>(words.entrySet());
        Map<String, Integer> dst = new HashMap<>();
        tmp.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t1, Map.Entry<String, Integer> t2) {
                return t1.getValue() - t2.getValue();
            }
        });
        for (Map.Entry<String, Integer> i : tmp) {
            dst.put(i.getKey(), i.getValue());
        }
        return dst;
    }

    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) throws IOException {
        Map<String,Integer> words = wordFrequency("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        List<Map.Entry<String,Integer>> tmp = new ArrayList<>(words.entrySet());
        Map<String,Integer> dst = new HashMap<>();
        tmp.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t1, Map.Entry<String, Integer> t2) {
                return t2.getValue()-t1.getValue();
            }
        });
        for (Map.Entry<String,Integer> i : tmp) {
            dst.put(i.getKey(),i.getValue());
        }
        return dst;
    }
}
