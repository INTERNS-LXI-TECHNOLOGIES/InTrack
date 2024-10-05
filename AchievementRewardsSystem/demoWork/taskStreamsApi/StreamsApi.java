import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsApi{
    public static void main(String[]args){
        
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16 , 17, 20);
        List<String> names= Arrays.asList("DEMON", "", "DOG", "KRISH", "", "DALIA", "DOLPHIN","ABIN", "", "RENJITH", "", "TRISHA");

        System.out.println("task1: ");
        Optional<Integer> evenSum = numbers.stream().filter(n->n%2==0).peek(n-> System.out.println(n)).reduce((a,b) -> a+b);
        System.out.println(evenSum);

        System.out.println("\ntask2: ");
        names.stream().filter(n -> n.startsWith("D")).forEach(System.out::println);

        System.out.println("\ntask3: ");
        List<Integer> doubleValue =numbers.stream().map(n -> n%2).collect(Collectors.toList());
        System.out.println(doubleValue);

        System.out.println("\ntask4: ");
        names.stream().filter(n->n.isEmpty()).forEach(System.out::println);
        
        System.out.println("\ntask5: ");
        Optional<String> longestName = names.stream().max((a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println(longestName);

        System.out.println("\ntask6: ");
        numbers.stream().map(n -> n*n).forEach(System.out::println);

        System.out.println("\ntask7: ");
        names.stream().map(s -> s.chars().count()).forEach(System.out::println);

        System.out.println("\ntask8: ");
        Boolean allNotEmpty = names.stream().allMatch(n -> !n.isEmpty());
        System.out.println(allNotEmpty);



    }
}