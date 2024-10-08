import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMethods{
    public static void main (String [] args){
        List <String> names = Arrays.asList(" Alice jhon Abraham", "Bobi jhon A ", "  Charlie devilious ", "  David jhon parakal ");

        System.out.println("1. length() : ");
        names.stream().map(String::length).forEach(System.out::println);

        System.out.println("\n2. charAt(int index) : ");
        names.stream().map(n -> n.charAt(2)).forEach(System.out::println);

        System.out.println("\n3. substring(int beginIndex, int endIndex) : ");
        names.stream().map(n -> n + " : " + n.substring(2,8)).forEach(System.out::println);

        System.out.println("\n4. indexOf(String str) : ");
        names.stream().map(n -> n.indexOf('a')).forEach(System.out::println);
        names.stream().map(n -> n.indexOf('A')).forEach(System.out::println);

        System.out.println("\n5. lastIndexOf(String str) : ");
        names.stream().map(n -> n.lastIndexOf('a')).forEach(System.out::println);
        names.stream().map(n -> n.lastIndexOf('A')).forEach(System.out::println);

        System.out.println("\n6. toUpperCase() : ");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\n7. toLowerCase() : ");
        names.stream().map(String::toLowerCase).forEach(System.out::println);

        System.out.println("\n8. trim() : ");
        names.stream().map(String::trim).forEach(System.out::println);

        System.out.println("\n9. replace(CharSequence target, CharSequence replacement): ");
        names.stream().map(n -> n.replace("A", "M")).forEach(System.out::println);
        names.stream().map(n -> n.replaceAll("Alice", "bob")).forEach(System.out::println);
        names.stream().map(n -> n.replaceFirst(" ", "_")).forEach(System.out::println);

        System.out.println("\n10. contains(CharSequence s) : ");
        names.stream().map(n -> n.contains("Alice")).forEach(n -> System.out.println("using String: "+n));
        names.stream().map(n -> n.contains("b")).forEach(n -> System.out.println("using char: "+ n));

        System.out.println("\n11. split(String regex) : ");
        names.stream().map(n -> n.split(",")).map(Arrays::toString).forEach(n -> System.out.println("splited :"+n));

        System.out.println("\n12. equals(Object anObject) : ");
        List <String> equalName = 
                    names.stream().map(String::trim).filter(n -> n.equals("Bobi jhon A")).collect(Collectors.toList());

                    if(equalName != null){
                        System.out.println("name found: "+equalName);
                    }
                    else{
                        System.out.println("no matching found");
                    }


    }
}