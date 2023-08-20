package functional;

import java.util.List;

public class NoYY {
    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(NoYY::add_yy).filter((String t1)-> !t1.contains("yy")).toList();
    }

    public static String add_yy (String string) {
        StringBuilder tmp = new StringBuilder(string);
        return tmp.append("y").toString();

    }
}
