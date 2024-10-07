/*import java.util.stream.Stream;


public class SupplierExample {
    public static void main(String[] args) {
        // Supplier that generates a random integer
        //Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);

        // Create an infinite stream of random integers
        Stream<Integer> randomNumbers = Stream.generate(()-> (int)(Math.random()*100));

        // Limit the stream to 10 elements and print them
        randomNumbers.limit(10).forEach(System.out::println);
    }
}*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}

public class SupplierStreamExample {
    public static void main(String[] args) {
        // 1. Supplier to generate a random Student
        Supplier<Student> studentSupplier = () -> {
            // Random name from a list
            List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva");
            String name = names.get((int) (Math.random() * names.size()));

            // Random score between 50 and 100
            int score = (int) (Math.random() * 50 + 50);

            return new Student(name, score);
        };

        // 2. Stream.generate(Supplier) to create a stream of random students
        Stream<Student> studentStream = Stream.generate(studentSupplier).limit(10);

        // 3. Filter students who scored above 70
        List<Student> filteredStudents = studentStream
            .filter(student -> student.getScore() > 70)  // Filter students with score > 70
            .collect(Collectors.toCollection(ArrayList::new));  // Collect results into an ArrayList

        System.out.println("Filtered Students (Score > 70):");
        filteredStudents.forEach(System.out::println);

        // 4. Create another stream to calculate average score and collect names
        // Use the same Supplier to generate students
        Stream<Student> studentStreamForAverage = Stream.generate(studentSupplier).limit(10);

        List<String> studentNames = studentStreamForAverage
            .map(Student::getName)  // Extract names
            .collect(Collectors.toList());  // Collect names into a List

        System.out.println("\nStudent Names:");
        System.out.println(studentNames);

        // 5. Use a Supplier to collect the names into a LinkedList
        Stream<Student> studentStreamForCollection = Stream.generate(studentSupplier).limit(10);
        
        List<Student> studentList = studentStreamForCollection
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("\nStudents collected into ArrayList:");
        studentList.forEach(System.out::println);
    }
}

