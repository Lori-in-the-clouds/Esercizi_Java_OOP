package arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] dst = new String[end-start];
        int index = 0;
        for(int i = start; i<end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                dst[index]="FizzBuzz";
            }
            else if (i % 3 == 0) {
                dst[index]="Fizz";
            }
            else if (i % 5 == 0) {
                dst[index]="Buzz";
            }
            else {
                dst[index] = Integer.toString(i);
            }
            index++;
        }
        return dst;
    }
}
