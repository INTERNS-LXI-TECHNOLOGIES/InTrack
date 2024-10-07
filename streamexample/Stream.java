import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String args[]) {
      
        List<Integer> num = Arrays.asList(5, 90, 34, 2, 54, 234, 56542);
        
        
        num.forEach(n -> System.out.println(n));
        
       
        List<String> names = Arrays.asList("Anila", "John", "Emma");
       
        names.stream().forEach(name -> System.out.println(name));
        

        List<String> uppercaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList()); 
        
       
        uppercaseNames.forEach(uppercase -> System.out.println(uppercase));
		
		
		 List<Integer> number = Arrays.asList(5, 90, 34, 2, 54, 234, 56542);
        
        
        number.stream()
           .filter(n -> n % 2 == 0)  
           .forEach(n -> System.out.println(n));
		   
		   
		List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36);
        
        
         numbers.stream().map(Math::sqrt).forEach(sqrt -> System.out.println(sqrt));   
		   
    }
}



/*foreach map reduce collect sorted distnict limit skip*/