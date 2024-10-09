import com.divisosofttech.Movie;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        System.out.println("\n" + "\n" + "1. List of all movies with rating 8 or above");

        List<Movie> ratingAbove8Movies = Movie.getMovies().stream().
                                                             filter(movie-> movie.getRating() > 8).
                                                             collect(Collectors.toList());
        ratingAbove8Movies.stream().
                             forEach(System.out::println);

        // 2. Find all movies released after the year 2000.
        // Code your solution here

        System.out.println("\n" + "\n" + "2. All movies released in tear 2000");

        List<Movie> moviesReleasdAfter2000 = Movie.getMovies().stream().
                                                                 filter(movie -> movie.getReleaseYear() > 2000).
                                                                 collect(Collectors.toList());
        moviesReleasdAfter2000.stream().
                                 forEach(System.out::println); 

        // 3. Get a distinct list of all genres available.
        // Code your solution here

        System.out.println("\n" + "\n" + "3. Distinct list of all genre available");

        
        List<String> allGenreAvailable = Movie.getMovies().stream().
                                                             map(Movie::getGenre).
                                                             distinct().
                                                             collect(Collectors.toList());
        allGenreAvailable.stream().
                             forEach(System.out::println);


        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here

        System.out.println("\n" + "\n" + "4. List of movies that belong to genre Drama");


        List<Movie> dramaMovies = Movie.getMovies().stream().
                                                     filter(movie-> movie.getGenre() == "Drama").
                                                     collect(Collectors.toList());
        dramaMovies.stream().
                     forEach(System.out::println);

        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here

        System.out.println("\n" + "\n" + "5. Movies in each genre");
        


        Map<String, List<Movie>> moviesByGenre = Movie.getMovies().stream()
                                                                  .collect(Collectors.groupingBy(Movie::getGenre));

        moviesByGenre.forEach((genre, movieList) -> {
                                                      System.out.println(genre + ":");
                                                      movieList.forEach(movie -> System.out.println(" - " + movie.getTitle()));
                                                                                        });


        // 6. Count how many movies belong to each genre.
        // Code your solution here

        System.out.println("\n" + "\n" + "6. Number of movies in each genre");


        Map<String, Long> movieCountByGenre = Movie.getMovies().stream()
                                                                 .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));

        movieCountByGenre.forEach((genre, count) -> System.out.println(genre + ":" + count+"movies"));

        // 7. Find the highest-rated movie.
        // Code your solution here

        System.out.println("\n" + "\n" +"7. Highest rated Movie");


        Movie highestRatedMovie = Movie.getMovies().stream().
                                                     max(Comparator.comparingDouble(movie-> movie.getRating())).
                                                     orElse(null);
        System.out.println(highestRatedMovie);

        // 8. Get the average rating of all movies.
        // Code your solution here

        System.out.println("\n" + "\n" +"8. Avarage rating of all movies");


        Double avarageRating = Movie.getMovies().stream()
                                                  .collect(Collectors.averagingDouble(movie-> movie.getRating()));
        System.out.println(avarageRating);

        // 9. Find the longest movie (by duration).
        // Code your solution here

        System.out.println("\n" + "\n" +"9. Longest durated movie");
        

        Movie longestMovie = Movie.getMovies().stream().
                                                  max(Comparator.comparingInt(movie-> movie.getDuration())).
                                                  orElse(null);
        System.out.println(longestMovie);



        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here

        System.out.println("\n" + "\n" +"10. All movies rated between 7 and 9");


        List<Movie> ratingbtw7and9Movies = Movie.getMovies().stream().
                                                                 filter(movie-> movie.getRating() > 7 && movie.getRating() < 9)
                                                                 .collect(Collectors.toList());
        ratingbtw7and9Movies.stream().
                               forEach(System.out::println);

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here

        System.out.println("\n" + "\n" +"11. Top 5 rated movies");


        List<Movie> topRatedMovies = Movie.getMovies().stream()
                                                          .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                                                          .limit(5)
                                                          .collect(Collectors.toList());

        topRatedMovies.forEach(System.out::println);

        // 12. Check if any movie has a rating below 5.
        // Code your solution here


        System.out.println("\n" + "\n" +"12. Checking if any movie is rated below 5");
        


        boolean ismoviesHasRatingBelow5 = Movie.getMovies().stream()
                                                            .anyMatch(movie-> movie.getRating() < 5);
        System.out.println(ismoviesHasRatingBelow5);



        // 13. Check if all movies are rated 6 or above.
        // Code your solution here

        System.out.println("\n" + "\n" +"13. Checking if all movies are rated 6 or above");


        boolean movieRatingAbove6 = Movie.getMovies().stream().
                                                       allMatch(movie-> movie.getRating() > 6);
        System.out.println(movieRatingAbove6);


        // 14. Find all movies that belong to more than one genre.
        // Code your solution here

        
        System.out.println("\n" + "\n" +"14. Movies that belong to more than one genre");
        

        List<Movie> moviesWithMultipleGenres = Movie.getMovies().stream()
                                                          .filter(movie -> movie.getGenre().contains(","))
                                                          .collect(Collectors.toList());

       if (moviesWithMultipleGenres.isEmpty()) {
       System.out.println("No movies with more than one genre.");
       } else {

        System.out.println("Movies with more than one genre:");
        moviesWithMultipleGenres.forEach(System.out::println);
        }

        // 15. Get the movie with the shortest duration.
        // Code your solution here
        
        System.out.println("\n" + "\n" +"15. Movie with shortest Duration");
        

        Movie shortestMovie = Movie.getMovies().stream().
                                                  min(Comparator.comparingInt(movie-> movie.getDuration())).
                                                  orElse(null);
        System.out.println(shortestMovie);

        // 16. Find the most recent movie released.
        // Code your solution here

        System.out.println("\n" + "\n" +"16. Most recent Movie released");


        Movie recentReleaseMovie = Movie.getMovies().stream().
                                                  max(Comparator.comparingInt(movie-> movie.getReleaseYear())).
                                                  orElse(null);
        System.out.println(recentReleaseMovie);

        // 17. Find the first movie alphabetically by title.
        // Code your solution here

        System.out.println("\n" + "\n" +"17. First movie Alphabetically by Title");
        

        Movie alphabetOrder = Movie.getMovies().stream()
                                                 .sorted(Comparator.comparing(movie -> movie.getTitle()))
                                                 .findFirst()
                                                 .orElse(null);

        System.out.println(alphabetOrder);
        
        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here

        System.out.println("\n" + "\n" +"18. List of all movies sorted by their release year in descending order ");

        List<Movie> decendingOrder = Movie.getMovies().stream()
                                                         .sorted(Comparator.comparingInt(movie-> movie.getReleaseYear()))
                                                         .collect(Collectors.toList());
        decendingOrder.forEach(System.out::println);

        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here

        System.out.println("\n" + "\n" +"19. List of all movies title to UpperCase");

        List<String> uppercaseList = Movie.getMovies().stream()
                                                         .map(movie-> movie.getTitle().toUpperCase())
                                                         .collect(Collectors.toList());
        uppercaseList.stream().forEach(System.out::println);


        // 20. Find the total duration of all movies combined.
        // Code your solution here

        System.out.println("\n" + "\n" +"20. Duration of all movies Combined");

        int combinedDuration = Movie.getMovies().stream().mapToInt(movie-> movie.getDuration()).sum();

        System.out.println(combinedDuration);

    
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
