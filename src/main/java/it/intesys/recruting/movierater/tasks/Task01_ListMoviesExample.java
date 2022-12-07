package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.DatabaseConfig;
import it.intesys.recruting.movierater.Movie;
import it.intesys.recruting.movierater.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Task01_ListMoviesExample implements Task {

    private final Logger logger = LoggerFactory.getLogger(Task01_ListMoviesExample.class);

    @Override
    public void run() {

        DatabaseConfig.initDb();

        List<Movie> allMovies = MovieRepository.getAllMovies();

        for (Movie movie : allMovies) {
            logger.info("Found movie {} directed by {} in {}, starring {}",
                    movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getActors());
        }

    }
}
