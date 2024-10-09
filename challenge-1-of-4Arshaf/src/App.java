import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        List<Movie> rating=Movie.getMovies().stream()
        .filter(n->n.getRating()>8)
        .collect(Collectors.toList());
        System.out.println("1-The list of all movies with a rating of 8 or above is :"+"\n"+"{"); 
        rating.stream().map(Movie::getTitle).forEach(System.out::println);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 2. Find all movies released after the year 2000.
        // Code your solution here

        List<Movie> released=Movie.getMovies().stream()
        .filter(n->n.getReleaseYear()>2000)
        .collect(Collectors.toList());
        System.out.println("2-The movies released after the year 2000 is :"+"\n"+"{"); 
        released.stream().map(Movie::getTitle).forEach(System.out::println);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 3. Get a distinct list of all genres available.
        // Code your solution here

        List<String> genres=Movie.getMovies().stream()
        .map(Movie::getGenre).distinct()
        .collect(Collectors.toList());
        System.out.println("3-The distinct list of all genres available is :"+"\n"+"{");  
        System.out.println(genres);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 4. Get a list of movies that belong to the genre 'Drama'.
        // Code your solution here

        List<Movie> Drama=Movie.getMovies().stream()
        .filter(n->n.getGenre()=="Drama")
        .collect(Collectors.toList());
        System.out.println("4-The list of movies that belong to the genre 'Drama' is :"+"\n"+"{"); 
        System.out.println(Drama);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 5. Get a map of all movies grouped by their genre.
        // Code your solution here

        Map<String, List<Movie>> grouped=Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println("5-The map of all movies grouped by their genre is :"+"\n"+"{"); 
        System.out.println(grouped);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 6. Count how many movies belong to each genre.
        // Code your solution here

        Map<String, Long> belong=Movie.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("6-Count how many movies belong to each genre :"+"\n"+"{"); 
        System.out.println(belong);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 7. Find the highest-rated movie.
        // Code your solution here

         Optional<Movie> rated = Movie.getMovies().stream()
        .max(Comparator.comparingDouble(Movie::getRating));
        System.out.println("7-The highest-rated movie is :"+"\n"+"{"); 
        System.out.println(rated);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        
        // 8. Get the average rating of all movies.
        // Code your solution here

        double average=Movie.getMovies().stream()
        .mapToDouble(Movie::getRating).average()
        .orElse(0.0);
        System.out.println("8-The average rating of all movies is :"+"\n"+"{");  
        System.out.println(average);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 9. Find the longest movie (by duration).
        // Code your solution here

        Optional<Movie> longest = Movie.getMovies().stream()
        .max(Comparator.comparingInt(Movie::getDuration));
        longest.ifPresent(movie -> System.out.println("9-The longest movie (by duration) is :"+"\n"+"{"+"\n"+movie.getTitle()));
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 10. Find all movies with a rating between 7 and 9.
        // Code your solution here

        List<Movie> ratings=Movie.getMovies().stream()
        .filter(movie->movie.getRating() >=7 && movie.getRating() <= 9)
        .collect(Collectors.toList());
        System.out.println("10-The movies with a rating between 7 and 9 is :"+"\n"+"{"); 
        System.out.println(ratings); 
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        // 11. Get the top 5 highest-rated movies.
        // Code your solution here

        List<Movie> highrate=Movie.getMovies().stream()
        .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
        .limit(5)
        .collect(Collectors.toList());
        System.out.println("11-The top 5 highest-rated movies is :"+"\n"+"{");
        System.out.println(highrate); 
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        // 12. Check if any movie has a rating below 5.
        // Code your solution here
        List<Movie> ratingbelow = Movie.getMovies().stream().filter(movie -> movie.getRating() < 5)
        .collect(Collectors.toList());
        System.out.println("12-The movie with below 5 rating is :");
        if (ratingbelow == null) {
            ratingbelow.stream().forEach(System.out::println);
        } else {
            System.out.println("{");
        System.out.println("There is no rating below 5");
        }
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 13. Check if all movies are rated 6 or above.
        // Code your solution here

        List<Movie> ratingSix=Movie.getMovies().stream()
        .filter(movie->movie.getRating() >=6)
        .collect(Collectors.toList());
        System.out.println("13-Movies which has a rating of 6 or above is :"+"\n"+"{"); 
        System.out.println(ratingSix); 
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 14. Find all movies that belong to more than one genre.
        // Code your solution here

        List<Movie> morethanone=Movie.getMovies().stream()
        .filter(movie->movie.getGenre().contains(","))
        .collect(Collectors.toList());
        System.out.println("14-Movies with more than in genre :"+"\n"+"{"); 
        if(!morethanone.isEmpty())
        {
            System.out.println("movies with more than in genre"+"\n"); 
            morethanone.forEach(System.out::println);

        }
        else{
            System.out.println("no movies with more than in genre"+"\n"+"{");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 15. Get the movie with the shortest duration.
        // Code your solution here

        Optional<Movie> shortduration = Movie.getMovies().stream()
        .min(Comparator.comparingInt(Movie::getDuration));
        shortduration.ifPresent(movie -> System.out.println("15-The shortest movie (in duration) is :"+"\n"+"{"+"\n"+movie.getTitle()));
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 16. Find the most recent movie released.
        // Code your solution here

        Optional<Movie> recent = Movie.getMovies().stream()
        .max(Comparator.comparingInt(Movie::getReleaseYear));
        recent.ifPresent(movie -> System.out.println("16-The most recent released movie is :"+"\n"+"{"+"\n"+movie.getTitle()));
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 17. Find the first movie alphabetically by title.
        // Code your solution here
        Optional<Movie> alphabetically = Movie.getMovies().stream()
        .sorted(Comparator.comparing(Movie::getTitle))
        .findFirst();

        alphabetically.ifPresent(
        movie -> System.out.println(
                        "17-The title of movie in alphabetically is : "+"\n"+"{"+"\n"+ movie.getTitle()));
                        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 18. Get a list of movies sorted by their release year in descending order.
        // Code your solution here

        List<Movie> descending =  Movie.getMovies().stream()
        .sorted((m1, m2) -> Integer.compare(m2.getReleaseYear(), m1.getReleaseYear()))
        .collect(Collectors.toList());

        System.out.println("18-Movies sorted by release year Descending order is :"+"\n"+"{");
        descending.forEach(System.out::println);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 19. Get a list of all movie titles in uppercase.
        // Code your solution here

        List<String> uppercase =  Movie.getMovies().stream()
        .map(movie -> movie.getTitle().toUpperCase())
        .collect(Collectors.toList());

        System.out.println("19-The movie titles in uppercase is :"+"\n"+"{");
        uppercase.forEach(System.out::println);
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 20. Find the total duration of all movies combined.
        // Code your solution here

        int totalDuration =  Movie.getMovies().stream()
        .mapToInt(Movie::getDuration)
        .sum();

        System.out.println("20-The total duration of all movies combined is : "+"\n"+"{"+"\n"+ totalDuration + " minutes");
        System.out.println("}"+"\n"+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
