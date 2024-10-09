import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
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
        List<Movie> filteredMovies = Movie.getMovies().stream()
        .filter(m -> m.getRating() <= 8)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("1)list of all movies with a rating of 8 or above");
        filteredMovies.forEach(System.out::println);

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        List<Movie> after2000 = Movie.getMovies().stream()
        .filter(m -> m.getReleaseYear() >=2000)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("2) all movies released after the year 2000");
        after2000.forEach(System.out::println);
        // 3. Get a distinct list of all genres available.
        // Code your solution here
        List<String> distinctList = Movie.getMovies().stream()
        .map(Movie::getGenre)
        .distinct().collect(Collectors.toList());
        System.out.println("\n");
        System.out.println(" 3) distinct list of all genres available");
        distinctList.forEach(System.out::println);
        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        List<Movie> dramaMovies = Movie.getMovies().stream()
        .filter(m -> m.getGenre().contains("Drama"))
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println(" 4) list of movies that belong to the genre 'Drama'");
        dramaMovies.forEach(System.out::println);
        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        Map<String, List<Movie>> groupedGenres = Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println("\n");
        System.out.println(" 5) a map of all movies grouped by their genre");
groupedGenres.forEach((genre, movies) -> System.out.println("Genre: " + genre + ", Movies: " + movies));

        // 6. Count how many movies belong to each genre.
        // Code your solution here
        Map<String, Long> genreCounts = Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("\n");
        System.out.println(" 6) Count of movies belong to each genre");
        genreCounts.forEach((genre, movies) -> System.out.println("Genre: " + genre + ", Movies: " + movies));

        // 7. Find the highest-rated movie.
        // Code your solution here
        Optional<Movie> highestRatedMovies = Movie.getMovies().stream()
        .max(Comparator.comparing(Movie::getRating));
        System.out.println("\n");
        System.out.println("7) highest-rated movie");
        System.out.println(highestRatedMovies);
            
        // 8. Get the average rating of all movies.
        // Code your solution here
        double averageRating = Movie.getMovies().stream()
        .mapToDouble(Movie::getRating)
        .average()
        .orElse(0.0);
       // averageRating.forEach(System.out::println);
       System.out.println("\n");
System.out.println("8) Average rating: " + averageRating);

        // 9. Find the longest movie (by duration).
        // Code your solution here
        Movie longestMovie = Movie.getMovies().stream()
        .max(Comparator.comparingInt(Movie::getDuration))
        .orElse(null);
        System.out.println("\n");
System.out.println("9) the longest movie (by duration)");
        if (longestMovie != null) {
            System.out.println(longestMovie);
        }else{            System.out.println("No movies found");
        }
// 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
            List<Movie> ratingbetween7and9 = Movie.getMovies().stream()
            .filter(m->m.getRating()>=7 && m.getRating()<=9)
            .collect(Collectors.toList()); 
            System.out.println("\n");
           System.out.println("10) all movies with a rating between 7 and 9");
            ratingbetween7and9.forEach(System.out::println);

// 11. Get the top 5 highest-rated movies.
        // Code your solution here
        List<Movie>top5Movies = Movie.getMovies().stream()
        .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
        .limit(5)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("11) top 5 highest-rated movies" );
        top5Movies.forEach(System.out::println);

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        List<Movie> ratingBelow5 = Movie.getMovies().stream()
        .filter(movie -> movie.getRating() < 5)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("12)movie has a rating below 5" );
        if (!ratingBelow5.isEmpty()) {
            ratingBelow5.forEach(System.out::println);
        } else {
            System.out.println("No movies with a rating below 5 found.");
        }
        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        List<Movie> ratingabove6 = Movie.getMovies().stream()
        .filter(movie -> movie.getRating() > 6)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("13)movie has a rating below 5" );
        if (!ratingabove6.isEmpty()){
            System.out.println("all movies are rated 6 or above");
        
        }else{System.out.println("No,some movies are below 6 rating");}

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        List<Movie> multiGenreMovies = Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre))
        .values()
        .stream()
        .filter(movies -> movies.size() > 1)
        .flatMap(List::stream)
        .collect(Collectors.toList());
        System.out.println("\n");
        System.out.println("14) movies that belong to more than one genre" );
        multiGenreMovies.forEach(System.out::println);
       
        // 15. Get the movie with the shortest duration.
        // Code your solution here
        Movie  shortestDuration = Movie.getMovies().stream()
        .min(Comparator.comparingDouble(Movie::getDuration))
        .orElse(null);  
        System.out.println("\n");
        System.out.println("15) movie with the shortest duration");  
        System.out.println(shortestDuration);  

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        Movie firstMovie = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getTitle))
        .findFirst()
        .orElse(null);
        System.out.println("\n");
        System.out.println("16) first movie alphabetically by title");  
        if (firstMovie != null) {
            System.out.println(firstMovie); // Print the entire Movie object
        } else {
            System.out.println("No movies found.");
        }        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
List<Movie> descendingOrder = Movie.getMovies().stream().
sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
.collect(Collectors.toList());  
System.out.println("\n");
System.out.println("17) movies sorted by their release year in descending order"); 
descendingOrder.forEach(System.out::println);

// 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        List<String> upperCase = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getTitle))
        .map(Movie::getTitle) // Explicitly specify the return type as String
        .collect(Collectors.toList());
        System.out.println("\n");
System.out.println("18)list of all movie titles in uppercase."); 
        upperCase.forEach(System.out::println);
        // 20. Find the total duration of all movies combined.
        // Code your solution here

        int totalDuration = Movie.getMovies().stream()
        .sorted(Comparator.comparingInt(Movie::getDuration))
        .mapToInt(Movie::getDuration)
        .sum();
        System.out.println("\n");
        System.out.println("19)the total duration of all movies combined");  
        System.out.println("Total duration: " + totalDuration);


}


    static void levelTwoOnlyForTheDareDevils(){

         // Complex Questions:
         Movie secondHighestMovie = Movie.getMovies().stream()
         .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
         .skip(1)
         .findFirst()
         .orElse(null);
         System.out.println("\n");
         System.out.println("20)the second highest-rated movie"); 
         System.out.println(secondHighestMovie);
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
