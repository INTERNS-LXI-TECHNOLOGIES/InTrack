import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample{

public static void main(String[] args) {
    
    List<String> fruits=Arrays.asList("apple","orange","mango","banana");

    Function<String,Integer> length=str -> str.length();

    List<Integer> fruit=fruits.stream()
                        .map(length)
                        .toList();
    System.out.println(fruit);

}
}