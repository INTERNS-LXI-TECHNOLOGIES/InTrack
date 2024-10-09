
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import com.divisosofttech.*;

public class App {
        public static void main(String[] args) throws Exception {

                // First Set of Solutions
                levelOne();

                // Second Set (Optional) for those who are ready to push the limits
                // levelTwoOnlyForTheDareDevils();

        }

        static void levelOne() {
                // Dataset and code can be added here

                // Questions:

                // 1. Get a list of all movies with a rating of 8 or above.
                // Code your solution here

                List<Movie> movies = Movie.getMovies();

                List<Movie> highRatedMovies = movies.stream()
                                .filter(movie -> movie.getRating() >= 8.0)
                                .collect(Collectors.toList());

                highRatedMovies.forEach(System.out::println);

                // 2. Find all movies released after the year 2000.
                // Code your solution here

                List<Movie> moviesAfter2000 = movies.stream()
                                .filter(movie -> movie.getReleaseYear() > 2000)
                                .collect(Collectors.toList());

                moviesAfter2000
                                .forEach(movie -> System.out
                                                .println(movie.getTitle() + " Released in:" + movie.getReleaseYear()));

                // 3. Get a distinct list of all genres available.
                // Code your solution here

                List<String> distinctGenres = movies.stream()
                                .map(Movie::getGenre)
                                .distinct()
                                .collect(Collectors.toList());

                distinctGenres.forEach(System.out::println);

                // 4. Get a list of movies that belong to the genre 'Drama'.
                // Code your solution here

                List<Movie> listBelongsToDrama = movies.stream()
                                .filter(movie -> movie.getGenre() == "Drama")
                                .collect(Collectors.toList());
                listBelongsToDrama.forEach(
                                movie -> System.out.println(movie.getTitle() + " Genre is:" + movie.getGenre()));

                // 5. Get a map of all movies grouped by their genre.
                // Code your solution here

                Map<String, List<Movie>> moviesByGenre = movies.stream()
                                .collect(Collectors.groupingBy(Movie::getGenre));

                moviesByGenre.forEach((genre, movieList) -> {
                        System.out.println(genre + ":");
                        movieList.forEach(movie -> System.out.println(" - " + movie.getTitle()));
                });

                // 6. Count how many movies belong to each genre.
                // Code your solution here
                Map<String, Long> movieCountByGenre = movies.stream()
                                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));

                movieCountByGenre.forEach((genre, count) -> System.out.println(genre + ":" + count + " movies"));

                // 7. Find the highest-rated movie.
                // Code your solution here

                Movie highestRatedMovie = Movie.getMovies().stream()
                                .max(Comparator.comparingDouble(movie -> movie.getRating()))
                                .orElse(null);
                System.out.println(highestRatedMovie);

                // 8. Get the average rating of all movies.
                // Code your solution here
                double averageRating = movies.stream()
                                .collect(Collectors.averagingDouble(Movie::getRating));

                System.out.println("Average rating of all movies: " + averageRating);

                // 9. Find the longest movie (by duration).
                // Code your solution here

                Movie longestMovie = Movie.getMovies().stream()
                                .max(Comparator.comparingInt(movie -> movie.getDuration()))
                                .orElse(null);
                System.out.println(longestMovie);

                // 10. Find all movies with a rating between 7 and 9.
                // Code your solution here
                List<Movie> ratingbtw7and9Movies = Movie.getMovies().stream()
                                .filter(movie -> movie.getRating() > 7 && movie.getRating() < 9)
                                .collect(Collectors.toList());
                ratingbtw7and9Movies.stream().forEach(System.out::println);

                // 11. Get the top 5 highest-rated movies.
                // Code your solution here
                List<Movie> topRatedMovies = movies.stream()
                                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                                .limit(5)
                                .collect(Collectors.toList());

                System.out.println("Top 5 highest-rated movies:");
                topRatedMovies.forEach(System.out::println);

                // 12. Check if any movie has a rating below 5.
                // Code your solution here
                List<Movie> ratingbelow5Movies = Movie.getMovies().stream().filter(movie -> movie.getRating() < 5)
                                .collect(Collectors.toList());
                if (ratingbelow5Movies == null) {
                        ratingbelow5Movies.stream().forEach(System.out::println);
                } else {

                        System.out.println("There is no rating below 5");
                }

                // 13. Check if all movies are rated 6 or above.
                // Code your solution here
                boolean movieRatingAbove6 = Movie.getMovies().stream().allMatch(movie -> movie.getRating() > 6);
                System.out.println(movieRatingAbove6);

                // 14. Find all movies that belong to more than one genre.
                // Code your solution here
                List<Movie> moviesWithMultipleGenres = movies.stream()
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
                Optional<Movie> shortestMovie = movies.stream()
                                .min(Comparator.comparingInt(Movie::getDuration));

                shortestMovie.ifPresent(
                                movie -> System.out.println("The movie with the shortest duration is:" + movie));

                // 16. Find the most recent movie released.
                // Code your solution here
                Optional<Movie> mostRecentMovie = movies.stream()
                                .max(Comparator.comparingInt(Movie::getReleaseYear));

                mostRecentMovie.ifPresent(movie -> System.out.println("The most recent movie released is:" + movie));

                // 17. Find the first movie alphabetically by title.
                // Code your solution here
                Optional<Movie> firstAlphabeticalMovie = movies.stream()
                                .sorted(Comparator.comparing(Movie::getTitle))
                                .findFirst();

                firstAlphabeticalMovie.ifPresent(
                                movie -> System.out.println(
                                                "The first movie alphabetically by title is: " + movie.getTitle()));

                // 18. Get a list of movies sorted by their release year in descending order.
                // Code your solution here
                List<Movie> sortedMoviesByReleaseYear = movies.stream()
                                .sorted((m1, m2) -> Integer.compare(m2.getReleaseYear(), m1.getReleaseYear()))
                                .collect(Collectors.toList());

                System.out.println("Movies sorted by release year Descending order");
                sortedMoviesByReleaseYear.forEach(System.out::println);

                // 19. Get a list of all movie titles in uppercase.
                // Code your solution here
                List<String> movieTitlesInUppercase = movies.stream()
                                .map(movie -> movie.getTitle().toUpperCase())
                                .collect(Collectors.toList());

                System.out.println("Movie titles in uppercase:");
                movieTitlesInUppercase.forEach(System.out::println);

                // 20. Find the total duration of all movies combined.
                // Code your solution here
                int totalDuration = movies.stream()
                                .mapToInt(Movie::getDuration)
                                .sum();

                System.out.println("Total duration of all movies combined: " + totalDuration + " minutes");

        }

        static void levelTwoOnlyForTheDareDevils() {

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

                // 7. Get a map of movie titles and their respective durations in hours and
                // minutes.
                // Code your solution here

                // 8. Find all movies released in the last 10 years.
                // Code your solution here

                // 9. Get a list of movies sorted by rating, and for ties, by title
                // alphabetically.
                // Code your solution here

                // 10. Find the total number of genres that each movie belongs to.
                // Code your solution here

        }
}
