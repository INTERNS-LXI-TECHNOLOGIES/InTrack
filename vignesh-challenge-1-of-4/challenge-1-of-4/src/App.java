import com.divisosofttech.Movie;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
        List<Movie> ratingAbove8 = Movie.getMovies().stream().filter(n->n.getRating() >=8).collect(Collectors.toList());
        ratingAbove8.stream().map(Movie::getTitle).forEach(System.out::println);

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        Movie.getMovies().stream().filter(n->n.getReleaseYear() >=2000).map(Movie::getTitle).forEach(System.out::println);
        // 3. Get a distinct list of all genres available.
        // Code your solution here
        List<String> distinctGeneres = Movie.getMovies().stream().map(Movie::getGenre).distinct().collect(Collectors.toList());
        System.out.println(distinctGeneres);
        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        List<Movie> genreMovies = Movie.getMovies().stream().filter(n->n.getGenre()=="Drama").collect(Collectors.toList());
        genreMovies.stream().map(Movie::getTitle).forEach(System.out::println);
        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        Map<String,List<Movie>> groupedByGenre = Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre));
        groupedByGenre.forEach((genre, movies) -> { System.out.println("Genre: " + genre); movies.forEach(movie -> System.out.println(" - " + movie.getTitle()));
        });
        // 6. Count how many movies belong to each genre.
        // Code your solution here
        Map<String, Long> movieCountByGenre = Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println(movieCountByGenre);

        // 7. Find the highest-rated movie.
        // Code your solution here
        Optional<String> highestRatedMovie = Movie.getMovies().stream().max(Comparator.comparingDouble(Movie::getRating)).map(Movie::getTitle);
        System.out.println(highestRatedMovie);

        // 8. Get the average rating of all movies.
        // Code your solution here
        OptionalDouble averageRatedMovie = Movie.getMovies().stream().mapToDouble(Movie::getRating).average();
        System.out.println(averageRatedMovie);

        // 9. Find the longest movie (by duration).
        // Code your solution here
        Optional<String> longestMovie = Movie.getMovies().stream().max(Comparator.comparingInt(Movie::getDuration)).map(Movie::getTitle);
        System.out.println(longestMovie);

        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        List<Movie> ratedMoviebw = Movie.getMovies().stream().filter(n->n.getRating()>=7&&n.getRating()<=9).collect(Collectors.toList());
        ratedMoviebw.stream().map(Movie::getTitle).forEach(System.out::println);

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        List<Movie> top5Rated = Movie.getMovies().stream().sorted(Comparator.comparingDouble(Movie::getRating).reversed()).limit(5).toList();
        top5Rated.stream().map(Movie::getTitle).forEach(System.out::println);
        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        boolean anymatch = Movie.getMovies().stream().anyMatch(n->n.getRating()<5);
        System.out.println(anymatch);

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        boolean allmatch = Movie.getMovies().stream().allMatch(n->n.getRating()>=6);
        System.out.println(allmatch);

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        List<Movie> moreThanonegenre = Movie.getMovies().stream().filter(n->n.getGenre().contains(",")).toList();
        moreThanonegenre.stream().map(Movie::getTitle).forEach(System.out::println);

        // 15. Get the movie with the shortest duration.
        // Code your solution here
        Movie shortestDuration = Movie.getMovies().stream().min(Comparator.comparingInt(Movie::getDuration)).orElse(null);
        System.out.println(shortestDuration.getTitle());

        // 16. Find the most recent movie released.
        // Code your solution here
        Movie recentMov = Movie.getMovies().stream().max(Comparator.comparingInt(Movie::getReleaseYear)).orElse(null);
        System.out.println(recentMov.getTitle());

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        Movie firstMovAlph = Movie.getMovies().stream().sorted(Comparator.comparing(Movie::getTitle)).findFirst().orElse(null);
        System.out.println(firstMovAlph.getTitle());

        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        List<Movie> releaseYearIndesce = Movie.getMovies().stream().sorted(Comparator.comparingInt(Movie::getReleaseYear).reversed()).toList();
        releaseYearIndesce.stream().map(Movie::getTitle).forEach(System.out::println);
        
        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        List<String> titleInUc = Movie.getMovies().stream().map(Movie::getTitle).map(String::toUpperCase).toList();
        System.out.println(titleInUc);
        // 20. Find the total duration of all movies combined.
        // Code your solution here
        /*int totalDuration = Movie.getMovies().stream().mapToInt(Movie::getDuration).sum();
        System.out.println(totalDuration);*/
        int totalDuration = Movie.getMovies().stream().collect(Collectors.summingInt(Movie::getDuration));
        System.out.println(totalDuration);
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
