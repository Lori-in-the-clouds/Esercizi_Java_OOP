package strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string) {
        Scanner tmp = new Scanner(string);
        int counter = 0;
        while(tmp.hasNext()) {
           String current = tmp.next();
           if (current.charAt(current.length()-1)=='z' || current.charAt(current.length()-1)=='y' ||  current.charAt(current.length()-1)=='Z' ||  current.charAt(current.length()-1)=='Y') {
                counter++;
           }
        }
        return counter;
    }
}
