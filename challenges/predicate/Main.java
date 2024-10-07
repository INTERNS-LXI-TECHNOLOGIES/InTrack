import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Product> products = new ArrayList<>();

        products.add(new Product("watch", 1, 100));
        products.add(new Product("chair", 2, 200));
        products.add(new Product("pen", 3, 10));
        products.add(new Product("pencil", 4, 15));
        products.add(new Product("book", 5, 80));
        products.add(new Product("laptop", 6, 40000));
        products.add(new Product("mobile", 7, 10000));
        products.add(new Product("board", 8, 400));
        products.add(new Product("bag", 9, 500));

        Boolean b=products.stream().filter(n -> n.getPrice() > 500).anyMatch(n>10000);
        System.out.println(b);
        // p.stream().forEach(System.out::println);

    }
}

class Product {

    private String name;
    private int id;
    private double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


