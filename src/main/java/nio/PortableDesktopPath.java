package nio;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;

public class PortableDesktopPath {
    public static String portableDesktopPath() {
        FileSystemView view = FileSystemView.getFileSystemView();
        File file = view.getHomeDirectory();
        return file.getPath();
    }
}
