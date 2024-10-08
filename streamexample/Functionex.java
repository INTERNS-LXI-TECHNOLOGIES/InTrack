import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Functionex{
public static void main(String args[]){
	
	
	 List<String> words = Arrays.asList("hello", "world", "java", "streams","world");
	  	
	  List<Integer> lengths = words.stream()
        .map(String::length)
        .collect(Collectors.toList());
		System.out.println("length is"+lengths);
		
		List<String> distinctList = words.stream()
          .distinct()
          .collect(Collectors.toList());
		  System.out.println("distinct is"+distinctList);
		  
		  List<String> sortedList = words.stream()
			.sorted()
			.collect(Collectors.toList());
			System.out.println("sorted order is is"+sortedList);
			
		
			
			List<String> limitedList = words.stream()
			.limit(3)
				.collect(Collectors.toList());
				System.out.println("limit is 3"+limitedList);

	
	
			List<String> skippedList = words.stream()
			.skip(2)
				.collect(Collectors.toList());
			System.out.println("skip"+skippedList);


	
	

        
        

        Function<String, Stream<Character>> stringToCharStream = word ->
            word.chars()                             
                .mapToObj(c -> (char) c);        

        List<Character> characters = words.stream()
            .flatMap(stringToCharStream)             
            .collect(Collectors.toList());            

        
        System.out.println(characters);
    }
}

