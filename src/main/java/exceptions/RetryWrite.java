package exceptions;

import java.io.IOException;

public class RetryWrite {
        public static void main(String[] args) {
            try {
                writeWithTries(3);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void writeWithTries(int maxTries) {
         int count = 0;
         while(true) {
             try {
                 write("Hello");
             } catch (IOException e) {
                 count++;
                 if (count == maxTries) {
                     throw new RuntimeException("Tre tentativi effettuati");
                 }
             }
         }

        }

        public static void write(String message) throws IOException {
            throw new IOException("Unable to send: " + message);
        }
}

