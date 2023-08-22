package threads;

import java.util.concurrent.TimeUnit;

public class StartStop {
    static class startstop extends Thread {
        public startstop(String name) {
            super(name); //il thread si chiamerà name
        }

        @Override
        public void run() {
            long startTime = System.nanoTime();
            while(!interrupted()) {
                String tmp = String.format(getName()+" running since "+ TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-startTime));
                System.out.println(tmp);
            }
            System.out.println(getName()+" terminated");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new startstop("t1");
        Thread t2 = new startstop("t2");
        t1.start();
        t2.start();

        Thread.sleep(100L);
        t1.interrupt();
        t2.interrupt();
    }


}
