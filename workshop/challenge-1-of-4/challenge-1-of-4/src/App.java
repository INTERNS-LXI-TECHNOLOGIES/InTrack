import com.divisosofttech.Movie;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
        List<Movie> movie = Movie.getMovies();

        // Questions:

        // 1. Get a list of all movies with a rating of 8 or above.
        // Code your solution here
        movie.stream().filter(n -> n.getRating()>=8).collect(Collectors.toList()).forEach(System.out::println);



        // 2. Find all movies released after the year 2000.
        // Code your solution here
        System.out.println("\nAfter 2000");
        List<Movie> after2000 =  movie.stream().filter(n -> n.getReleaseYear()>=2000).collect(Collectors.toList());
        System.out.println(after2000);



        // 3. Get a distinct list of all genres available.
        // Code your solution here

        System.out.println("\ndistinct list");
        movie.stream().map(n->n.getGenre()).distinct().forEach(System.out::println);
        


        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here

        System.out.println("\nDrama");
        movie.stream().filter(n->n.getGenre()=="Drama").forEach(System.out::println);
        


        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here

        System.out.println("\ngenre");
        movie.stream().collect(Collectors.groupingBy(Movie::getGenre)).forEach((genre, movi)->System.out.println(genre+ " "+movi));
        


        // 6. Count how many movies belong to each genre.
        // Code your solution here

        System.out.println("\n movies belong to each genre");
        movie.stream().collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting())).forEach((genre, movi)->System.out.println(genre+ " "+movi));
        //System.out.println(genre);


        // 7. Find the highest-rated movie.
        // Code your solution here

        System.out.println("\nhighest-rated");
        Optional<Movie> highestRated =  movie.stream().max(Comparator.comparing(Movie::getRating));
        System.out.println(highestRated);



        // 8. Get the average rating of all movies.
        // Code your solution here

        System.out.println("\naverage rating");
        double double1 = movie.stream().collect(Collectors.averagingDouble(Movie::getRating));
        System.out.println(double1);



        // 9. Find the longest movie (by duration).
        // Code your solution here

        System.out.println("\nlongest movie ");
        Optional<Movie> longestMovie =  movie.stream().max(Comparator.comparing(Movie::getDuration));
        System.out.println(longestMovie);




        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here

        System.out.println(" \nbetween 7 and 9");
        List<Movie> rating =  movie.stream().filter(n -> n.getRating()>=7).filter(m -> m.getRating()<=9).toList();
        System.out.println(rating);
    
        

        // 11. Get the top 5 highest-rated movies.
        // Code your solution here

        System.out.println("\n 5 highest-rated movies");
        List<Movie> highestRated1 =  movie.stream().sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5).toList();
        System.out.println(highestRated1);


        // 12. Check if any movie has a rating below 5.
        // Code your solution here

        System.out.println("\nrating below 5");
        boolean rating2 =  movie.stream().anyMatch(n -> n.getRating()<=5);
        System.out.println(rating2);


        // 13. Check if all movies are rated 6 or above.
        // Code your solution here

        System.out.println("\nrated 6 or above");
        Boolean rating6 =  movie.stream().allMatch(n->n.getRating()>=6);
        System.out.println(rating6);



        // 14. Find all movies that belong to more than one genre.
        // Code your solution here

        System.out.println("\nmore than one genre");
        List<Movie> genre =  movie.stream().filter(n->n.getGenre().contains(",")).toList();
        System.out.println(genre);




        // 15. Get the movie with the shortest duration.
        // Code your solution here

        System.out.println("\nshortest duration");
        Optional<Movie> shortest =  movie.stream().min(Comparator.comparing(Movie::getDuration));
        System.out.println(shortest);




        // 16. Find the most recent movie released.
        // Code your solution here

        System.out.println("\nmovie released");
        Optional<Movie> released =  movie.stream().max(Comparator.comparing(Movie::getReleaseYear));
        System.out.println(released);




        // 17. Find the first movie alphabetically by title.
        // Code your solution here

        System.out.println("\nalphabetically by title");
        Optional<Movie> alphabetically =  movie.stream().sorted(Comparator.comparing(Movie::getTitle)).findFirst();
        System.out.println(alphabetically);




        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here
        
        System.out.println(" \ndescending order");
        List<Movie> descendingOrder =  movie.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).toList();
        System.out.println(descendingOrder);

        


        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here

        System.out.println(" \ntitles in uppercase");
        movie.stream().map(n -> n.getTitle().toUpperCase()).forEach(System.out::println);
       


        // 20. Find the total duration of all movies combined.
        // Code your solution here

        System.out.println("\nduration of all movies");
        int duration1 =  movie.stream().mapToInt(Movie::getDuration).sum();
        System.out.println(duration1);

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
