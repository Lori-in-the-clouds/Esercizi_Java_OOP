package threads;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

import static java.lang.Thread.sleep;

public class ProducerConsumerUnsafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deq = new ConcurrentLinkedDeque<>();
        Thread t1 = new producer(deq);
        Thread t2 = new consumer(deq);
        t1.start();
        t2.start();
        sleep(100L);
        t1.interrupt();
        t2.interrupt();
    }

    public static class producer extends Thread {
        final Deque<Integer> deq;

        public producer(Deque<Integer> deq) {
            super();
            this.deq = deq;
        }

        @Override
        public void run() {
            int i =0;
            while(!isInterrupted()) {
                deq.add(i++);
            }
        }
    }

    public static class consumer extends Thread {
        final Deque<Integer> deq;

        public consumer(Deque<Integer> deq) {
            this.deq = deq;
        }

        @Override
        public void run() {
            int last=0;
            while(!isInterrupted()) {
                try {
                    last = deq.removeLast();

                } catch (NoSuchElementException no_elem) {
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: "+last);
        }
    }
}

