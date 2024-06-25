package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
               new Movie("a", 10, Genre.COMEDY ),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.joining(", "))));
        System.out.println(result);


//        var result1 = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.counting()));
//        System.out.println(result1);
//
//        var result = movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.summarizingInt(Movie::getLikes));
//        System.out.println(result);

        // Declarative (Functional) Programming
//        movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();

//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));

//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(list -> System.out.println(list));

//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m.getTitle()));
    }
}
