import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import com.divisosofttech.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        
        // First Set of Solutions
        levelOne() ;


        // Second Set (Optional) for those who are ready to push the limits
        levelTwoOnlyForTheDareDevils();
        
    }





    static void levelOne(){
        // Dataset and code can be added here

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
        Movie.getMovies().stream().filter(m -> m.getRating()>=8).forEach(System.out::println);

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        System.out.println("  ");
        Movie.getMovies().stream().filter(m -> m.getReleaseYear()>2000).forEach(System.out::println);

        // 3. Get a distinct list of all genres available.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Get a distinct list of all genres available.");
        List<String> listGenres=Movie.getMovies().stream().map(movie -> movie.getGenre()).distinct().toList();
        System.out.println(listGenres);

        

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        System.out.println("  ");
        Movie.getMovies().stream().filter(m -> m.getGenre().equals("Drama")).forEach(System.out::println);



        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Get a map of all movies grouped by their genre");
        Map<String ,List<Movie>> movvi = Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre));
        movvi.forEach((key,value) -> System.out.println("Genre  : "+key+" Movie : "+value));


        // 6. Count how many movies belong to each genre.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Count how many movies belong to each genre");
        Map<String ,Long> m3=Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));
        m3.forEach((key,value) -> System.out.println("Genre  : "+key+" Movie : "+value));
        
        
        // 7. Find the highest-rated movie.
        // Code your solution here
        Movie m=Movie.getMovies().stream().max((m1,m2) -> Double.compare(m1.getRating(), m2.getRating())).orElse(null);
        System.out.println(m);

        // 8. Get the average rating of all movies.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Get the average rating of all movies");
       Double average= Movie.getMovies().stream().collect(Collectors.averagingDouble(Movie::getRating));
        System.out.println(average);

        // 9. Find the longest movie (by duration).
        // Code your solution here
        System.out.println("  ");
        Movie mo=Movie.getMovies().stream().max((m1,m2) -> Integer.compare(m1.getDuration(),m2.getDuration())).orElse(null);
        System.out.println(mo);

        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Find all movies with a rating between 7 and 9.");
        Movie.getMovies().stream().filter(k -> k.getRating()>=7 && k.getRating()<=9).forEach(System.out::println);

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Get the top 5 highest-rated movies.");
        Movie.getMovies().stream().sorted(Comparator.comparingDouble(Movie::getRating).reversed()).limit(5).forEach(System.out::println);

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        System.out.println("  ");
        System.out.println("Check if any movie has a rating below 5");
        boolean c = Movie.getMovies().stream().anyMatch(movi -> movi.getRating()<5);
        
        System.out.println(c);
        

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        System.out.println(" Check if all movies are rated 6 or above ");
        boolean v=Movie.getMovies().stream().allMatch(movi -> movi.getRating()>=6);
        System.out.println(v);
        
        

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        System.err.println(" ");
        System.out.println("Find all movies that belong to more than one genre");
        Movie.getMovies().stream().filter(x ->x.getGenre().contains(",")).forEach(System.out::println);

        // 15. Get the movie with the shortest duration.
        // Code your solution here
        System.out.println(" ");
        System.out.println("Get the movie with the shortest duration");
        Movie shortestDuration=Movie.getMovies().stream().min((m5,m6) -> Integer.compare(m5.getDuration(), m6.getDuration())).orElse(null);
        System.out.println(shortestDuration);

        // 16. Find the most recent movie released.
        // Code your solution here
        System.out.println(" ");
        System.out.println("Find the most recent movie released.");
       Movie recentMovie= Movie.getMovies().stream().max(Comparator.comparing(Movie::getReleaseYear)).orElse(null);
       System.out.println(recentMovie);

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        System.out.println(" ");
        System.out.println("Find the first movie alphabetically by title");
        Movie m5=Movie.getMovies().stream().sorted(Comparator.comparing( n -> n.getTitle())).findFirst().orElse(null);
        System.out.println(m5);
        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        System.out.println(" ");
        System.out.println("list of movies sorted by their release year in descending order");
       List<Movie> m7= Movie.getMovies().stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).toList();
       System.out.println(m7);

        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        System.out.println(" ");
        System.out.println("Get a list of all movie titles in uppercase:");
        List<String> movi=Movie.getMovies().stream().map(x -> x.getTitle().toUpperCase()).toList();
        System.out.println(movi);

        // 20. Find the total duration of all movies combined.
        // Code your solution here
        System.out.println(" ");
        System.out.println("Find the total duration of all movies combined");
        int movv2 = Movie.getMovies().stream().mapToInt( movii -> movii.getDuration()).sum();
        System.out.println(movv2);

    }


    static void levelTwoOnlyForTheDareDevils(){

         // Complex Questions:

        // 1. Find the top 3 highest-rated movies for each genre.
        // Code your solution here

        // 2. Get a map of the average rating of movies per genre.
        // Code your solution here

        // 3. Find the movie with the maximum duration in each genre.
        // Code your solution here

        // 4. Get a list of movies that have both 'Action' and 'Drama' as genres.
        // Code your solution here

        // 5. Find the second highest-rated movie.
        // Code your solution here

        // 6. Get a list of movies whose title starts with the letter 'A'.
        // Code your solution here

        // 7. Get a map of movie titles and their respective durations in hours and minutes.
        // Code your solution here

        // 8. Find all movies released in the last 10 years.
        // Code your solution here

        // 9. Get a list of movies sorted by rating, and for ties, by title alphabetically.
        // Code your solution here

        // 10. Find the total number of genres that each movie belongs to.
        // Code your solution here

    }
}
