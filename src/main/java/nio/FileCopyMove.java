package nio;

import java.io.*;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMove {
    public static void fileCopy(String src, String dst) throws IOException {
        Files.copy(Paths.get(src),Paths.get(dst), StandardCopyOption.REPLACE_EXISTING);
    }
    public static void fileMove(String src, String dst) throws IOException {
        Files.move(Paths.get(src),Paths.get(dst),StandardCopyOption.REPLACE_EXISTING);
    }
}
