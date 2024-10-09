import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

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

       List<Movie> movielist= Movie.getMovies().stream().filter(m-> m.getRating()>=8).collect(Collectors.toList());
       movielist.forEach(print-> System.out.println("above 8 rating"+print));
        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        List<Movie> after2000= Movie.getMovies().stream().filter(m-> m.getReleaseYear()>2000).collect(Collectors.toList());
        after2000.forEach(print-> System.out.println("after 2000 movies "+print));
        // 3. Get a distinct list of all genres available.
        // Code your solution here
         Movie.getMovies().stream().map(Movie::getGenre).distinct().forEach(print->System.out.println("duplicate removed"+print));

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        Movie.getMovies().stream().filter(m-> m.getGenre()=="Drama").forEach(print->System.out.println("genre drama movie"+print));
      
        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        Map<String, List<Movie>> groupby= Movie.getMovies().stream().collect(Collectors.groupingBy( Movie::getGenre));
        groupby.forEach((genre, movies) -> System.out.println("Genre: " + genre + " -> Movies: " + movies)
    );
        // Code your solution here

        // 7. Find the highest-rated movie.
        // Code your solution here
         Optional<Movie> movie= Movie.getMovies().stream().
         max(Comparator.comparing(Movie::getRating));
        System.out.println("highest rated"+movie);
        // 8. Get the average rating of all movies.
        // Code your solution here
        double average=Movie.getMovies().stream().collect(Collectors.averagingDouble(Movie::getRating));
        System.out.println("avarage rating "+ average);
        // 9. Find the longest movie (by duration).
        // Code your solution here
        Optional<Movie> longestduration= Movie.getMovies().stream(). max(Comparator.comparing(Movie::getDuration));
        System.out.println("duaration of  longets movie "+longestduration);
        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        List<Movie> betweentwonumbers=Movie.getMovies().stream().filter(m->m.getRating()>=7).filter(m->m.getRating()<=9).toList() ;       // 11. Get the top 5 highest-rated movies.
        betweentwonumbers.forEach(print->System.out.println("between 7 and 9"+betweentwonumbers));

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        boolean belowFive=Movie.getMovies().stream().anyMatch(n->n.getRating()<5);       // 11. Get the top 5 highest-rated movies.
        System.out.println("below 5 rating movies "+belowFive);

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        boolean aboveSix=Movie.getMovies().stream().anyMatch(n->n.getRating()>6);       // 11. Get the top 5 highest-rated movies.
        System.out.println("below 5 rating movies "+aboveSix);
        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        List<Movie> onemoreGenre=Movie.getMovies().stream().filter(m->m.getGenre().contains(",")).toList() ;
        System.out.println(" more than one genre"+onemoreGenre);
        // 15. Get the movie with the shortest duration.
        // Code your solution here
        Optional<Movie> shortestduration= Movie.getMovies().stream(). min(Comparator.comparing(Movie::getDuration));
        System.out.println("duaration of  minimum movie "+shortestduration);
        // 16. Find the most recent movie released.
        // Code your solution here
        Movie recentRelease= Movie.getMovies().stream(). max(Comparator.comparing(Movie::getReleaseYear)).orElse(null);
        System.out.println("recent relesed  movie "+recentRelease);
        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        Movie sorted = Movie.getMovies().stream().sorted(Comparator.comparing(Movie::getTitle)).findFirst().orElse(null);
        System.out.println("recent relesed alphabeticaly movie "+sorted);
        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        List<Movie> reversed=Movie.getMovies().stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).collect(Collectors.toList());
        System.out.println("reversed"+reversed);
        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        List<String> upperCase=Movie.getMovies().stream().map(m->m.getTitle().toUpperCase()).collect(Collectors.toList());
        System.out.println("to upper case"+ upperCase);
        // 20. Find the total duration of all movies combined.
        // Code your solution here
        int totalduration= Movie.getMovies().stream(). mapToInt(Movie::getDuration).sum();
        System.out.println("duaration of  all movie "+totalduration);

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
