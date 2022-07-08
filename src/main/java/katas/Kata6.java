package katas;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();
        String urlMax = movies.stream()
                .map(element -> element.getBoxarts())
                .flatMap(boxArts -> boxArts.stream())
                .reduce((acum, element) -> {
                    if (element.getWidth() * element.getHeight() > acum.getHeight() * acum.getWidth()) {
                        return element;
                    } else {
                        return acum;
                    }
                }).get().getUrl();

        System.out.println(urlMax);
        return urlMax;
    }
}
