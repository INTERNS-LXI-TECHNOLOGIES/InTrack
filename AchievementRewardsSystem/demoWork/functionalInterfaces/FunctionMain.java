import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMain {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<Integer, Integer> squareFunction = n -> n * n;

        List<Integer> squareNumbers = numbers.stream().map(squareFunction).collect(Collectors.toList());

        System.out.println("Square numbers: " + squareNumbers);
    }
}
