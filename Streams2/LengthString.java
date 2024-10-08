import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;



public class LengthString{
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("apple","orange","banana","cherry");

        List<Integer> fruit=fruits.stream()
                            .map(f -> f.length())
                            .collect(Collectors.toList());

     System.out.println(fruit);
    }
}