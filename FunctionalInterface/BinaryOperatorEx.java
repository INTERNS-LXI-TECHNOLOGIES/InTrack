import java.util.function.BinaryOperator;
import java.util.List;
import java.util.Arrays;

public class BinaryOperatorEx{
    public static void main(String[] args){

        BinaryOperator<Integer> sum=(a,b) -> a+b;

        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);

        int num=nums.stream()
                .reduce(0,sum);

        System.out.println(num);


    }
}