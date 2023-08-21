package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        String dst = new String();
        try (BufferedReader filer = new BufferedReader(new FileReader(filename))){
            dst = filer.readLine();
        } catch (IOException e) {
            return null;
        }
        return dst;
    }

}
