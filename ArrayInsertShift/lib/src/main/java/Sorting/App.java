package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 1994, List.of("Drama")));
        movies.add(new Movie("Forrest Gump", 1994, List.of("Drama", "Romance")));
        movies.add(new Movie("Pulp Fiction", 1994, List.of("Crime", "Drama")));
        movies.add(new Movie("Avatar", 2009, List.of("Action", "Adventure", "Sci-Fi")));
        movies.add(new Movie("The Godfather", 1972, List.of("Crime", "Drama")));

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie a, Movie b) {
                return b.getYear() - a.getYear();
            }
        });

        System.out.println("Movies sorted by most recent year:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie a, Movie b) {
                String titleA = a.getTitle().replaceAll("^(A |An |The )", "");
                String titleB = b.getTitle().replaceAll("^(A |An |The )", "");
                return titleA.compareTo(titleB);
            }
        });

        System.out.println("\nMovies sorted alphabetically by title (ignoring articles):");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}

