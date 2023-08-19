package generics;

public class CountOccurences {
    public static <T> int countOccurrences(T[] src, T item) {
        int occurence = 0;
        for (T i : src) {
            if (item == null) {
                if (i == null) occurence++;
            }
            else if (i != null && i.equals(item)) occurence++;
        }
        return occurence;
    }
}
