
    import com.divisosofttech.Movie;
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

            List<String> highRatedMovies = Movie.getMovies().stream().filter(n -> n.getRating() >= 8).map(Movie::getTitle) .collect(Collectors.toList());
        
                    System.out.println("1. Highly rated above 8: "+highRatedMovies);

            // 2. Find all movies released after the year 2000.
            // Code your solution here

            List<String> releasedAfter = Movie.getMovies().stream().filter(n -> n.getReleaseYear() > 2000).map(Movie::getTitle) .collect(Collectors.toList());
        
                    System.out.println("\n2. Movies released after year 2000: "+releasedAfter);

            // 3. Get a distinct list of all genres available.
            // Code your solution here

            List<String> duplicateGenres = Movie.getMovies().stream().map(Movie::getGenre).distinct().collect(Collectors.toList());
            
            System.out.println("\n3. Duplicate generes: "+duplicateGenres);
            // 4. Get a list of movies that belong to the genre 'Drama'.
            // Code your solution here

            List <String> listOfDramas = Movie.getMovies().stream().filter(n -> n.getGenre().equalsIgnoreCase("Drama")).map(Movie::getTitle).collect(Collectors.toList());
            
                System.out.println("\n4. List Dramas: "+listOfDramas);

            // 5. Get a map of all movies grouped by their genre.
            // Code your solution here

            Map<String, List<Movie>> groupingByGenre = Movie.getMovies().stream().collect(Collectors.groupingBy(Movie::getGenre));
            
                System.out.println("\n5. Group by genre: "+groupingByGenre);


            // 6. Count how many movies belong to each genre.
            // Code your solution here
            List<Long> movieByGenreCount = Movie.getMovies().stream()
                                        .map(Movie::getGenre)
                                        .distinct()
                                        .map(n -> Movie.getMovies().stream()
                                        .filter(h -> h.getGenre().equals(n))
                                        .count())
                                        .collect(Collectors.toList());
                System.out.println("\n6. movie by genre: "+movieByGenreCount);


            // 7. Find the highest-rated movie.
            // Code your solution here
            String highestRatedMovie = Movie.getMovies().stream().max((a,b) -> Double.compare(a.getRating(), b.getRating())).map(Movie::getTitle).orElse(null);
                    System.out.println("\n7. Highest rated movie: "+ highestRatedMovie);

            // 8. Get the average rating of all movies.
            // Code your solution here
            Double avgRating = Movie.getMovies().stream().collect(Collectors.averagingDouble(Movie::getRating));
                System.out.println("\n8. average Rating: "+avgRating);


            // 9. Find the longest movie (by duration).
            // Code your solution here

            String longestMovie = Movie.getMovies().stream().max((a,b)-> Integer.compare(a.getDuration(), b.getDuration())).map(Movie::getTitle).orElse(null);
                            System.out.println("\n9. Longest movie: "+longestMovie);

            // 10. Find all movies with a rating between 7 and 9.
            // Code your solution here
            List<String> ratingBtween = Movie.getMovies().stream().filter(n-> n.getRating()>=7 && n.getRating()<=9).map(Movie::getTitle).collect(Collectors.toList());
                    System.out.println("\n10. Rationg btween 7 to 9: "+ratingBtween);

            // 11. Get the top 5 highest-rated movies.
            // Code your solution here
            List<String> topFiveMovies= Movie.getMovies().stream().sorted((a,b)-> Double.compare(a.getRating(), b.getRating())).map(Movie::getTitle).limit(5).collect(Collectors.toList());
                System.out.println("\n11. Top 5 Rated Movies: "+topFiveMovies);

            // 12. Check if any movie has a rating below 5.
            // Code your solution here
            List<String> lowRated = Movie.getMovies().stream().filter(n-> n.getRating()<5).map(Movie::getTitle).collect(Collectors.toList());
                    if(! lowRated.isEmpty()){
                        System.out.println("\n12. Movies Rated Below 5: "+lowRated);
                    }
                    else{
                        System.out.println("\n12. NO Movies Rated Below 5");
                    }

            // 13. Check if all movies are rated 6 or above.
            // Code your solution here
            List<String> ratedAbove = Movie.getMovies().stream().filter(n-> n.getRating()>=6).map(Movie::getTitle).collect(Collectors.toList());
            System.out.println("\n13. Movies Rated Below 5: "+ratedAbove);

            // 14. Find all movies that belong to more than one genre.
            // Code your solution here
            List<String> moreThanOne = Movie.getMovies().stream().filter(n-> n.getGenre().contains(",")).map(Movie::getTitle).collect(Collectors.toList());
              if(!moreThanOne.isEmpty()){
                System.out.println("\n14. More than one Genre: "+moreThanOne);
              }
              else{
                System.out.println("\n14. No Movie More than one Genre");
              }

            // 15. Get the movie with the shortest duration.
            // Code your solution here
                 String shortestMovie = Movie.getMovies().stream().min((a,b)-> Integer.compare(a.getDuration(), b.getDuration())).map(Movie::getTitle).orElse(null);
              System.out.println("\n15. Shortest movie: "+shortestMovie);


            // 16. Find the most recent movie released.
            // Code your solution here
            String recentMovie = Movie.getMovies().stream().max((a,b)-> Integer.compare(a.getReleaseYear(), b.getReleaseYear())).map(Movie::getTitle).orElse(null);
                            System.out.println("\n16. Recent movie Released: "+recentMovie);

                 
            // 17. Find the first movie alphabetically by title.
            // Code your solution here

            String firstAlphabeticalMovie = Movie.getMovies().stream()
                .map(Movie::getTitle)
                .filter(n -> !n.trim().isEmpty())
                .sorted(String::compareToIgnoreCase).findFirst().orElse(null);

              System.out.println("\n17. First movie alphabetically: " + firstAlphabeticalMovie);


            // 18. Get a list of movies sorted by their release year in descending order.
            // Code your solution here
            // 18. Get a list of movies sorted by their release year in descending order.
                List<String> moviesSortedByYear = Movie.getMovies().stream()
                    .sorted((a, b) -> Integer.compare(b.getReleaseYear(), a.getReleaseYear()))
                    .map(Movie::getTitle).collect(Collectors.toList());

                  System.out.println("\n18. Movies sorted by release year (descending): " + moviesSortedByYear);


            // 19. Get a list of all movie titles in uppercase.
            // Code your solution here
            // 19. Get a list of all movie titles in uppercase.
                List<String> upperCase = Movie.getMovies().stream().map(n -> n.getTitle().toUpperCase()).collect(Collectors.toList());

                  System.out.println("\n19. Movie titles in uppercase: " + upperCase);


            // 20. Find the total duration of all movies combined.
            // Code your solution here
            int totalDuration = Movie.getMovies().stream().mapToInt(Movie::getDuration).sum();
             System.out.println("\n20. total duration: "+totalDuration);
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
