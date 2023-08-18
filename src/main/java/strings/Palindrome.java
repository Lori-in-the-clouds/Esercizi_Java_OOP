package strings;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        StringBuilder tmp = new StringBuilder(string);
        if (string.equals(tmp.reverse().toString())) return true;
        else return false;
    }
}
