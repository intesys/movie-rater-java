package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.MovieRepository;
import org.apache.commons.lang3.NotImplementedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loggare il numero totale di film presenti nel database
 */
public class Task03_CountMovies {

    private final Logger logger = LoggerFactory.getLogger(Task03_CountMovies.class);

    private final MovieRepository movieRepository;

    public Task03_CountMovies(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public long countMovies() {
        logger.info("Count all movies");
        // todo
        return -1;
    }
}
