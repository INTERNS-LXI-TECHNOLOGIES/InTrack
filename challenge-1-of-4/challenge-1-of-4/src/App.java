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
        List<Movie> getMovies = Movie.getMovies();

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
        System.out.println("\t"+"List of all movies with a rating of 8 or above.");
        getMovies.stream().filter(movie -> movie.getRating()>=8).forEach(movie -> System.out.println(movie.getTitle()));

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        System.out.println("\t"+"All movies released after the year 2000");
        getMovies.stream().filter(movie -> movie.getReleaseYear()>2000)
                    .forEach(movie -> System.out.println("Movie Title : "+movie.getTitle()+"    Year : "+movie.getReleaseYear()));

        // 3. Get a distinct list of all genres available.
        // Code your solution here
        System.out.println("\t"+"Distinct list of all genres available");
        getMovies.stream().map(movie -> movie.getGenre()).distinct().forEach(movie -> System.out.println("Genres : "+movie));

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        System.out.println("\t"+"List of movies that belong to the genre 'Drama'.");
        getMovies.stream().filter(movie -> movie.getGenre().toLowerCase().equals("drama"))
            .forEach(movie -> System.out.println("Movie : "+movie.getTitle()+"Genre : "+movie.getGenre()));

        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        System.out.println("\t"+"Map of all movies grouped by their genre.");
        Map<String , List<Movie>> groupByGenre = getMovies.stream().collect(Collectors.groupingBy(Movie::getGenre));
        groupByGenre.forEach((genre,movie)->System.out.println("Genre : "+genre+"\n Movie : "+ movie));

        // 6. Count how many movies belong to each genre.
        // Code your solution here
        System.out.println("\t"+"movies belong to each genre.");
        Map<String , Long> movieBelongGenre = getMovies.stream().collect(Collectors.groupingBy(Movie::getGenre , Collectors.counting()));
        movieBelongGenre.forEach((genre,count)->System.out.println("Genre : "+genre +"   Number of Movies : "+count));

        // 7. Find the highest-rated movie.
        // Code your solution here
        System.out.println("\t"+"Highest-rated movie");
        Movie highestRatedMovie = getMovies.stream().max(Comparator.comparing(Movie::getRating)).orElse(null);
        System.out.println("Movie : "+highestRatedMovie.getTitle()+"   Rating : "+highestRatedMovie.getRating());

        // 8. Get the average rating of all movies.
        // Code your solution here
        System.out.println("\t"+"Average rating of all movies.");
        double averageRate = getMovies.stream().map(Movie::getRating).collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println(averageRate);
        //double averageRate1 = getMovies.stream().map()

        // 9. Find the longest movie (by duration).
        // Code your solution here
        System.out.println("\t"+"Longest movie (by duration).");
        Movie longestMovie = getMovies.stream().max(Comparator.comparing(Movie::getDuration)).orElse(null);
        System.out.println("Movie : "+longestMovie.getTitle()+"  Duration : "+longestMovie.getDuration());

        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        System.out.println("\t"+"All movies with a rating between 7 and 9.");
        getMovies.stream().filter(movie -> movie.getRating()>=7).filter(movie -> movie.getRating()<=9)
                .forEach(movie -> System.out.println("Movie : "+movie.getTitle() +"   Rating : "+movie.getRating()));

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        System.out.println("\t"+"Top 5 highest-rated movies.");
        getMovies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5)
            .forEach(movie -> System.out.println("Movie : "+movie.getTitle()+"   Rating : "+movie.getRating()));

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        System.out.println("\t"+"Movie has a rating below 5.");
        boolean anyMovieBelow5 = getMovies.stream().anyMatch(movie -> movie.getRating()<5);
        
        System.out.println(anyMovieBelow5);

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        System.out.println("\t"+"Check All movies are rated 6 or above.");
        boolean allMatch = getMovies.stream().allMatch(movie -> movie.getRating()>=6);
        System.out.println(allMatch);

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        System.out.println("\t"+"Movies that belong to more than one genre.");
        List<Movie> moreThanOneGenre = getMovies.stream().filter(movie -> movie.getGenre().contains(",")).toList();
        if(!moreThanOneGenre.isEmpty()){
            moreThanOneGenre.forEach(movie -> System.out.println(movie.getTitle()));
        }else{
            System.out.println("No movies found");
        }


        // 15. Get the movie with the shortest duration.
        // Code your solution here
        System.out.println("\t"+"Movie with the shortest duration.");
        Movie shortestDuration = getMovies.stream().min(Comparator.comparing(Movie::getDuration)).orElse(null);
        System.out.println("Movie : "+shortestDuration.getTitle()+"  Duration : "+shortestDuration.getDuration());

        // 16. Find the most recent movie released.
        // Code your solution here
        System.out.println("\t"+"Most recent movie released.");
        Movie recentReleased = getMovies.stream().max(Comparator.comparing(Movie::getReleaseYear)).orElse(null);
        System.out.println(recentReleased);
        

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        System.out.println("\t"+"first movie alphabetically by title.");
        Movie findFirstByAlphabetically = getMovies.stream().sorted(Comparator.comparing(Movie::getTitle)).findFirst().orElse(null);
        System.out.println("Movie : "+findFirstByAlphabetically.getTitle());
    
        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        System.out.println("\t"+"movies sorted by their release year in descending order.");
        getMovies.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
        .forEach(movie -> System.out.println("Movie : "+movie.getTitle()+"  ReleaseYear : "+movie.getReleaseYear()));

        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        System.out.println("\t"+"Movie titles in uppercase.");
        List<Movie> inUpperCase = getMovies.stream().filter(movie -> movie.getTitle().toUpperCase().equals(movie.getTitle())).toList();
        if(!inUpperCase.isEmpty()){
            inUpperCase.forEach(movie -> System.out.println(movie.getTitle()));
        }else{
            System.out.println("No movies found");
        }

        // 20. Find the total duration of all movies combined.
        // Code your solution here
        System.out.println("\t"+"Total duration of all movies combined.");
        int totalDuration = getMovies.stream().collect(Collectors.summingInt(Movie::getDuration));
        System.out.println(totalDuration);

        //System.out.println(getMovies.stream().count());
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
