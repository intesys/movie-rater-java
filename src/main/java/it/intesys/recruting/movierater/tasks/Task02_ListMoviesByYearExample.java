package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.Movie;
import it.intesys.recruting.movierater.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Task02_ListMoviesByYearExample {

    private final Logger logger = LoggerFactory.getLogger(Task02_ListMoviesByYearExample.class);

    private final MovieRepository movieRepository;

    public Task02_ListMoviesByYearExample(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovieByYear(int year) {
        logger.info("List all movies released in {}", year);
        return movieRepository.getMovieByYear(year);
    }
}
