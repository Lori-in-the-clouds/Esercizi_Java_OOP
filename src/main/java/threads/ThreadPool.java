package threads;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThreadPool extends Thread {
    public static final int MAX_TASKS = 8;
    int number;

    public ThreadPool(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("START thread="+getName()+" "+"task="+number);
        long time=(long)(Math.random()*999);
        try {
                sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        System.out.println("STOP thread="+getName()+" "+"task="+number+" t="+time+"ms");
    }

    public static void main(String[] args) {
        Thread[] dst = new Thread[MAX_TASKS];
        for (int i=0;i<MAX_TASKS;i++) {
           Thread t1 = new ThreadPool(i);
            t1.start();
        }
    }

}
