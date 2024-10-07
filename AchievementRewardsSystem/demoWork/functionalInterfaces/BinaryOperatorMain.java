
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class BinaryOperatorMain{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> binaryNumb = (a,b) -> a+b;
        Integer finalNumb = numbers.stream().reduce(0,binaryNumb);

        System.out.print("sum of numbers: "+finalNumb);

    }
}
