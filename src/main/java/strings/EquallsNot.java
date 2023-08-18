package strings;

public class EquallsNot {
    public static boolean equalIsNot(String string) {
        int count_is = 0;
        int count_not = 0;
        int index;
        String tmp1 = string;
        String tmp2 = string;
        while((index = tmp1.indexOf("is")) >= 0) {
            count_is++;
            tmp1 = tmp1.substring(index+2);
        }
        while((index =tmp2.indexOf("not")) >= 0) {
            count_not++;
            tmp2 = tmp2.substring(index+3);
        }
        if (count_not == count_is) return true;
        else return false;
    }

    public static void main(String[] args) {
        boolean control = equalIsNot("This is notnot");
    }
}
