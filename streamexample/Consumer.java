import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Consumerex{
public static void main(String args[]){
	
	List<String> list = Arrays.asList("apple", "banana", "cherry", "blueberry", "fig");


List<String> sortedByLength = list.stream()
			.sorted(Comparator.comparingInt(String::length))
			.collect(Collectors.toList());
			System.out.println("sorted order is is"+sortedByLength);
			
			List<String> Length=list.stream()
			.peek(System.out::println)  
				.filter(str -> str.length() > 4)
				.collect(Collectors.toList());
				System.out.println("length is is"+Length);

}
}