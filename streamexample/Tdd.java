import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Fruits{
	String name;
	String colour;
	int price;
	
	public Fruits(String name,String colour,int price){
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
	
	
	    public String getName() {
        return name;
    }

    public String getColor() {
        return colour;
    }

   
    public String toString() {
        return name + " \n" + colour + "\n"+price+"\n";


}
}


public class Tdd{
public  static void main(String args[]){
	
	List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Apple", "Red",210));
        fruits.add(new Fruits("Banana", "Yellow",50));
        fruits.add(new Fruits("Cherry", "Red",100));
        fruits.add(new Fruits("Blueberry", "Blue",372));
        fruits.add(new Fruits("Kiwi", "Green",270));
        fruits.add(new Fruits("Orange", "Orange",110));
        fruits.add(new Fruits("Pear", "Green",244));
        fruits.add(new Fruits("Mango", "Yellow",20));
        fruits.add(new Fruits("Plum", "Purple",90));
		
		
	List<Fruits> redFruits = fruits.stream()
                .filter(fruit -> "Red".equals(fruit.getColor()))
                .collect(Collectors.toList());
        System.out.println("Red fruits: " + redFruits);	
		
	/*String fruit = fruits.stream()
	.filter(word -> word.equals("Plum")).findFirst().orElse(null);	
										
	    System.out.println( fruit);*/
		
		String fru = "Apple";
		
		String[] spli = fru.split("l");
		
		Arrays.stream(spli)
              .forEach(System.out::println); 
		
		
	boolean anymatch=fruits.stream()
	 .anyMatch(fruit->fruit.getName().contains("e"));
	  System.out.println("e contains fruits: " + anymatch);	
	  
	boolean allmatch=fruits.stream()
	 .allMatch(fruit->fruit.getColor().length()>4);
	  System.out.println("length of fruits: " + allmatch);	
	  
	 boolean noLongColors = fruits.stream()
        .noneMatch(fruit -> fruit.getColor().length() > 10);

        System.out.println("No fruits have a color length greater than 10: " + noLongColors);
		
		 String upperCaseFruits = fruits.stream()
                                        .map(fruit -> fruit.getName().toUpperCase()) 
                                        .collect(Collectors.joining(", "));

       
        System.out.println("Uppercase Fruits: " + upperCaseFruits);
		
		 List<Integer> indexes = fruits.stream()
                .map(fruit -> fruit.getName().indexOf('a')) 
                .collect(Collectors.toList());
				        System.out.println("indexof  Fruits: " + indexes);
		List<Integer> lastindexes = fruits.stream()
                .map(fruit -> fruit.getName().lastIndexOf('a')) 
                .collect(Collectors.toList());
				        System.out.println("indexof  Fruits: " + lastindexes);		

        List<String> frui = Arrays.asList("  Apple  ", " Banana ", " Cherry ", "  Mango  ", "Peach  ");

        List<String> trimmedFruits = frui.stream()
                                            .map(String::trim) 
                                            .collect(Collectors.toList());  


        System.out.println("Original fruits: " + frui);
        System.out.println("Trimmed fruits: " + trimmedFruits);						

				
        	
}
}