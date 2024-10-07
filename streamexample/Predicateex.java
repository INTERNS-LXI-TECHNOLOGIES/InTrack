import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Predicateex{
public static void main(String args[]){
	List<Integer> numbers= Arrays.asList(-2,1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	Predicate<Integer> even =n->n%2==0;
	Predicate<Integer> greater=n->n>5;
	
	
	numbers.stream()
               .filter(even.negate())     //negate
               .forEach(System.out::println);
	
	
	numbers.stream()
	.filter(even.and(greater)) //and
	.forEach(System.out::println);
	
	numbers.stream()
	.filter(even.or(greater))    //or
	.forEach(System.out::println);
	
	
	Predicate<String> s=str->str.length()> 5;
	
	System.out.println(s.test("aiila"));
	System.out.println(s.test("alliyambal"));
	System.out.println(s.test("ima"));
	System.out.println(s.test("predicate"));
	
	
	Predicate<String> a = Predicate.isEqual("Anila");

        System.out.println(a.test("Anila"));  // isEqual
        System.out.println(a.test("Alex"));
		
		
		List<String> fruits=Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape","annar","adlsssssss");
		
		List<String> filterfruits = fruits.stream()
		.filter(fruit->fruit.contains("a"))
		.collect(Collectors.toList());
		System.out.println("a contains fruits are:"+filterfruits);
		
		
		List<String> afilterfruits = fruits.stream()
		.filter(fruit->fruit.startsWith("a"))
		.collect(Collectors.toList());
		System.out.println("a startWith:"+afilterfruits);
		
		
		
		
		
		String str="apple"+"bannana"+"cherry";
		
		List<String> list=str.chars()
		 
            .mapToObj(c -> String.valueOf((char) c)) 
            .collect(Collectors.toList());
			
		
		list.forEach(n->System.out.println(n));
		
		
		fruits.stream()
		.forEach(n->System.out.println(n));

		
		fruits.stream()
		.forEach(n->System.out.println(n.length()));
		

	
	
	
	
}
}