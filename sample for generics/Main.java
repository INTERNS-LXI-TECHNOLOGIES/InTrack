public class Main {
    
	public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>(123);
        intBox.display();  

        Box<String> strBox = new Box<>("Hello Generics");
        strBox.display();  
 
    }
}