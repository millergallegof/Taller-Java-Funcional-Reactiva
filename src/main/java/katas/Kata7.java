package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        List<Map> listMin = movieLists.stream()
                .flatMap(element -> element.getVideos().stream())
                .map(video -> {
                    String urlMin = video.getBoxarts().stream()
                            .reduce((acum, boxArt) -> {
                                if (boxArt.getWidth() * boxArt.getHeight() > acum.getHeight() * acum.getWidth()) {
                                    return boxArt;
                                } else {
                                    return acum;
                                }
                            }).get().getUrl();
                    return ImmutableMap.of("id", video.getId(), "title", video.getTitle(), "boxart", urlMin);
                })
                .collect(Collectors.toList());
        System.out.println(listMin);
        return listMin;
    }
}
