package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.Movie;
import it.intesys.recruting.movierater.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Task01_ListMoviesExample  {

    private final Logger logger = LoggerFactory.getLogger(Task01_ListMoviesExample.class);
    
    private final MovieRepository movieRepository;

    public Task01_ListMoviesExample(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        logger.info("List all movies");
        return movieRepository.getAllMovies();
    }

}
