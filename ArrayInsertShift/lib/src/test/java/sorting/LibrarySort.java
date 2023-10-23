package sorting;

import Sorting.Movie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibrarySort {

    @Test
    public void testSortByMostRecentYear() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avatar", 2009, List.of("Action", "Adventure", "Sci-Fi")));
        movies.add(new Movie("The Godfather", 1972, List.of("Crime", "Drama")));
        movies.add(new Movie("The Shawshank Redemption", 1994, List.of("Drama")));
        movies.add(new Movie("Forrest Gump", 1994, List.of("Drama", "Romance")));
        movies.add(new Movie("Pulp Fiction", 1994, List.of("Crime", "Drama")));

        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie a, Movie b) {
                return b.getYear() - a.getYear();
            }
        });

        List<String> expectedOrder = List.of(
                "Avatar (2009)",
                "The Shawshank Redemption (1994)",
                "Forrest Gump (1994)",
                "Pulp Fiction (1994)",
                "The Godfather (1972)"
        );

        List<String> actualOrder = new ArrayList<>();
        for (Movie movie : movies) {
            actualOrder.add(movie.getTitle() + " (" + movie.getYear() + ")");
        }

        assertEquals(expectedOrder, actualOrder);
    }
}

