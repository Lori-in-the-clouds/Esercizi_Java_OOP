package threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor extends Thread {
    final static int NUM_THREADS = 4;
    final static int MAX_TASKS = 8;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i =0;i<MAX_TASKS;i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println("START thread="+Thread.currentThread().getName()+" task="+task);
                long random = (long)(Math.random()*1000);
                long start = System.nanoTime();
                try {
                    sleep(random);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                long finish = System.nanoTime();
                System.out.println("STOP thread="+Thread.currentThread().getName()+" task="+task+" t="+ TimeUnit.NANOSECONDS.toMillis(finish-start) +"ms");
            });
        }
        executor.shutdown();
    }
}
