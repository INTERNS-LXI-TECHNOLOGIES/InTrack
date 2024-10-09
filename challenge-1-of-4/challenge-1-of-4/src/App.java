
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

        List <Movie> movies = Movie.getMovies();

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
        System.out.println("\n1.List of the  movies with  rating is 8 or above");
         movies.stream()
         .filter(m -> m.getRating() >= 8)
         .map(m -> m.getTitle())
         .forEach(m -> System.out.println(m));
           
          

        // 2. Find all movies released after the year 2000.
        // Code your solution here
        System.out.println("\n2.List of movies released after the year 2000");

        movies.stream()
        .filter(m -> m.getReleaseYear() > 2000)
        .map(m -> m.getTitle())
        .forEach(m -> System.out.println(m));



        // 3. Get a distinct list of all genres available.
        // Code your solution here
        System.out.println("\n\n3.List of  movies distinct  of all genres available");

        movies.stream()
        .map(m -> m.getGenre())
        .distinct()
        .forEach(m -> System.out.println(m));

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
        System.out.println("\n\n4.List of movies belong to the genre 'Drama'");

        movies.stream()
        .filter(m -> m.getGenre().equals("Drama"))
        .map(m -> m.getTitle())
        .forEach(m -> System.out.println(m));

        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        System.out.println("\n\n5.List of movies grouped by their genre");

       Map <String,List<Movie>> grouped = movies.stream()
                            .collect(Collectors.groupingBy(Movie::getGenre));

        
        System.out.println(grouped);

        // 6. Count how many movies belong to each genre.
        // Code your solution here
        System.out.println("\n\n6.Count's how many movies belong to each genre");

        Map<String ,Long>  count = movies.stream()
                            .collect(Collectors.groupingBy(Movie::getGenre ,Collectors.counting()) );
        
                            System.out.println(count);

        // 7. Find the highest-rated movie.
        // Code your solution here
        System.out.println("\n\n7.Highest-rated movie");

        Movie mo = movies.stream()
                .max(Comparator.comparingDouble(Movie::getRating))
                .orElse(null);
        System.out.println(mo.getTitle());
        System.out.println(mo.getRating());      

        // 8. Get the average rating of all movies.
        // Code your solution here
        System.out.println("\n\n8.Average rating of all movies");

        double avg = movies.stream()
                    .collect(Collectors.averagingDouble(Movie::getRating));
        
        System.out.println(avg);


        // 9. Find the longest movie (by duration).
        // Code your solution here
        System.out.println("\n\n9.The longest movie (by duration)");

        Movie mov = movies.stream()
                    .max(Comparator.comparingInt(Movie::getDuration))
                    .orElse(null);

        System.out.println(mov);
        



        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        System.out.println(" \n\n10.List of movies with a rating between 7 and 9");
        movies.stream()
        .filter(m ->  m.getRating()>= 7 && m.getRating()<= 9 )
        .forEach(m -> System.out.println(m));

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        System.out.println(" \n\n11.List of top 5 highest-rated movies");

        List <Movie> highestRated = movies.stream()
                                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                                .limit(5)
                                .collect(Collectors.toList());

        System.out.println(highestRated);


        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        System.out.println(" \n\n12.any movie has a rating below 5");

        boolean anyMovie = movies.stream()
                            .anyMatch(m -> m.getRating()<5);


         System.out.println(anyMovie);

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        System.out.println(" \n\n13.All movies are rated 6 or above");

        boolean allMovies = movies.stream()
                            .allMatch(m -> m.getRating() >= 6);

             System.out.println(allMovies);

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here

        System.out.println(" \n\n14.Find the movies that belong to more than one genre.");

       List <Movie> movie = movies.stream()
                    .filter(m -> m.getGenre().contains(","))
                    .collect(Collectors.toList());

         System.out.println(movie);           

        // 15. Get the movie with the shortest duration.
        // Code your solution here

        System.out.println(" \n\n15.Movie with the shortest duration");

        Movie shortet = movies.stream()
                        .min(Comparator.comparingDouble(Movie::getDuration))
                        .orElse(null);

        System.out.println(shortet.getTitle());
        System.out.println(shortet.getDuration());               

        // 16. Find the most recent movie released.
        // Code your solution here
        
        System.out.println(" \n\n16.The most recent movie released.");

        Movie recent = movies.stream()
                        .max(Comparator.comparingInt(Movie::getReleaseYear))
                        .orElse(null);

        System.out.println(recent.getTitle());
        System.out.println(recent.getReleaseYear());                

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        
        System.out.println(" \n\n17.The first movie alphabetically by title");

        Movie first = movies.stream()
                    .sorted(Comparator.comparing(Movie::getTitle))
                    .findFirst()
                    .orElse(null);

        System.out.println(first.getTitle());          


        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        System.out.println(" \n\n18.The list of movies sorted by their release year in descending order.");

        List <Movie> releasing = movies.stream()
                                .sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
                                .collect(Collectors.toList());

        System.out.println(releasing);                        
                                



        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here

        System.out.println(" \n\n19.The list of all movie titles in uppercase.");

        List <String> upperCase = movies.stream()
                                .map(m -> m.getTitle().toUpperCase())
                                .collect(Collectors.toList());

        System.out.println(upperCase);

        // 20. Find the total duration of all movies combined.
        // Code your solution here
        System.out.println(" \n\n20.The total duration of all movies");
        
       int totalDuration = movies.stream()
                            .mapToInt(m -> m.getDuration())
                            .sum();

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
