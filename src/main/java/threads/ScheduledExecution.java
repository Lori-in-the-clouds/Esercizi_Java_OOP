package threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ScheduledExecution {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(()-> System.out.println(LocalDateTime.now() + ": Hello!"),0,1, TimeUnit.SECONDS);
        //executor.schedule() CON QUESTO  METODO IL THREAD PARTE DOPO UN CERTO RITARDO
    }
}
