import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 5, 6, 8, 9, 10);
        List<String> names = Arrays.asList("Charlie", "Alice", "Eve", "Bob", "David");


        System.out.println("forEach:");
        numbers.stream()
               .forEach(n -> System.out.println(n));


                System.out.println("\nmap :");
                List<Integer> doubledNumbers = numbers.stream()
                        .map(n -> n * 2)
                        .collect(Collectors.toList());
                System.out.println(doubledNumbers);


        System.out.println("\nfilter :");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);


                System.out.println("\nreduce :");
                Optional<Integer> sum = numbers.stream()
                        .reduce((a, b) -> a + b);
                System.out.println(sum);



        System.out.println("\ncollect :");
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);


                System.out.println("\nsorted :");
                List<String> sortedAlpha1 = names.stream()
                        .sorted()
                        .collect(Collectors.toList());
                System.out.println(sortedAlpha1);


        System.out.println("\nsorted 2 :");
        List<String> sortedAlpha2 = names.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(sortedAlpha2);


                System.out.println("\nsorted using numbers 1 :");
                List<Integer> sortedNumber1 = numbers.stream()
                        .sorted()
                        .collect(Collectors.toList());
                System.out.println(sortedNumber1);


        System.out.println("\nsorted using numbers 2 :");
        List<Integer> sortedNumber2 = numbers.stream()
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(sortedNumber2);


                System.out.println("\ndistinct:");
                List<Integer> distinctNumbers = numbers.stream()
                        .distinct()
                        .collect(Collectors.toList());
                System.out.println(distinctNumbers);


        System.out.println("\nlimit :");
        List<Integer> limitedNumbers = numbers.stream()
                .limit(8)
                .collect(Collectors.toList());
        System.out.println(limitedNumbers);

        
                System.out.println("\nskip :");
                List<Integer> skippedNumbers = numbers.stream()
                        .skip(2)
                        .collect(Collectors.toList());
                System.out.println(skippedNumbers);
    }
}
