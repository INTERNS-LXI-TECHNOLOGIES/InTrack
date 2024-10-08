import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.BiFunction;


public class FunctionalInterface{
	
	public static void main(String[] args){
		
	
	List<String> names =Arrays.asList("Aan","Jenia","Jas","Aalia");
	
	//using predicate   Predicate<T>
		
		Predicate<String> startWithA = a -> a.startsWith("A");
		names.stream().filter(startWithA).forEach(System.out::println);
	
	
	//using predicate in another way
		
		names.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
		
	//using Function   Function<T, R>
		
		Function<String , Integer>  stringLength = s -> s.length();
		List<Integer> lengths = names.stream().map(stringLength).collect(Collectors.toList());
		System.out.println(lengths);

		
	//using Function in another way
	
		names.stream().map(n->n.length()).forEach(System.out::println);
		
		names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		
	//using consumer   Consumer<T>
	
		Consumer<String> printName = System.out::println;
		names.stream().forEach(printName);
		
	
	//using consumer in another way
	
		names.stream().forEach(System.out::println);
		
	//using Supplier Supplier<T>
		
		Supplier<String> justOutput = () -> "Default";
		System.out.println(justOutput.get());
		
	
	//using binaryOperator    BinaryOperator<T> 
	
	List<Integer> numbers =Arrays.asList(1,2,3,4,5,6);
		
		BinaryOperator<Integer> sum = (a , b) -> a+b;
		int total = numbers.stream().reduce(0, sum);
		System.out.println(total);
	
	
	//using  BiFunction     BiFunction<T, U, R>
	
		BiFunction<Integer , Integer , Integer>  multiply = (a , b) -> a*b ;
		int sumOfNums = multiply.apply(2 , 3);
		System.out.println(sumOfNums);
		
	}
}