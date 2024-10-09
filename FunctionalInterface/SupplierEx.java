import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.Random;


public class SupplierEx{
    public static void main(String[] args){

        Supplier<Integer> randomNum= () -> new Random().nextInt(100);

        List<Integer> numbers= new ArrayList<>();
        for(int i=0;i<10;i++){
            numbers.add(randomNum.get());
        }

        System.out.println(numbers);

    }
}