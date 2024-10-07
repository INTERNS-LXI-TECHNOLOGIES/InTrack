import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tdd {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "dolphin", "elephant", "duck", "ant","zebra ");

        System.out.println("\t"+"Length");

       String maxLength = words.stream().max(Comparator.comparing(String::length)).orElse(null);

       System.out.println(maxLength);

       System.out.println("\t"+"CharAt method");

       List<Character> chars = words.stream().map(word -> word.charAt(1)).toList();

       chars.forEach(System.out::println);

       System.out.println("\t"+"SubString");

       List<String> subString = words.stream().map(word -> word.substring(2)).toList();

       subString.forEach(System.out::println);

       System.out.println("\t"+"SubString2");

       List<String> subString2 = words.stream().map(word -> word.substring(1, 2)).toList();

       subString2.forEach(System.out::println);

       System.out.println("\t"+"Contains");

       String contains = words.stream().filter(word -> word.contains("in")).findFirst().orElse(null);

       System.out.println(contains);

       System.out.println("\t"+"StartsWith");

       words.stream().filter(word -> word.startsWith("a")).toList().forEach(System.out::println);

       System.out.println("\t"+"EndsWith");

       words.stream().filter(word -> word.endsWith("t")).forEach(System.out::println);

       System.out.println("\t"+"indexOf");

       words.stream().map(word -> word.indexOf(1)).forEach(System.out::println);

       System.out.println("\t"+"Replace");

       words.stream().filter(word -> word.equals("ant")).map(word -> word.replace("t", "d"))
       .forEach(System.out::println);

       System.out.println("\t"+"Replace word");

       words.stream().filter(word -> word.equals("dog")).map(word -> word.replace("g", "ll"))
       .forEach(System.out::println);

       System.out.println("\t"+"Trim");

       words.stream().filter(word -> word.equals("zebra ")).map(String::trim).forEach(System.out::println);

       System.out.println("\t"+"isNotEmpty");

       words.stream().filter(word -> !word.isEmpty()).forEach(System.out::println);

       System.out.println("\t"+"toCharArray");

       words.stream().filter(word -> word.equals("dog")).map(String::toCharArray).forEach(System.out::println);

       System.out.println("\t"+"Split");

       words.stream().filter(word -> word.equals("dolphin")).map(word -> word.split("p"))
       .flatMap(Arrays::stream).forEach(System.out::println);

       System.out.println("\t"+"join");

       words.stream().map(word -> String.join("-", word.split(""))).forEach(System.out::println);

    }
}