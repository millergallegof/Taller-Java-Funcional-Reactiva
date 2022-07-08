package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        List<Map> listNew = movieLists.stream()
                .flatMap(element -> element.getVideos().stream())
                .map(element -> {
                    Date time = element.getInterestingMoments().stream()
                            .filter(p -> p.getType() == "Middle")
                            .map(tim -> tim.getTime())
                            .collect(Collectors.toList())
                            .get(0);
                    String urlMin = element.getBoxarts().stream()
                            .reduce((acum, boxArt) -> {
                                if (boxArt.getWidth() * boxArt.getHeight() > acum.getHeight() * acum.getWidth()) {
                                    return boxArt;
                                } else {
                                    return acum;
                                }
                            }).get().getUrl();

                    return ImmutableMap.of("id", element.getId(), "title", element.getTitle(), "time", time, "url", urlMin);

                })
                .collect(Collectors.toList());

        System.out.println(listNew);
        return listNew;
    }
}
