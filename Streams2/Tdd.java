import java.util.List;
import java.util.Arrays;

public class Tdd{
    public static void main(String[] args) {
        
    
    List <String> words=Arrays.asList("sruthi","anila","vipin","arjun");
    long vowels=words.stream()
               .filter(w->w.contains("a")||w.contains("e")||w.contains("i")||w.contains("o")||w.contains("u"))
               .count();


    System.out.println(vowels);
}
}