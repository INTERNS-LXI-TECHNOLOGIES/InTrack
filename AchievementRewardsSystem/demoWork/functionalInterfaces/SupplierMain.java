import java.util.function.Supplier;
import java.util.stream.Stream; 

public class SupplierMain{
    public static void main(String[] args) {

        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 10);
        
        Stream<Integer> randomStream = Stream.generate(randomSupplier).limit(5);
        
        randomStream.forEach(System.out::println);
    }
}
