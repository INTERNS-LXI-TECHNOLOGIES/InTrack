import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//predicate containing methods filter(),allMatch(),anyMatch(),findAny(),findFirst()

class Fruits
{
	private String name;
	private int price;
	
	public Fruits(String name,int price)
	{
		this.name = name;
		this.price = price;
	}

  public String getName()
  {
	return name;
  }
  public void setName()
  {
	this.name = name;
  }
  
  
  public int getPrice()
  {
	return price;
  }
  public void setPrice()
  {
	this.price = price;
  }
  
  public String toString()
  {
	return "Fruit: "+getName()+"\n"+"Price: "+getPrice();
  }
  
  
}  
  
public class Market
{
	public static void main(String[] args)
	{
		List <Fruits> fruits = new ArrayList<>();
		
		fruits.add(new Fruits("Apple",50));
		fruits.add(new Fruits("Orange",80));
		fruits.add(new Fruits("Banana",75));
		fruits.add(new Fruits("Grapes",85));

	
	
		fruits.stream()
		.filter(f -> f.getPrice() > 80)
		.forEach(f -> System.out.println(f));
		
		
		boolean largerthanhundred = fruits.stream()
					                .anyMatch(f -> f.getPrice() >100);
									
	    System.out.println("largerthanhundred :"+ largerthanhundred);
		
		
		boolean allNameStartsWithA = fruits.stream()
										.allMatch(f -> f.getName().startsWith("A"));
										
			System.out.println("allNameStartsWithA :"+ allNameStartsWithA);


			 Fruits foundfruit = fruits.stream()
						       .filter(n -> n.getPrice() > 75)
						       .findAny().orElse(null);
						
						System.out.println(foundfruit);
						
					Fruits foundfruits = fruits.stream()
									.filter(n-> n.getPrice() < 40)
									.findFirst().orElse(null);
									
			 System.out.println(foundfruits);
			 
	}
}
	