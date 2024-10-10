import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample{
  //take input and return value, Map API is an example for Function
  public static void main (String[]args){
     List<Integer> numbers = Arrays.asList(-5, 3, 0, 7, -2, 10);

     Function<Integer,Boolean> isPositive = number -> number>0;

     List<Boolean> results = numbers.stream().map(isPositive).collect(Collectors.toList());

     System.out.println(results);
  }
}