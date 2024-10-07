import java.util.Arrays;
import java.util.List;


public class Name{
	public static void main (String args[]){
		List<String> names=Arrays.asList("anila","usha","suresh");
		
		names.stream()
		.forEach(n-> System.out.println(n));
		
		names.stream()
		.forEach( System.out::print);
		
		
		
	}
	
}
