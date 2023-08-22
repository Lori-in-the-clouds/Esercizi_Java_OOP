package threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " started");
        while(!interrupted()) {
            LocalDate start = LocalDate.now();

            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (LocalDate.now().getDayOfMonth() != start.getDayOfMonth()) {
                start = LocalDate.now();
                System.out.println("Day is changed:"+start);
            }
        }
        System.out.println(getName()+"terminated");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new DayChangeCheck();
        t1.start();
    }

}
