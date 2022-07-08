package katas;

import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.*;
import java.util.stream.Collectors;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(element -> {
                    return ImmutableMap.of("id",element.getId(), "title", element.getTitle());
                })
                .collect(Collectors.toList());
    }
}

