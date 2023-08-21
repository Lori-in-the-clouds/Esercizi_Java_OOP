package nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class FileList {
    public static Set<String> fileList(String src) throws IOException {
        return Files.walk(Paths.get(src))
                .filter(t -> !Files.isDirectory(t))
                .map(Path::getFileName).map(Path::toString)
                .collect(Collectors.toSet());
    }
}
