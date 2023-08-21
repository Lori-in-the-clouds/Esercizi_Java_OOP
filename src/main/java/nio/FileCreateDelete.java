package nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCreateDelete {
    public static void createFile(String src) throws IOException {
        Files.createFile(Paths.get(src));
    }
    public static void deleteFile(String src) throws IOException {
        Files.deleteIfExists(Paths.get(src));
    }
}
