import com.divisosofttech.Movie;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        
        // First Set of Solutions
        levelOne() ;


        // Second Set (Optional) for those who are ready to push the limits
        levelTwoOnlyForTheDareDevils();
        
    }





    /**
     * 
     */
    static void levelOne(){
        // Dataset and code can be added here

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
       Movie.getMovies().stream()
       .filter(n->n.getRating()>=8)

       .forEach(n->System.out.println("all movies with a rating of 8 or above"+ n));
    
        
        // 2. Find all movies released after the year 2000.
        // Code your solution here

         Movie.getMovies().stream()
         .filter(n->n.getReleaseYear()>2000)

       .forEach(n->System.out.println("all movies released after the year 2000"+ n));
          

        // 3. Get a distinct list of all genres available.
        // Code your solution here

        Movie.getMovies().stream()
        .distinct()
        .forEach(n->System.out.println("distinct list of all genres available"+ n));



        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here
          
        Movie.getMovies().stream()
        .filter(n->n.getGenre().equals("Drama"))

        .forEach(n->System.out.println("movies that belong to the genre 'Drama'"+ n));

        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here
        Movie.getMovies().stream()
            .collect(Collectors.groupingBy(Movie::getGenre))
            .forEach((g,m)->System.out.println(g+","+m));
            
       



        // 6. Count how many movies belong to each genre.
        // Code your solution here

        Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()))
        . forEach((g,m)->System.out.println(g+","+m));



        // 7. Find the highest-rated movie.
        // Code your solution here
       Movie mov= Movie.getMovies().stream()
         .max(Comparator.comparingDouble(Movie::getRating))
         .orElse(null);
          System.out.println("highest-rated movie"+mov);

        // 8. Get the average rating of all movies.
        // Code your solution here
        Double movie2= Movie.getMovies().stream()
         .collect(Collectors.averagingDouble(Movie::getRating));
          System.out.println("average rating of all movies"+movie2);


        // 9. Find the longest movie (by duration).
        // Code your solution here
        Movie movie3= Movie.getMovies().stream()
        .max(Comparator.comparingInt(Movie::getDuration))
        .orElse(null);
         System.out.println("the longest movie"+movie3);


        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here
        Movie.getMovies().stream()
         .filter(n->n.getRating()>=7 &&n.getRating()<=9)
         
         .forEach(n->System.out.println("all movies with a rating between 7 and 9"+ n));

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here
        Movie.getMovies().stream()
        .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
        .limit(5)
        .forEach(n->System.out.println("5 highest-rated movies"+ n));

        // 12. Check if any movie has a rating below 5.
        // Code your solution here
         boolean b=Movie.getMovies().stream()
        .anyMatch(n->n.getRating()<5);
        
         System.out.println(b);

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here
        boolean c=Movie.getMovies().stream()
        .anyMatch(n->n.getRating()>=6);
        
         System.out.println(c);


        // 14. Find all movies that belong to more than one genre.
        // Code your solution here
        List<Movie> multiGenreMovies = Movie.getMovies().stream()
         .filter(m->m.getGenre().contains(","))
            //.filter(movie -> movie.getGenre().count() > 1) 
            .collect(Collectors.toList()); 
            System.out.println(multiGenreMovies);



        // 15. Get the movie with the shortest duration.
        // Code your solution here
        Movie movie5= Movie.getMovies().stream()
        .min(Comparator.comparingInt(Movie::getDuration))
        .orElse(null);
         System.out.println("the longest movie"+movie5);

        // 16. Find the most recent movie released.
        // Code your solution here
        Movie movie6=Movie.getMovies().stream()
         .max(Comparator.comparingInt(Movie::getReleaseYear))
         .orElse(null);
        System.out.println("recent movie released"+ movie6);

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
       Movie movie7= Movie.getMovies().stream()
          .sorted(Comparator.comparing(Movie::getTitle))
          .findFirst()
          .orElse(null);
			System.out.println("movie alphabetically by title"+movie7.getTitle());


        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
       List< Movie> movie8= Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getTitle).reversed())
        .collect(Collectors.toList());
          System.out.println("movie alphabetically by title"+movie8);

          
        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here
        List<String> mm= Movie.getMovies().stream()
        .map(m -> m.getTitle().toUpperCase())
        .collect(Collectors.toList());
        
        System.out.println("all movie titles in uppercas"+mm);


       

        // 20. Find the total duration of all movies combined.
        // Code your solution here
       int h=Movie.getMovies().stream()
        .mapToInt(m->m.getDuration())
        .sum();
       
        System.out.println("all movie titles in uppercas"+h);

        

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
