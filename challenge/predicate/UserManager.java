
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 
class User {
    private String name;
    private int age;
    private boolean isActive;

    public User(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}
// UserManager.java


public class UserManager {
    public static void main(String[] args) {
        // List of users
        List<User> users = Arrays.asList(
            new User("Alice", 25, true),
            new User("Bob", 35, false),
            new User("Charlie", 28, true),
            new User("David", 40, false),
            new User("Eve", 30, true)
        );

        // 1. Filter active users (isActive == true)
        List<User> activeUsers = users.stream()
            .filter(User::isActive) // Predicate to filter active users
            .collect(Collectors.toList());

        System.out.println("Active Users:");
        activeUsers.forEach(System.out::println);

        // 2. Check if there is any user over 30 years old (anyMatch)
        boolean hasUserOver30 = users.stream()
            .anyMatch(user -> user.getAge() > 30); // Predicate to check if any user is older than 30

        System.out.println("\nAny user over 30: " + hasUserOver30);

        // 3. Check if all users are above 20 years old (allMatch)
        boolean allUsersAbove20 = users.stream()
            .allMatch(user -> user.getAge() > 20); // Predicate to check if all users are older than 20

        System.out.println("All users above 20: " + allUsersAbove20);

        // 4. Check if no users are inactive (noneMatch)
        boolean noInactiveUsers = users.stream()
            .noneMatch(user -> !user.isActive()); // Predicate to check if no users are inactive

        System.out.println("No inactive users: " + noInactiveUsers);

        
    }
}
