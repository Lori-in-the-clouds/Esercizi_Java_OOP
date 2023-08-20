package functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
    public static long howManyLines(String filename, String subString) throws IOException {
        List<String> lines = getLines("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        return lines.stream().filter((String t1) -> t1.contains(subString)).count();
    }
    public static long howManyTimes(String filename, String word) throws IOException {
        long sum = 0;
        List<String> lines = getLines("C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt");
        List<List<String>> kk = new ArrayList<>();
        lines.stream().forEach((String t1) -> kk.add(lineToWords(t1)) );
        return  kk.stream().filter((List<String> t1) -> t1.contains(word)).count();
    }
}
