import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.divisosofttech.Movie;
import java.util.*;
import java.time.LocalDate;


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

        List<String> rating=Movie.getMovies().stream().filter(n-> n.getRating()>8)
        .map(Movie::getTitle).collect(Collectors.toList());
        System.out.println("movies with a rating of 8 or above :"+rating);
       
        // 2. Find all movies released after the year 2000.
        // Code your solution here
       List<String> afterayear= Movie.getMovies().stream().filter(n->n.getReleaseYear()>2000).map(Movie::getTitle).collect(Collectors.toList());
       System.out.println("movies released after the year 2000:"+afterayear);
        

        // 3. Get a distinct list of all genres available.
        // Code your solution here
       List<String> distin= Movie.getMovies().stream().map(Movie::getGenre).distinct().collect(Collectors.toList());
       System.out.println("list of all genres available:"+distin);
        

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here

        List<String> dra= Movie.getMovies().stream().filter(n-> n.getGenre() == "Drama").map(Movie::getTitle).collect(Collectors.toList());
        System.out.println("movies that belong to the genre 'Drama':"+dra);

        // 5. Get a map of all movies grouped by their genre.

        // Code your solution here
Map<String, List<Movie>> grouped = Movie.getMovies().stream()
    .collect(Collectors.groupingBy(Movie::getGenre));

    
        // 6. Count how many movies belong to each genre.
        // Code your solution here
        
Map<String, Long> genreCounts = Movie.getMovies().stream()
    .collect(Collectors.groupingBy(Movie::getGenre,
     Collectors.counting()));


    System.out.println("Movies that belong to the genre "+genreCounts);

        // 7. Find the highest-rated movie.
        // Code your solution here

        Optional<String> higR= Movie.getMovies().stream().max(Comparator.comparingDouble (Movie::getRating)).map(Movie::getTitle);
        System.out.println("Highest rated movie:"+higR);

        // 8. Get the average rating of all movies.
        // Code your solution here
    double avg= Movie.getMovies().stream().mapToDouble(Movie::getRating).average().orElse(0.0);
        System.out.println("avg movie:"+avg);


        // 9. Find the longest movie (by duration).
        // Code your solution here
        Optional<Movie> longestMovie = Movie.getMovies().stream()
        .max(Comparator.comparingInt(Movie::getDuration));

longestMovie.ifPresent(movie -> System.out.println("Longest movie: " + movie.getTitle()));

    
        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        List<String> ratedMovies = Movie.getMovies().stream()
        .filter(movie -> movie.getRating() > 7 && movie.getRating() < 9).map(Movie::getTitle)
        .collect(Collectors.toList());

System.out.println("Movies with ratings between 7 and 9: " + ratedMovies);


        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        List<Movie> top5Movies = Movie.getMovies().stream()
        .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
        .limit(5)
        .collect(Collectors.toList());

System.out.println("Top 5 highest-rated movies: " + top5Movies);


        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        boolean hasLowRating = Movie.getMovies().stream()
        .anyMatch(movie -> movie.getRating() < 5);

System.out.println("Any movie with a rating below 5: " + hasLowRating);


        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        boolean ratedabove = Movie.getMovies().stream()
        .allMatch(movie -> movie.getRating() >= 6);

System.out.println("Any movie with a rating below 5: " + ratedabove);
        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        List<Movie> multiGenreMovies = Movie.getMovies().stream()
        .filter(m -> m.getGenre().contains(","))
        .collect(Collectors.toList());

if(!multiGenreMovies.isEmpty()){
    multiGenreMovies.forEach(System.out::println);
    }
    else{
        System.out.println("no movie found");
    }


        // 15. Get the movie with the shortest duration.
        // Code your solution here
        Optional<String> shortestMovie = Movie.getMovies().stream()
        .min(Comparator.comparingInt(Movie::getDuration)).map(Movie::getTitle);
System.out.println(shortestMovie);


        // 16. Find the most recent movie released.
        // Code your solution here
        Movie recentMovies = Movie.getMovies().stream()
        .sorted(Comparator.comparingDouble(Movie::getReleaseYear).reversed())
        .findAny().orElse(null);
        System.out.println(recentMovies);

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        Movie recentM = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getTitle))
        .findFirst().orElse(null);
        System.out.println(recentM);
        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        List<Movie> release = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).toList();
        System.out.println(recentMovies);
        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        List<String> nameUpper = Movie.getMovies().stream()
        .map(movie->movie.getTitle().toUpperCase()).toList();
        System.out.println("the list of movies in uppercase" +nameUpper);
        // 20. Find the total duration of all movies combined.
        // Code your solution here
       int sum= Movie.getMovies().stream().mapToInt(Movie::getDuration).sum();
       System.out.println(sum);

    }


    static void levelTwoOnlyForTheDareDevils(){

         // Complex Questions:

        // 1. Find the top 3 highest-rated movies for each genre.
        // Code your solution here
        
        Map<String, List<Movie>> top3MoviesByGenre =Movie. getMovies().stream()
    .collect(Collectors.groupingBy(Movie::getGenre)) // Group by genre
    .entrySet().stream()
    .collect(Collectors.toMap(
        Map.Entry::getKey, // Genre as key
        entry -> entry.getValue().stream() // Stream of Movies in each genre
            .sorted(Comparator.comparing(Movie::getRating).reversed()) // Sort by rating in descending order
            .limit(3) // ++Take top 3 movies
            .toList()) // Collect top 3 movies into a List
    );

// Printing the results
System.out.println("1 : Top 3 Movies in Each Genre:");
top3MoviesByGenre.forEach((genre, movieList) -> {
    System.out.println("Genre: " + genre);
    movieList.forEach(movie -> 
        System.out.println(" - " + movie.getTitle() + " (Rating: " + movie.getRating() + ")" +" \n"  ));
});
 
    

       
    

        // 2. Get a map of the average rating of movies per genre.
        // Code your solution 

        Map<String,Double> averagratingmovies=Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre,Collectors.averagingDouble(Movie::getRating)));
        System.out.println("2:average rating of movies per genre");
        averagratingmovies.forEach((genr,avgrating)->
        System.out.println("genre:" +genr +  ",averageRating:" + avgrating +"\n"));

      //  Map<String, Double> genreCounts = Movie.getMovies().stream()
    //.collect(Collectors.groupingBy(Movie::getGenre, Collectors.average()));

        // 3. Find the movie with the maximum duration in each genre.
        // Code your solution here
        Map<String, Optional<Movie>> maxDurationByGenre = Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre, // Group by genre
            Collectors.reducing((movie1, movie2) -> 
                movie1.getDuration() > movie2.getDuration() ? movie1 : movie2))); 

                System.out.println("maximum duration in each genre :");
                maxDurationByGenre.forEach((genre,movieOptional)->
                    movieOptional.ifPresent(movie -> 
                    System.out.println("genre:"+genre + "[ Movie : "+movie.getTitle() +", duration:"+ movie.getDuration() +"minutes" +"\n")));

         // 4. Get a list of movies that have both 'Action' and 'Drama' as genres.
        // Code your solution here
        
        List<String> bothAaNdD= Movie.getMovies().stream().filter(movie->movie.getGenre() == "Drama" && movie. getGenre()=="Action").map(Movie::getTitle).collect(Collectors.toList());
        System.out.println("movies that belong to the genre both 'Drama' and action:"+bothAaNdD);


        // 5. Find the second highest-rated movie.
        // Code your solution here
        Movie sortedMovies = Movie.getMovies().stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed()).skip(1).findFirst().orElse(null);
                System.out.println("second higest rate movie :" +sortedMovies);

        // 6. Get a list of movies whose title starts with the letter 'A'.
        // Code your solution here
        List<Movie> moviesStartingWithA = Movie.getMovies().stream()
        .filter(movie -> movie.getTitle().startsWith("A")) // Check if title starts with 'A'
        .collect(Collectors.toList());
        System.out.println("Movies whose titles start with 'A':"  +moviesStartingWithA);

        // 7. Get a map of movie titles and their respective durations in hours and minutes.
        // Code your solution here
        Map<String, String> hrsMints = Movie.getMovies().stream()
        .collect(Collectors.toMap(Movie::getTitle, movie -> {
            int hours = movie.getDuration() / 60;
            int minutes = movie.getDuration() % 60;
            return hours + " hr " + minutes + " min";
        }));

hrsMints.forEach((title, duration) -> 
        System.out.println("Movie: " + title + " - Duration: " + duration)
);


        // 8. Find all movies released in the last 10 years.
        // Code your solution here
        int currentYear = LocalDate.now().getYear();

        // Filter movies released in the last 10 years
        List<Movie> moviesInLast10Years = Movie.getMovies().stream()
            .filter(movie -> movie.getReleaseYear() >= (currentYear - 10))
            .collect(Collectors.toList());

        // Print the result
        System.out.println("Movies released in the last 10 years:");
        moviesInLast10Years.forEach(movie -> 
            System.out.println(movie.getTitle() + " (" + movie.getReleaseYear() + ")"));

        // 9. Get a list of movies sorted by rating, and for ties, by title alphabetically.
        // Code your solution here

        List<Movie> sortedByRatingAlphabetically = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getRating).reversed()
            .thenComparing(Movie::getTitle)) // Combine the two comparators
        .collect(Collectors.toList());        
        sortedByRatingAlphabetically.forEach(movie->System.out.println(movie.getTitle()+" Rating"+movie.getRating()+"\n"));

        // 10. Find the total number of genres that each movie belongs to.
        // Code your solution here
         
        Map<String, Integer> genresCountPerMovie = Movie.getMovies().stream()
            .collect(Collectors.toMap(
                Movie::getTitle, // Use movie title as the key
                movie -> movie.getGenre().split(",").length // Split genres by comma and count them
            ));

        // Print the result
        System.out.println("Number of genres for each movie:");
        genresCountPerMovie.forEach((title, genreCount) -> {
            System.out.println(title + " belongs to " + genreCount + " genres."+"\n");
        });

        
}
}
