
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class Mathse {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Example mathematical operations using Stream API
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum: " + sum); // Output: Sum: 15

        double avg = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .average().orElse(0.0);
    System.out.println("Average: " + avg); // Output: Average: 3.0


    Optional<Integer> max = numbers.stream()
                                   .max(Integer::compareTo);
     // Output: Max: 5
     System.out.println("Average: " + max.orElse(0));

    Optional<Integer> min = numbers.stream()
                                   .min(Integer::compareTo);
    System.out.println("Average: " + min);// Output: Min: 1
    
    long count = numbers.stream().count();
System.out.println("Count: " + count); // Output: Count: 5

Optional<Integer> product = numbers.stream()
                                    .reduce((a, b) -> a * b);
product.ifPresent(value -> System.out.println("Product: " + value)); // Output: Product: 120

List<Integer> squares = numbers.stream()
                               .map(n -> n * n).filter(n -> n % 2 == 0)
                               .collect(Collectors.toList());
System.out.println("Squares: " + squares); // Output: Squares: [1, 4, 9, 16, 25]

List<Integer> evens = numbers.stream()
                              .filter(n -> n % 2 == 0)
                              .collect(Collectors.toList());
System.out.println("Even Numbers: " + evens); // Output: Even Numbers: [2, 4]


// Example: Calculate the sum of squares
int sumOfSquares = numbers.stream()
                          .map(n -> n * n)
                          .reduce(0, Integer::sum);
System.out.println("Sum of Squares: " + sumOfSquares); // Output: Sum of Squares: 55


    }
}
