import java.util.List;

public class Tdd{
    public static void main(String[] args) {
        List<Integer> integers = List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10);

        integers.stream().map(Math::abs).forEach(System.out::println);

    }
}