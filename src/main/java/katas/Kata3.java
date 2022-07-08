package katas;

import com.google.common.collect.ImmutableList;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

            List<Integer> listId = movieLists.stream()
//                    funciona para recorrer los diferentes elementos de la lista y aplana los elementos
//                    Aplanar los elementos es volver los elementos a una sola lista sin importar si existen listas combinadas o de 2do orden
                    .flatMap(element -> element.getVideos().stream())
                    .map(movie -> movie.getId())
                    .collect(Collectors.toList());

        System.out.println(listId);
        return listId;
    }
}
