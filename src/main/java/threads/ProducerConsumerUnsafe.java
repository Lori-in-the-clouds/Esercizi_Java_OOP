package threads;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

import static java.lang.Thread.sleep;

public class ProducerConsumerUnsafe {
    public static class consumer extends Thread {
        Deque<Integer> c = (Deque<Integer>)Collections.synchronizedCollection(new ArrayDeque<Integer>());

        public consumer(Deque<Integer> c) {
            this.c = c;
        }

        @Override
        public void run() {
            int last = 0;
            while(!interrupted()) {
                try {
                    last = c.removeLast();
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: "+last);
        }
    }

    public static class producer extends Thread {
        Deque<Integer> c = (Deque<Integer>)Collections.synchronizedCollection(new ArrayDeque<Integer>());


        public producer(Deque<Integer> c) {
            this.c = c;
        }

        @Override
        public void run() {
            int i=0;
            while(!interrupted()) {
                c.add(i++);
            }
       }
    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> c = new ConcurrentLinkedDeque<>();
        Thread t1 = new consumer(c);
        Thread t2 = new producer(c);
        t1.start();
        t2.start();
        Thread.sleep(100L);
        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();

    }
}
