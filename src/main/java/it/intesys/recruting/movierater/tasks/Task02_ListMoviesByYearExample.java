package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.Movie;
import it.intesys.recruting.movierater.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Task02_ListMoviesByYearExample implements Task {

    private final Logger logger = LoggerFactory.getLogger(Task02_ListMoviesByYearExample.class);

    @Override
    public void run() {
        List<Movie> allMovies = MovieRepository.getMovieByYear(1988);


        for (Movie movie : allMovies) {
            logger.info("Found movie {} directed by {} in {}, starring {}",
                    movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getActors());
        }

    }
}
