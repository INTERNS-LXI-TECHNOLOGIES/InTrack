import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// Product.java
 class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// InventoryManager.java

public class InventoryManager {
    public static void main(String[] args) {
        // Sample list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.00));
        products.add(new Product(2, "Smartphone", 800.00));
        products.add(new Product(3, "Tablet", 300.00));
        products.add(new Product(4, "Smartwatch", 200.00));
        products.add(new Product(5, "Headphones", 150.00));

        // Process products: filter, log, and collect names of expensive products
        List<String> expensiveProductNames = products.stream()
            // Filter products with a price greater than 500
            .filter(product -> product.getPrice() > 500)
            // Log each product being processed
            .peek(product -> System.out.println("Processing: " + product))
            // Map to product names
            .map(Product::getName)
            // Collect names into a List
            .collect(Collectors.toList());

        // Print the names of expensive products
        System.out.println("Expensive Product Names: " + expensiveProductNames);

        // Use forEach to print the details of expensive products
        System.out.println("\nDetails of Expensive Products:");
        products.stream()
            .filter(product -> product.getPrice() > 500)
            .forEach(product -> System.out.println(product));
    }
}



