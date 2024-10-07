import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorMain{
    public static void main(String[] args) {

          List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Adam");

        UnaryOperator<String> toUpperCase = n -> n.toUpperCase();

        List<String> upperCaseNames = names.stream().map(toUpperCase).collect(Collectors.toList());

            System.out.println("Names in uppercase: " + upperCaseNames);

    }
}
