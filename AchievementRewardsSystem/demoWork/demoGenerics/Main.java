public class Main{
    public static void main (String [] args){
        
        Car<Integer> benz= new Car<>(7945,"S-Class","Benz");

        Car<String> bmw= new Car<>("3479","5 Series","Bmw");

        System.out.println(benz);
        System.out.println(bmw);
    }
}