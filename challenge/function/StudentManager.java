import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

 class Student {
    private String name;
    private int age;
    private List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", subjects=" + subjects + "}";
    }
}
// StudentManager.java


public class StudentManager {
    public static void main(String[] args) {
        // List of students
        List<Student> students = Arrays.asList(
            new Student("Alice", 20, Arrays.asList("Math", "Physics")),
            new Student("Bob", 22, Arrays.asList("Math", "Chemistry")),
            new Student("Charlie", 20, Arrays.asList("Biology", "Chemistry")),
            new Student("David", 23, Arrays.asList("Physics", "Math")),
            new Student("Eva", 21, Arrays.asList("Math", "Physics"))
        );

        // 1. Use map() to extract the names of students and convert to uppercase
        List<String> upperCaseNames = students.stream()
            .map(student -> student.getName().toUpperCase()) // Function<Student, String> to map to uppercase names
            .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);

        // 2. Use flatMap() to get all distinct subjects from students
        List<String> distinctSubjects = students.stream()
            .flatMap(student -> student.getSubjects().stream()) // Function<Student, Stream<String>> to flatten subjects
            .distinct() // Remove duplicates
            .collect(Collectors.toList());

        System.out.println("Distinct Subjects: " + distinctSubjects);

        // 3. Use distinct() to get distinct students (based on name)
        List<Student> distinctStudents = students.stream()
            .distinct() // Since no two students are equal (without overriding equals), distinct() would be ineffective unless comparing based on specific criteria
            .collect(Collectors.toList());

        System.out.println("Distinct Students: " + distinctStudents);

        // 4. Use groupingBy() to group students by age
        Map<Integer, List<Student>> studentsGroupedByAge = students.stream()
            .collect(Collectors.groupingBy(Student::getAge)); // Function<Student, Integer> to group by age

        System.out.println("Students Grouped By Age:");
        studentsGroupedByAge.forEach((age, studentList) -> {
            System.out.println("Age: " + age);
            studentList.forEach(System.out::println);
        });

        // 5. Use collect() with joining() to combine student names into a single string
        String joinedNames = students.stream()
            .map(Student::getName) // Map each student to their name
            .collect(Collectors.joining(", ")); // Join names with commas

        System.out.println("Joined Names: " + joinedNames);
    }
}
