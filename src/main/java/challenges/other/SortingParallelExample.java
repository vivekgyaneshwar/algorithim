package challenges.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
public class SortingParallelExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<String> nthread = new ConcurrentSkipListSet<>();
        Random rn = new Random();
        for (int i = 0; i < 10_00_00_00; i++) {
            list.add((int) rn.nextInt() * 1000000);
        }
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            List<Integer> even = list.parallelStream().
                    filter(n -> n % 2 == 0).
                    peek(n ->
                            nthread.add(Thread.currentThread().getName())).
                    sorted().
                    collect(Collectors.toList());
            long end = System.currentTimeMillis();
            System.out.println(end - start + " " + "Active threads "
                    + Thread.activeCount());
            System.out.println("Thread Names are " + nthread);
        }
    }
}
