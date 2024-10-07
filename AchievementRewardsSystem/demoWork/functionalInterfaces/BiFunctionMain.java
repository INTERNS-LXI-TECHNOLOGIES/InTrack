import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunctionMain{
    public static void main (String [] args){
        
            List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Adam");

        BiFunction<String, Integer, String> nameLength = (a, b) -> a + " has length " + b;

        List<String> nameAndLengths = names.stream().map(a -> nameLength.apply(a, a.length())).collect(Collectors.toList());
        System.out.println("Names with their lengths: " + nameAndLengths);
    }
}