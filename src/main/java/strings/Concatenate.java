package strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder dst = new StringBuilder();
        for (String st : strings) {
            dst.append(st);
        }
        return dst.toString();
    }
}
