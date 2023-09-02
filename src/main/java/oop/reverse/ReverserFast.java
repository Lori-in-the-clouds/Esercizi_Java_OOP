package oop.reverse;

public class ReverserFast implements Reverser {
    @Override
    public String reverse(String string) {
        StringBuilder dst = new StringBuilder(string);
        return dst.reverse().toString();
    }
}
