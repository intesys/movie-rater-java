package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.Movie;
import it.intesys.recruting.movierater.MovieRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loggare i dettagli di 2 film random presi dal database
 */
public class Task04_RandomMovie {

    private final Logger logger = LoggerFactory.getLogger(Task04_RandomMovie.class);

    private final MovieRepository movieRepository;

    public Task04_RandomMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Pair<Movie, Movie> get2RandomMovies() {
        logger.info("Get 2 random movies");
        // todo
        return null;
    }
}
