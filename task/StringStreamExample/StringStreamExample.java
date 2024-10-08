import java.util.Arrays;
import java.util.List;

public class StringStreamExample {
	
	public static void main(String[] args) {

	List<String> words = Arrays.asList("Apple", "Banana ", "Mango");
		
		//length
		System.out.println("length");

		words.stream().map(w -> w.length()).forEach(System.out::println);

		
		//charAt(int index)  //startsWith
		System.out.println("\ncharAt");

		words.stream().filter(n->n.startsWith("A")).map(m->m.charAt(1)).forEach(System.out::println);

	
		//substring(int beginIndex)
		System.out.println("\nsubstring");

		words.stream().map(y->y.substring(3)).forEach(System.out::println);

	
	
		//substring(int beginIndex, int endIndex)
		System.out.println("\nsubstring");

		words.stream().map(y->y.substring(3 , 4)).forEach(System.out::println);
	

		
		//equals(Object anotherObject)
		System.out.println("\nequals");

		words.stream().map(t->t.equals("hello")).forEach(System.out::println);



		//equalsIgnoreCase(String anotherString)
		System.out.println("\nequalsIgnoreCase");

		words.stream().map(u->u.equalsIgnoreCase("apple")).forEach(System.out::println);



		//compareTo(String anotherString)
		System.out.println("\ncompareTo");

		words.stream().map(u->u.compareTo("Apple")).forEach(System.out::println);



		//toLowerCase()
		System.out.println("\ntoLowerCase");

		words.stream().map(u->u.toLowerCase()).forEach(System.out::println);



		//toUpperCase()
		System.out.println("\ntoUpperCase");

		words.stream().map(u->u.toUpperCase()).forEach(System.out::println);



		//trim()
		System.out.println("\ntrim");

		words.stream().map(u->u.trim()).forEach(System.out::println);



		//replace(char oldChar, char newChar)
		System.out.println("\nreplace");

		words.stream().map(u->u.replace('p' , 'x')).forEach(System.out::println);



		//replaceAll(String regex, String replacement)
		System.out.println("\nreplaceAll");

		words.stream().map(u->u.replaceAll("l+" , "x")).forEach(System.out::println);



		//split(String regex)
		System.out.println("\nsplit");

		List<String> splitString =Arrays.asList ("Hello , World" );
		splitString.stream().map(u->u.split(",")).map(Arrays::toString).forEach(System.out::println);



		//contains(CharSequence s)
		System.out.println("\ncontains");

		words.stream().map(u->u.contains("e")).forEach(System.out::println);


		//startsWith(String prefix)
		System.out.println("\nstartsWith");

		words.stream().map(u->u.startsWith("Ba")).forEach(System.out::println);



		//endsWith(String suffix)
		System.out.println("\nendsWith");

		words.stream().map(u->u.endsWith("go")).forEach(System.out::println);



		//isEmpty()
		System.out.println("\nisEmpty");

		words.stream().map(u->u.isEmpty()).forEach(System.out::println);



		//join(CharSequence delimiter, CharSequence... elements)
		System.out.println("\njoin");

		words.stream().map(u->u.join("Apple", "Banana ", "Mango")).forEach(System.out::println);




		//toCharArray()
		System.out.println("\ntoCharArray");

		words.stream().map(u->u.toCharArray()).forEach(System.out::println);



		//valueOf()
		System.out.println("\nvalueOf");

		words.stream().map(u->u.valueOf(123)).forEach(System.out::println);





	}
}
