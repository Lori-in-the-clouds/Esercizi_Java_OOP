package collections;

import java.util.HashMap;
import java.util.Map;

public class CodiceMorse {
    public static String morseCode(String string) throws IllegalAccessException {
        String tmp = string.toLowerCase();
        StringBuilder dst = new StringBuilder();
        Map<Character,String> codice = new HashMap<>();
        codice.put('a',"._");
        codice.put('b',"_...");
        codice.put('c',"_._.");
        codice.put('d',"_..");
        codice.put('e',".");
        codice.put('f',".._.");
        codice.put('g',"__.");
        codice.put('h',"....");
        codice.put('i',"..");
        codice.put('j',".___");
        codice.put('k',"_._");
        codice.put('l',"._..");
        codice.put('m',"__");
        codice.put('n',"_.");
        codice.put('o',"___");
        codice.put('p',".__.");
        codice.put('q',"__._");
        codice.put('r',"._.");
        codice.put('s',"...");
        codice.put('t',"_");
        codice.put('u',".._");
        codice.put('v',"..._");
        codice.put('w',".__");
        codice.put('x',"_.._");
        codice.put('y',"_.__");
        codice.put('z',"__..");

        for (int i = 0; i<tmp.length();i++) {
            if (!codice.containsKey(tmp.charAt(i))) {
                throw new IllegalArgumentException("String contains unsupported char");
            } else {
                dst.append(codice.get(tmp.charAt(i)));
                dst.append(" ");
            }
        }
        return dst.toString().trim();
    }
}
