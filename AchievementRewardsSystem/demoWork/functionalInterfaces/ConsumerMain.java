
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain{
    public static void main(String[]args){
        
       List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Consumer<String> consumerNames = n -> System.out.println("hi "+n);

        names.forEach(consumerNames);
    }
}