package nio;

import java.io.*;

public class CopyTextLong {
    public static void copyTextLong(String src, String dst) {
        try (BufferedReader sources = new BufferedReader(new FileReader(src)); BufferedWriter dest = new BufferedWriter(new FileWriter(dst))) {
            sources.lines().forEach(line -> {
                try {
                    dest.write(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
