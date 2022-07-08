package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        Double rankingMax = movies.stream()
                .map(element -> element.getRating())
                .reduce(0.0, (acum, element) -> {
                    if (element > acum) {
                        return element;
                    } else {
                        return acum;
                    }
                });

        System.out.println(rankingMax);

        return rankingMax;
    }
}
