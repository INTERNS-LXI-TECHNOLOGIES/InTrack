import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAPIExample
{ 
    public static void main(String[] s){

    List<String> sentence =Arrays.asList("v","afsal","mahesh","farseena");

    List<Integer> sentence1=(List<Integer>) sentence.stream().map(String::length).collect(Collectors.toList());
    sentence1.forEach(print -> System.out.println("list count using lenght"+print));


    List<String> charAt =Arrays.asList("vibin","afsal","mahesh","farseena");

    List<Character> charAt1=(List<Character>) charAt.stream().map(word-> word.charAt(3)).collect(Collectors.toList());
    charAt1.forEach(System.out::println);

    List<String> subStringbegin =Arrays.asList("vibin is a gentle man");
    subStringbegin.stream().map(subword-> subword.substring(5)).forEach(print->System.out.println("sub string is "+print));

    List<String> subStringends =Arrays.asList("vibin is a gentle man");
    subStringends.stream().map(subword-> subword.substring(3,6)).forEach(print->System.out.println("sub string is beging and end  "+print));

    List<String> toLowercase =Arrays.asList("VIBIN IS A GENTLE MAN");
    toLowercase.stream().map(String::toLowerCase).forEach(print->System.out.println(" to lower case  "+print));
    
    List<String> toUppercase =Arrays.asList("vibin is a gentle man");
    toUppercase.stream().map(String::toUpperCase).forEach(print->System.out.println(" to lower case  "+print));

    List<String> trim =Arrays.asList("      vibin,is       a gentle     man");
    trim.stream().map(triming -> triming.trim().replaceAll("\\s+", " ")).forEach(print->System.out.println(" after trim  "+print));



    }
}