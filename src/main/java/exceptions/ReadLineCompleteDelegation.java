package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        String dst = new String();
        try (BufferedReader filer = new BufferedReader(new FileReader(filename))){
            dst = filer.readLine();
        }
        return dst;
    }
}
