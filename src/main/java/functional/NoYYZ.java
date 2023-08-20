package functional;

import java.util.List;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream().map(NoYY::add_yy).filter((String t1)-> !t1.contains("yy")).peek((String t1)->
        {
            if (t1.startsWith("z")) System.out.println(t1);
        }).toList();

    }
    public static String add_yy (String string) {
        StringBuilder tmp = new StringBuilder(string);
        return tmp.append("y").toString();

    }
}
