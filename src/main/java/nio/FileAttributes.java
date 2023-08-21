package nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributes {
    public static boolean exists(String filename) {
        File file = new File(filename);
        return file.exists();
    }
    public static boolean isReadable(String filename) {
        File file = new File(filename);
        return file.canRead();
    }
    public static boolean isWritable(String filename) {
        File file = new File(filename);
        return file.canWrite();
    }
    public static boolean isExecutable(String filename) {
        File file = new File(filename);
        return file.canExecute();
    }
    public static boolean isRegularFile(String filename) {
        File file = new File(filename);
        return file.isFile();
    }
    public static boolean isDirectory(String filename) {
        File file = new File(filename);
        return file.isDirectory();
    }
    public static long size(String filename) throws IOException {
        File file = new File(filename);
        return file.length();
    }

}
