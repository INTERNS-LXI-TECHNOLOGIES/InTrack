import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("   Hello, World!   ", "   Java Programming   ", "Stream API", "   Functional   ", "   Examples   ");

        List<String> trim=fruits.stream()
                          .map(f -> f.trim())
                          .toList();
        System.out.println(trim);
        
        List<String> fruits2=fruits.stream()
                             .map(f-> f.toUpperCase())
                             .toList();
        System.out.println(fruits2);

        List<String> fruits3=fruits.stream()
                             .filter(f -> f.length()>20)
                             .toList();
        System.out.println(fruits3);

       fruits.stream().filter(f->f.contains("ple")).map(f->f.substring(7)).forEach(System.out::println);

       fruits.stream().filter(f -> f.toLowerCase().contains("api")).map(f -> f.substring(2,5)). forEach(System.out::println);

       fruits.stream().filter(f->f.contains("World")).map(f->f.replace("World", "Java")).forEach(System.out::println);


       String fruit = "vi,in,mv";
       String[] result = fruit.split(",");
       for(String s : result)
       {
        System.out.println(s);
       }
       
        String f="apple,banana,cherry";
        List<String> fr=Arrays.stream(f.split("a")).collect(Collectors.toList());
        System.out.println(fr);
       
        List<String> colors=Arrays.asList("rede","green","yellow","orange");

        String joined=String.join("-",colors);
        System.out.println(joined);

        long count=colors.stream().filter(c -> c.startsWith(" ")).count();
        System.out.println(count);

        colors.stream().map(c -> c.indexOf("e")).forEach(System.out::println);

        System.out.println(" ");

        colors.stream().map(c -> c.lastIndexOf("e")).forEach(System.out::println);


    }
}