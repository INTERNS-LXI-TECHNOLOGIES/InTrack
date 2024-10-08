package power;

import java.util.Arrays;
import java.util.List;

public class Tdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> square = numbers.stream().map(num -> (int) Math.pow(num, 2)).toList();

        square.forEach(System.out::println);

        List<Integer> square1 = numbers.stream().map(num -> Math.pow(num, 2)).map(Double::intValue).toList();

        square1.forEach(System.out::println);
    }
    

    
    
}
