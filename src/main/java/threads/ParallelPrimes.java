package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {
    final static int Num_threads = 5;
    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        List<PrimeEngine> callables = new ArrayList<>(Num_threads);
        int first = 0;
        for(int i =1;i<Num_threads;i++) {
            callables.add(new PrimeEngine(first,i*1000));
            first = i*1000;
        }
        ExecutorService executor = Executors.newFixedThreadPool(Num_threads);

        List<Future<List<Integer>>> dst = executor.invokeAll(callables);
        for (Future<List<Integer>> i : dst) {
            try {
                System.out.println(i.get());
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}
