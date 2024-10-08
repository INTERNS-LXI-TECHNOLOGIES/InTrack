package max;

import java.util.*;
public class Tdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 27, 3, 4, 5);

        System.out.println(numbers.stream().reduce(Math::max).orElse(null));
        //.forEach(System.out::println);
        
    }
}

