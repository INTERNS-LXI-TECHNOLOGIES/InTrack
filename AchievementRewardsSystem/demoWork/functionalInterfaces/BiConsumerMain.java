import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerMain{
    public static void main (String [] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Adam");

        BiConsumer<String, Integer> printNameAndLength = (a,b) -> System.out.println(a + ": " + b);

        names.forEach(name -> printNameAndLength.accept(name, name.length()));

    }
}