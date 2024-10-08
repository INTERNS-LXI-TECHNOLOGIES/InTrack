import java.util.function.*;
import java.util.List;
import java.util.Arrays;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> fruits=Arrays.asList("apple","banana","","Cherry");

        Predicate<String> isNotEmpty= s -> !s.isEmpty();

        List<String> list = fruits.stream()
                        .filter(isNotEmpty)
                        .toList();
                        
        System.out.println(list);

        List<Integer> length=fruits.stream()
                            .map(s -> s.length()).toList();
            System.out.println(length);
            
            Predicate<String> word= s-> s.equals("banana");
            //Predicate<String> letter= ;

        String letter1 = fruits.stream()
                      .filter(word)
                      .map((s -> s.charAt(3))).findFirst().map(String::valueOf).orElse(null);

        System.out.println(letter1);

        fruits.stream().count();

        
        
    }
}