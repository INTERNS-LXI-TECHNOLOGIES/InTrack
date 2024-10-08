
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathMethods{
    public static void main (String [] args){
        List<Integer> numbers = Arrays.asList(-4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        List<Double> diffNumb = Arrays.asList(3.7, 2.4, 5.9, 1.4, 2.9, 9.9, 8.2);

        System.out.println("1. abs(int a) :");
        numbers.stream().map(Math::abs).forEach(n -> System.out.println("absolute values: "+n));

        System.out.println("\n2. max(int a, int b) :");
        Integer maxvalue = numbers.stream().reduce(0,Math::max);
        System.out.println("max value available: " +maxvalue);

        System.out.println("\n3. min(int a, int b) :");
        Integer minValue = numbers.stream().reduce(0, Math::min);
        System.out.println("min value available: " +minValue);

        System.out.println("\n4. sqrt(double a) :");
        numbers.stream().map(n -> (int) Math.sqrt(n)).forEach(n -> System.out.println("Square root values: "+ n));

        System.out.println("\n5. pow(double a, double b) :");
        numbers.stream().map(n -> (int) Math.pow(n, 4)).forEach(n -> System.out.println("pow value: "+ n));

        System.out.println("\n6. round(double a) :");
        diffNumb.stream().map(Math::round).forEach(n -> System.out.println("rounded values: "+n));

        System.out.println("\n7. ceil(double a) :");
        diffNumb.stream().map(Math::ceil).forEach(n -> System.out.println("ceil values: "+n));

        System.out.println("\n8. float(double a) :");
        diffNumb.stream().map(Math::floor).forEach(n -> System.out.println("floor values: "+n));

        System.out.println("\n9. random() :");
        List<Integer> randomNum = numbers.stream().map(n -> numbers.get((int) (Math.random()*numbers.size()))).collect(Collectors.toList());
            System.out.println("random values from list: "+randomNum);
        

    }
}