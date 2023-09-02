package oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String string) {
        char[] tmp = new char[string.length()];
        for (int i =0; i<string.length();i++) {
            tmp[i]=string.charAt(string.length()-1-i);
        }
        return String.valueOf(tmp);
    }
}
