import java.util.Arrays;
import java.util.List;

public class MathStreamExample{
    public static void main(String[] args){

    List<Integer> nums = Arrays.asList(1 , -2 , 3 , -4 , 5 , -6 , 20);

    //Math.abs(double a)
    nums.stream().map(Math::abs).forEach(System.out::println);


    //Math.sqrt(double a)
    List<Integer> sqrtNums = Arrays.asList(4 , 9 , 16 , 25 , -49);

    sqrtNums.stream().map(Math::sqrt).forEach(System.out::println);


    //Math.log(double a)
    nums.stream().map(Math::log).forEach(System.out::println);


    //Math.log10(double a)
    nums.stream().map(Math::log10).forEach(System.out::println);


    //Math.pow(double a, double b)
    double exponent = 3;
    nums.stream().map(a -> Math.pow(a, exponent)).forEach(System.out::println);


    //Math.round(double a)
    List<Double> doubleNums = Arrays.asList(1.5854 , -2.7844 , 3.5452, -4.0 , 5.75 , -6.99, 20.0);

    doubleNums.stream().map(Math::round).forEach(System.out::println);


    //Math.max(int a, int b)
    int fixedValue = 10;
    nums.stream().map(i -> Math.max(i , fixedValue)).forEach(System.out::println);


    //Math.min(int a, int b)
    int fixedValue2 = 15;
    nums.stream().map(i -> Math.max(i , fixedValue2)).forEach(System.out::println);

    }
}