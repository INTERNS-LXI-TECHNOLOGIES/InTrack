
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
  public static void main (String [] args){

    List<Product>product=new ArrayList<Product>();
    
    product.add(new Product("chair",1,180));
    product.add(new Product("pen",2,190));
    product.add(new Product("cha",3,170));
    product.add(new Product("chai",4,60));
    product.add(new Product("chairs",5,50));
    product.add(new Product("chairss",6,140));
    
    List<Product> str = product.stream().filter(n->n.getPrice()>=100).collect(Collectors.toList());
    str.stream().forEach(System.out::println);
  }
}

class Product{
  
  private String name;
  public Product(String name, int id, double price) {
    this.name = name;
    this.id = id;
    this.price = price;
  }

  private int id;
  private double price;
  
  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
  
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
      return name+id+price;
    }
}