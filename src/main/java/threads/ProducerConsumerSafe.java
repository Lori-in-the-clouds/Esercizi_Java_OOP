package threads;

import com.sun.jdi.IntegerValue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

import static java.lang.Thread.sleep;

public class ProducerConsumerSafe  {

   public static class counsumerSafe extends Thread {
       Deque<Integer> deq = new ArrayDeque<>();

       public counsumerSafe(Deque<Integer> deq) {
           this.deq = deq;
       }

       int num_elements;
       @Override
       public void run() {
           while(!interrupted()) {
               try {
                    synchronized (deq) {
                        num_elements = deq.removeLast();
                    }
               } catch (NoSuchElementException e) {
                   Thread.yield();
               }
           }
           System.out.println("Total number of consumed elements: "+num_elements);
       }
   }

    public static class producerSafe extends Thread {
        Deque<Integer> deq = new ArrayDeque<>();

        public producerSafe(Deque<Integer> deq) {
            this.deq = deq;
        }

        @Override
        public void run() {
            int i =0;
            while (!interrupted()) {
                synchronized (deq) {
                    deq.addLast(i++);
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deq = new ArrayDeque<>();
        Thread t2 = new producerSafe(deq);
        Thread t1 = new counsumerSafe(deq);
        t2.start();
        t1.start();

        sleep(100L);
        t2.interrupt();
        t1.interrupt();

    }




}
