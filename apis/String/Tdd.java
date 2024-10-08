import java.util.Arrays;
import java.util.stream;
public class Tdd {
    public static void main(String[] args) {
        byte[] bytes = {65,66,67};
        String s = new String(bytes);
        System.out.println(s);
        String string = " hello world";
        System.out.println(string.charAt(1));
        int a = string.codePointAt(1);
        System.out.println(a);
        System.out.println(string.offsetByCodePoints(1, 4));
        String s1 = string.substring(3);
        System.out.println(s1);
        String s2 = string.substring(1, 5);
        System.out.println(s2);
        System.out.println(s2.lastIndexOf("l"));
        System.out.println(string.startsWith("l",9));
        System.out.println(string.matches("hello World"));
        System.out.println(string.trim());
        String newString = string.replace("world", "people");
        System.out.println(newString);

        String rep = "hello people goodevening ";
        System.out.println(rep.replace("l", "o"));
        String names ="fahad,farsha,vignesh";
        String[] name = names.split("a");
        System.out.println(Arrays.toString(name));
    }
}