package cube;

import java.util.*;
public class Tdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 27, 3, 4, 5);

        numbers.stream().map(num -> Math.cbrt(num));
        
    }
}
