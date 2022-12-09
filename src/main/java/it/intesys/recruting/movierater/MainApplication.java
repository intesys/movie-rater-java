package it.intesys.recruting.movierater;

import it.intesys.recruting.movierater.tasks.Task02_ListMoviesByYearExample;
import it.intesys.recruting.movierater.tasks.Task01_ListMoviesExample;
import it.intesys.recruting.movierater.tasks.Task03_CountMovies;
import it.intesys.recruting.movierater.tasks.Task04_RandomMovie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

    private final static Logger logger = LoggerFactory.getLogger(Task01_ListMoviesExample.class);

    public static void main(String[] args) {

        logger.info("Starting movies application")
        ;
        MovieRepository movieRepository = new MovieRepository(Utils.jdbcTemplate);


        Utils.dropAndInitDb();
        new Task01_ListMoviesExample(movieRepository).getAllMovies();

        Utils.dropAndInitDb();
        new Task02_ListMoviesByYearExample(movieRepository).getMovieByYear(1988);

        Utils.dropAndInitDb();
        new Task03_CountMovies(movieRepository).countMovies();

        Utils.dropAndInitDb();
        new Task04_RandomMovie(movieRepository).get2RandomMovies();
    }
}
