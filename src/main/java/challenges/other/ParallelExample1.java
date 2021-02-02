package challenges.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class ParallelExample1 {
    public static void main(String[] args) {

        // calculating quotients
        List <String> output = IntStream.range(0,50).//parallel().
                filter(i -> i%5 == 0).
                mapToObj(i -> String.valueOf(i/5)).
                collect(toList());
        System.out.println(output);

        //List of element -> find c letter guys -> change to upper case -> sort it -> print it
        List<String> myList =
                Arrays.asList("apple", "mango", "orange", "cabbage", "capsicum");
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //debugging usign peek
        myList.stream().filter(s -> s.startsWith("c"))
                        //.peek(s -> System.out.println(s))
                        .peek(s -> System.out.println(Thread.currentThread()))
                        .map(String::toUpperCase)
                        .sorted()
                        .forEach(System.out::println);

        Stream.of("Apple","Mango","Banana","Capsicum", "Cabbage", "Cauliflower")
                .filter(s -> s.startsWith("C"))
                .map(s -> s.toLowerCase())
                .sorted()
                .forEach(s -> System.out.println(s));

        IntStream stream = IntStream.of(1, 2);
        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);


        /*IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .distinct()
                .limit(10)
                .forEach(System.out::println);*/

       /* IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .parallel()
                .distinct()
                .limit(10)
                .forEach(System.out::println);*/

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3));
        for (Integer integer : integers) {
           // integers.remove(2);
        }

        IntStream.iterate(0, i -> i + 1)
                .limit(10) // LIMIT
                .skip(5) // OFFSET
                .forEach(System.out::println);

        IntStream.range(1, 5)
                .peek(System.out::println)
                .peek(i -> {
                    if (i == 5)
                        throw new RuntimeException("bang");
                });


        IntStream.of(1, 2, 3, 4).forEach(
                element -> System.out.println(element + 1));
    }
}
