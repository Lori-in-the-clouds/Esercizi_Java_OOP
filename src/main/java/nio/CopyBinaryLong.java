package nio;

import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;

public class CopyBinaryLong {
    public static void copyBinaryLong(String src, String dst) {

        try (FileChannel t1 =  FileChannel.open(Paths.get(src), StandardOpenOption.READ);
            FileChannel t2 = FileChannel.open(Paths.get(dst), CREATE)) {
            ByteBuffer tmp = ByteBuffer.allocate(1024);
            while (t1.read(tmp) > 0) {
                tmp.flip();
                t2.write(tmp);
                tmp.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return;

    }
}
