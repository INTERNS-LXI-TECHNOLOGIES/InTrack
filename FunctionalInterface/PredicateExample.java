import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7);

        Predicate<Integer> isEven=x -> x%2==0;

        List<Integer> numbers=nums.stream()
                             .filter(isEven)
                             .toList();
        System.out.println(numbers);

    }
}