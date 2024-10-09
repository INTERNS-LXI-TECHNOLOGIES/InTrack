import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample{

    public static void main(String[] args){

        List<String> fruits=Arrays.asList("apple","orange","mango","banana");

        Consumer<String> printName=s -> System.out.println(s);

        fruits.stream().forEach(printName);


    }
}